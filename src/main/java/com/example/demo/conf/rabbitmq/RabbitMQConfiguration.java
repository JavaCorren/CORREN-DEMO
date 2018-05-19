package com.example.demo.conf.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ Configuration
 *
 * @author ZhangGR
 * @created on 2018/5/13
 **/
@Configuration
public class RabbitMQConfiguration {


    @Bean
    public Queue queue() {
       return new Queue(QueueName.CORREN);
    }

}
