package com.gaofly.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gaofly.mybatisplus.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Override
    User selectById(Serializable serializable);

    @Override
    List<User> selectByMap(Map<String, Object> map);
}
