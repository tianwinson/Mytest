package com.atguigu.service;

import com.atguigu.entity.Test;

/**
 * Created by Tian on 2017/8/23.
 */
public interface TestService {

    Test checkLogin(String name, String pass);

    boolean register(String name, String pass);
}
