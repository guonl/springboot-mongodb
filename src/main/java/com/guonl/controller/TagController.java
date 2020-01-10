package com.guonl.controller;

import com.guonl.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by guonl
 * Date: 2019-12-16 13:49
 * Description:
 */
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private ITagService tagService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/mongoToDb")
    public ResponseEntity mongoToDb() {
        ResponseEntity response = tagService.mongoToDb();
        return response;
    }

    @GetMapping("/testLogin")
    public ResponseEntity testLogin() {
        String url = "http://localhost/admin/dialog/getDialog";
        String login = "";
        for (int i = 0; i < 10; i++) {
            login = restTemplate.getForObject(url, String.class);
        }
        return ResponseEntity.ok(login);
    }




}
