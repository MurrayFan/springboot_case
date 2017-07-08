package com.cat.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by FMY on 2017/7/6 0006.
 */
@ServletComponentScan //配置Druid的监控页面需要用到的注解
@EnableTransactionManagement //开启事务
@SpringBootApplication
@MapperScan("com.cat.springboot.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
