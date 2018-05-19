package com.example.demo.conf.rabbitmq.consumer;

import com.example.demo.conf.rabbitmq.QueueName;
import com.example.demo.model.Corren;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import reactor.util.concurrent.Queues;

/**
 * MessageConsumer
 *
 * @author ZhangGR
 * @created on 2018/5/13
 **/
@Slf4j
@Service
public class MessageConsumer {

    @RabbitListener(queues = QueueName.CORREN)
    @RabbitHandler
    public void consumeCorren(Corren corren) {
        log.info("msg detected:" + corren.getLove());
    }

}
