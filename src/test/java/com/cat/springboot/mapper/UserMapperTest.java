package com.cat.springboot.mapper;

import com.cat.springboot.Application;
import com.cat.springboot.entity.User;
import com.cat.springboot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by FMY on 2017/7/6 0006.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = "test")
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestgetAll() {

        List<User> all = userMapper.getUserList();

        System.out.println(all);
    }

}