package com.example.demo.conf.redis;

import com.example.demo.DemoApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ZhangGR
 * @created on 2018/5/12
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class RedisServiceTest {

    @Autowired
    private RedisService redisService;

    /**
     * @verifies test
     * @see RedisService#lrange(String)
     */
    @Test
    public void lrange_shouldTest() throws Exception {
        redisService.lrange("CORREN")
                .stream()
                .forEach(s -> System.out.println(s));

    }
}
