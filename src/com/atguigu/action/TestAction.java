package com.atguigu.action;

import com.atguigu.entity.Test;
import com.atguigu.service.TestService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;

/**
 * Created by Tian on 2017/8/23.
 */
@Controller
@Scope("prototype")
public class TestAction extends  ActionSupport {

    @Autowired
    private TestService testService;

    private String username;
    private String userpwd;

    public String login(){
        Test test = testService.checkLogin(username, userpwd);

        if(test!= null) return SUCCESS;
        return ERROR;
    }

    public String register(){
        if (testService.register(username, userpwd)) return SUCCESS;
        return ERROR;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
}



