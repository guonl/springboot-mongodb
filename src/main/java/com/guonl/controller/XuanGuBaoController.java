package com.guonl.controller;

import com.guonl.service.IXuanGuBaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guonl
 * Date: 2019-12-13 14:36
 * Description:
 */
@RestController
@RequestMapping("/stock")
public class XuanGuBaoController {

    @Autowired
    private IXuanGuBaoService xuanGuBaoService;

    @GetMapping("/getThemeList")
    public ResponseEntity getThemeList(){
        return xuanGuBaoService.getThemeList();
    }

    @GetMapping("/saveThemeDetail")
    public ResponseEntity saveThemeDetail(){
        return xuanGuBaoService.saveThemeDetail();
    }

    @GetMapping("/getThemeById")
    public ResponseEntity getThemeById(Integer id){
        return xuanGuBaoService.getThemeById(id);
    }

    /**
     * 数据同步
     * @return
     */
    @GetMapping("/syncData")
    public ResponseEntity syncData(){
        return xuanGuBaoService.syncData();
    }




}
