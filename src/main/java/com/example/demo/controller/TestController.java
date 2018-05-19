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

    @RequestMapping("/uberEat")
    public String UBEREAT() {
        log.warn("UBEREAT");
        return "I have a discount coupon for 30 AUD!, I can have so much for free!";
    }

    @RequestMapping("/love")
    public String love() {
        log.warn("love");
        return "My boyfriend is Corren Cheung! He's gonna marry me after my graduation from ANU!";
    }

    @RequestMapping("/trip")
    public String trip() {
        log.warn("trip");
        return "I am going to Shanghai with my boyfriend accompanied by mom and granny.";
    }

    @RequestMapping("/aqi")
    public String aqi() {
        log.warn("aqi");
        return "I am AQI!!!";
    }

    @RequestMapping("/aqi2")
    public String aqi2() {
        log.warn("aqi2");
        return "I am AQI2!!!";
    }

}
