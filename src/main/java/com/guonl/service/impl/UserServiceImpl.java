package com.guonl.service.impl;

import com.guonl.dao.UserDao;
import com.guonl.model.User;
import com.guonl.service.UserService;
import com.mongodb.WriteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ScriptOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guonl
 * Date: 2019-12-11 16:00
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Value("${spring.data.mongodb.database}")
    private String dbName;

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private UserDao userDao;

    @Override
    public User findByName(String name) {
        return userDao.findByname(name);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User save(User user) {
        return userDao.insert(user);
    }

    @Override
    public UpdateResult update(String oldName, String newName) {
        Update update = new Update();
        update.set("name", newName);
        Query query = new Query(Criteria.where("name").is(oldName));
        UpdateResult updateResult = mongoTemplate.updateFirst(query, update, User.class);
        return updateResult;
    }

    /**
     * 这种方式的4.0以后的不支持
     *
     * @return
     */
    @Override
    public ResponseEntity script() {
        ScriptOperations scriptOps = mongoTemplate.scriptOps();
        //执行服务器端脚本
        Object call = scriptOps.call("guonl", "abc", "123");
        return ResponseEntity.ok(call);
    }

    /***************************/

    @Override
    public User findOne(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));
        User user = mongoTemplate.findOne(query, User.class,"guonl");
        return user;
    }

    @Override
    public List<User> findAll2() {
        Query query = new Query();
        List<User> list = mongoTemplate.findAll(User.class,"guonl");
        return list;
    }

    @Override
    public User save2(User user) {
        User user1 = mongoTemplate.insert(user,"guonl");
        return user1;
    }

    @Override
    public long delete(String name) {
        Query query = Query.query(Criteria.where("name").is(name));
        Update update = new Update();
        update.unset("users.$");
        UpdateResult upsert = mongoTemplate.updateFirst(query, update,dbName);
        return upsert.getModifiedCount();
    }




}
