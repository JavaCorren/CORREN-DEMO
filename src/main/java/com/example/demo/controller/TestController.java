package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类Controller
 *
 * @author ZhangGR
 * @created on 2018/5/5
 **/
@Slf4j
@RequestMapping("/kate")
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        log.warn("hello!");
        return "I am your smart sweetie, Kate KAO!";
    }

    @RequestMapping("/attention")
    public String attention() {
        log.warn("attention");
        return "I am sorry. I am used to being absent-minded. It's really hard for me to focus.";
    }

    @RequestMapping("/food")
    public String favoriteFood() {
        log.warn("food");
        return "You just have memorize the few things I hate, since I am such a foodie.";
    }

    @RequestMapping("/gender")
    public String gender() {
        log.warn("gender");
        return "I am a clever girl";

    }
}
