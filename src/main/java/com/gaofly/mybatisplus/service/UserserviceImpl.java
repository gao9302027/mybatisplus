package com.gaofly.mybatisplus.service;

import com.gaofly.mybatisplus.mapper.UserMapper;
import com.gaofly.mybatisplus.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class UserserviceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;




    public List<User> selectByMap() {

        Map<String,Object> map = new HashMap<>();
        map.put("name","johe");
        map.put("age",18);
        List<User> users = userMapper.selectByMap(map);

        return users;
    }
}
