package com.guonl.service;

import org.springframework.http.ResponseEntity;

/**
 * Created by guonl
 * Date: 2019-12-13 14:37
 * Description:
 */
public interface IXuanGuBaoService {

    ResponseEntity getThemeList();

    ResponseEntity saveThemeDetail();

    ResponseEntity getThemeById(Integer id);

    ResponseEntity syncData();

}
