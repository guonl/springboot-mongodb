package com.guonl.service;

import com.guonl.model.User;
import com.mongodb.client.result.UpdateResult;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by guonl
 * Date: 2019-12-11 15:59
 * Description:
 */
public interface UserService {

    User findByName(String name);

    List<User> findAll();

    User save(User user);

    UpdateResult update(String oldName,String newName);

    ResponseEntity script();

    /*******************/

    User findOne(String name);

    List<User> findAll2();


    User save2(User user);

    long delete(String name);
}
