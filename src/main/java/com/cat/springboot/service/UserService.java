package com.cat.springboot.service;

import com.cat.springboot.entity.User;
import com.cat.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * Created by FMY on 2017/7/7 0007.
 */
@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void testtH() throws SQLException {
        User user = new User("007", "1234", "333", 1);
        user.setId(1);
        userMapper.addUser(user);
        if (1 == 1) {

            throw new NullPointerException();
        }
        userMapper.updateByUserID(user);
    }
}
