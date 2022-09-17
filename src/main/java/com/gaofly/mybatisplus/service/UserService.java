package com.gaofly.mybatisplus.service;

import com.gaofly.mybatisplus.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface UserService {

//    List<User> selectByMap(Map<String, Object> map);
    public List<User> selectByMap();
}
