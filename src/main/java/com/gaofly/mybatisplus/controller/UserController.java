package com.gaofly.mybatisplus.controller;


import com.gaofly.mybatisplus.pojo.User;
import com.gaofly.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/user")
    public List<User> userTest(){
        List<User> users = userService.selectByMap();



        return users;
    }


}
