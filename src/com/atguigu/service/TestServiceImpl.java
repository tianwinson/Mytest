package com.atguigu.service;

import com.atguigu.dao.BaseDAO;
import com.atguigu.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tian on 2017/8/23.
 */
@Service
@Scope("prototype")
public class TestServiceImpl implements TestService{

    @Autowired
    private BaseDAO baseDAO;

    @Override
    public Test checkLogin(String author, String title) {

        Test u = new Test();
        u.setAuthor(author);
        u.setTitle(title);
        List tests = baseDAO.find(u);
        if (tests.size() != 0) return (Test) tests.get(0);
        return null;
    }

    @Override
    public boolean register(String author, String title) {

        Test u = new Test();
        u.setAuthor(author);
        u.setTitle(title);
        List tests = baseDAO.find(u);
        return tests.size() == 0 && baseDAO.add(u);
    }



}
