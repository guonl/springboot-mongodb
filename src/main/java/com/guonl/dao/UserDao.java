package com.guonl.dao;

import com.guonl.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Created by guonl
 * Date: 2019-12-11 16:20
 * Description:
 */
public interface UserDao extends MongoRepository<User,String> {

    @Query("{'name':'?0'}")
    User findByname(String name);
}
