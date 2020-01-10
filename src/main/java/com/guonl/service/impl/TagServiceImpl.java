package com.guonl.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.guonl.mapper.TagPlateMapper;
import com.guonl.mapper.TagPlateStockMapper;
import com.guonl.model.TagPlateStock;
import com.guonl.model.TagPlateWithBLOBs;
import com.guonl.service.ITagService;
import com.guonl.service.IXuanGuBaoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by guonl
 * Date: 2019-12-16 13:51
 * Description:
 */
@Service
public class TagServiceImpl implements ITagService {

    @Autowired
    private TagPlateMapper tagPlateMapper;
    @Autowired
    private TagPlateStockMapper tagPlateStockMapper;
    @Autowired
    private IXuanGuBaoService xuanGuBaoService;

    @Override
    @Transactional
    public ResponseEntity mongoToDb() {
        int count = 0;
        ResponseEntity themeList = xuanGuBaoService.getThemeList();
        JSONObject jsonObject = (JSONObject) themeList.getBody();
        List<Integer> list = (List<Integer>) jsonObject.get("data");
        for (Integer dd : list) {

            JSONObject plateData = (JSONObject) xuanGuBaoService.getThemeById(dd).getBody();
            JSONObject data = plateData.getJSONObject("data");
            Integer plate_id = data.getInteger("id");

            System.out.println("---->当前处理主题编号：" + plate_id);

            String plate_name = data.getString("name");
            String plate_desc = data.getString("desc");
            Integer core_stocks_count = data.getInteger("core_stocks_count");
            String question_answers = "";
            JSONArray questionAnswers = data.getJSONArray("question_answers");
            if(questionAnswers != null){
                question_answers = questionAnswers.toJSONString();
            }

//            if(plate_id != 31113561){
//                continue;
//            }

            //需要将这五个参数作为唯一标识
            //plate_id|plate_name|plate_desc|core_stocks_count|question_answers
            JSONObject hashJson = new JSONObject();
            hashJson.put("plate_id", plate_id);
            hashJson.put("plate_name", plate_name);
            hashJson.put("plate_desc", plate_desc);
            hashJson.put("core_stocks_count", core_stocks_count);
            hashJson.put("question_answers", question_answers);
            int hashCode = hashJson.hashCode();


            //保存主题
            TagPlateWithBLOBs tagPlate = new TagPlateWithBLOBs();
            tagPlate.setPlateId(plate_id);
            tagPlate.setPlateName(plate_name);
            tagPlate.setPlateDesc(plate_desc);
            tagPlate.setQuestionAnswers(question_answers);
            tagPlate.setCoreStocksCount(core_stocks_count);
            tagPlate.setHashCode(hashCode);
            tagPlate.setCreatedAt(new Date());
            tagPlate.setUpdatedAt(new Date());
            tagPlate.setIsDel(Boolean.FALSE);

            //批量更新主题下面包含的股票
            JSONArray jsonArray = data.getJSONArray("stocks");
            List<TagPlateStock> listStock = new ArrayList<>();
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject stockJson = jsonArray.getJSONObject(i);
                TagPlateStock sstock = new TagPlateStock();
                String symbol = stockJson.getString("symbol");
                String stockDesc = stockJson.getString("desc");
                if (StringUtils.isNotBlank(symbol)) {
                    sstock.setPlateId(plate_id);
                    sstock.setPlateName(plate_name);
                    sstock.setStockCode(symbol);
                    sstock.setStockDesc(stockDesc);
                    sstock.setIsShow(1);//显示
                    sstock.setCreatedAt(new Date());
                    sstock.setUpdatedAt(new Date());
                    sstock.setIsDel(Boolean.FALSE);
                    listStock.add(sstock);
                }
            }
            int i = tagPlateStockMapper.batchInsert(listStock);
            tagPlate.setActStocksCount(i);
            int insert = tagPlateMapper.insert(tagPlate);
            count += insert;
        }
        return ResponseEntity.ok("成功同步到mysql的主题为：" + count + "条");
    }
}
