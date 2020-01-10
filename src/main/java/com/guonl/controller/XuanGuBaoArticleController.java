package com.guonl.controller;

import com.guonl.service.IXuanGuBaoArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guonl
 * Date: 2019-12-31 15:41
 * Description: 选股宝文章
 */
@RestController
@RequestMapping("/article")
public class XuanGuBaoArticleController {

    @Autowired
    private IXuanGuBaoArticleService xuanGuBaoArticleService;


    /**
     * 脱水研报：（收费接口）
     * 脱水日报		1
     * 评级日报		2
     * 调研日报		3
     * 强势股脱水	    4
     * 深度个股		5
     */



    /**
     * 脱水日报		1
     * @return
     */
    @GetMapping("/tsrb")
    public ResponseEntity tsrb(){
//        return xuanGuBaoArticleService.tsrb();
        return null;
    }




}
