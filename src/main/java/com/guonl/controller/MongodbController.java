package com.guonl.controller;

import com.guonl.model.User;
import com.guonl.service.UserService;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

/**
 * Created by guonl
 * Date: 2019-12-11 15:54
 * Description:
 */
@RestController
@RequestMapping("/mongodb")
public class MongodbController {

    @Autowired
    private UserService userService;


    @GetMapping("/findByName")
    public ResponseEntity findByName(String name) {
        User user = userService.findByName(name);
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.ok("没有结果！");
    }

    @GetMapping("/findAll")
    public ResponseEntity findAll() {
        List<User> users = userService.findAll();
        if (!users.isEmpty()) {
            return ResponseEntity.ok(users);
        }
        return ResponseEntity.ok("没有结果！");
    }

    @GetMapping("/save")
    public ResponseEntity save(String name) {
        User user = new User();
        user.setName(name);
        user.setId(UUID.randomUUID().toString());
        user.setAge(22);
        user.setSex("男");
        User user1 = userService.save(user);
        return ResponseEntity.ok(user1);
    }

    @GetMapping("/update")
    public ResponseEntity update(String oldName,String newName) {
        UpdateResult update = userService.update(oldName,newName);
        return ResponseEntity.ok(update);
    }



    @GetMapping("/script")
    public ResponseEntity script() {
        return userService.script();
    }

    /**************************/

    @GetMapping("/findOne")
    public ResponseEntity findOne(String name) {
        User user = userService.findOne(name);
        if(user != null){
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.ok("没有结果！");
    }

    @GetMapping("/findAll2")
    public ResponseEntity findAll2() {
        List<User> list = userService.findAll2();
        if(!list.isEmpty()){
            return ResponseEntity.ok(list);
        }
        return ResponseEntity.ok("没有结果！");
    }

    @GetMapping("/save2")
    public ResponseEntity save2(String name) {
        User user = new User();
        user.setName(name);
        user.setId(UUID.randomUUID().toString());
        user.setAge(22);
        user.setSex("男");
        User user1 = userService.save2(user);
        return ResponseEntity.ok(user1);
    }

    @GetMapping("/delete")
    public ResponseEntity delete(String name) {
        long count = userService.delete(name);
        return ResponseEntity.ok(count);
    }



//    @GetMapping("/update2")
//    public ResponseEntity update2(String oldName,String newName) {
//        UpdateResult update = userService.update2(oldName,newName);
//        return ResponseEntity.ok(update);
//    }




}
