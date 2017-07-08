package com.cat.springboot.mapper;

import com.cat.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by FMY on 2017/7/6 0006.
 */
@Mapper
public interface UserMapper {
    List<User> getUserList();

    User getByUserName(String name);

    void updateByUserID(User user);

    void addUser(User user);
}
