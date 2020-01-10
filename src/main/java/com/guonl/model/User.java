package com.guonl.model;

import lombok.Data;
import java.io.Serializable;

/**
 * Created by guonl
 * Date: 2019-12-11 15:54
 * Description:
 */
@Data
public class User implements Serializable {

    private String id;

    private String name;

    private Integer age;

    private String sex;



}
