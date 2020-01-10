package com.guonl.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.guonl.service.IXuanGuBaoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by guonl
 * Date: 2019-12-13 14:38
 * Description:
 */
@Slf4j
@Service
public class XuanGuBaoServiceImpl implements IXuanGuBaoService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private MongoTemplate mongoTemplate;

    //获取所有版块id  主题list
    private static final String PLATE_RANK_URL = "https://flash-api.xuangubao.cn/api/plate/rank?field=core_avg_pcp&type=0";
    //主题版块详情
    private static final String PLATE_DETAIL_URL = "https://flash-api.xuangubao.cn/api/plate/plate_set?display_premium_stock=true&id=";
    //个股下面包含的主题
    private static final String STOCK_PLATE_URL = "https://flash-api.xuangubao.cn/api/stage2/plates_by_any_stock?fields=core_avg_pcp,plate_name&symbol=600198.SS";

    @Override
    public ResponseEntity getThemeList() {
        JSONObject forObject = restTemplate.getForObject(PLATE_RANK_URL, JSONObject.class);
        JSONObject json = mongoTemplate.insert(forObject, "plate_list");
        return ResponseEntity.ok(json);
    }

    @Override
    public ResponseEntity saveThemeDetail() {
        long start = System.currentTimeMillis();
        List<JSONObject> list = mongoTemplate.findAll(JSONObject.class, "plate_list");
        if (!list.isEmpty()) {
            JSONObject jsonObject = list.get(0);
            List data = jsonObject.getObject("data", List.class);
            int count = 0;
            for (int i = 0; i < data.size(); i++) {
                //先查询是否存在
                Object id = data.get(i);
                Query query = new Query();
                query.addCriteria(Criteria.where("plate_id").is(id));
                JSONObject plate_detail = mongoTemplate.findOne(query, JSONObject.class, "plate_detail");
                if(plate_detail != null){
                    continue;
                }
                System.out.println("---->>>当前执行第" + (i+1) + "条" + ",当前id为：" + id);
                JSONObject forObject = restTemplate.getForObject(PLATE_DETAIL_URL + id, JSONObject.class);
                forObject.put("plate_id", id);
                try {
                    mongoTemplate.insert(forObject, "plate_detail");
                    //为了防止被封，每次请求等待时间随机5~9秒
//                    int min = 1, max = 4;
//                    int num = (int) (Math.random() * (max - min) + min);
                    Thread.sleep(1 * 1000);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("---->>>保存主题详情报错，id为：" + id);
                }
                count = i;
            }
            long end = System.currentTimeMillis();
            return ResponseEntity.ok("一共保存了 " + (count+1) + " 条，共耗时：" + (end - start) / 1000 + " 秒");
        }
        return ResponseEntity.ok(list);
    }

    @Override
    public ResponseEntity getThemeById(Integer id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("plate_id").is(id));
        JSONObject plate_detail = mongoTemplate.findOne(query, JSONObject.class, "plate_detail");
        int code = plate_detail.hashCode();
        return ResponseEntity.ok(plate_detail);
    }


    @Override
    public ResponseEntity syncData() {
        //先初始化
        getThemeList();
        ResponseEntity responseEntity = saveThemeDetail();
        return responseEntity;
    }
}
