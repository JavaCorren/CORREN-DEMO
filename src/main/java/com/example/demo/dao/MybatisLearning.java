package com.example.demo.dao;

import org.apache.ibatis.io.Resources;

import java.io.IOException;

/**
 * mybatis学习类
 *
 * @author ZhangGR
 * @created on 2018/5/11
 **/
public class MybatisLearning {

    public static void main(String[] args) throws IOException {
        Resources.getResourceAsStream("mybatis-config.xml");
    }
}
