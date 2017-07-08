package com.cat.springboot.web.controller;

import com.cat.springboot.entity.User;
import com.cat.springboot.mapper.UserMapper;
import com.cat.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by FMY on 2017/7/6 0006.
 */
@RestController
@EnableAutoConfiguration
public class TestController {
    final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String ttt(Model model) throws SQLException {
        logger.error("这是一个错误");
        userService.testtH();
        return "/index";
    }


}
