package com.example.demo.conf.rabbitmq.sender;

import com.example.demo.DemoApplication;
import com.example.demo.model.Corren;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ZhangGR
 * @created on 2018/5/13
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class MessageSenderTest {

    @Autowired
    private MessageSender messageSender;

    /**
     * @verifies test
     * @see MessageSender#send(Corren)
     */
    @Test
    public void send_shouldTest() throws Exception {

        Corren corren = new Corren();
        corren.setLove("KateKao");

        messageSender.send(corren);
    }
}
