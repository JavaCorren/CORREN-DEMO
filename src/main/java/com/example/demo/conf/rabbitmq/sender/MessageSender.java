package com.example.demo.conf.rabbitmq.sender;

import com.example.demo.conf.rabbitmq.QueueName;
import com.example.demo.model.Corren;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Messge Sender
 *
 * @author ZhangGR
 * @created on 2018/5/13
 **/
@Slf4j
@Service
public class MessageSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * @should test
     * @param
     */
    public void send(Corren corren) {
        this.amqpTemplate.convertAndSend(QueueName.CORREN,corren);
        log.info("Queue:"+QueueName.CORREN+ "Msg:" +corren.toString());
    }
}
