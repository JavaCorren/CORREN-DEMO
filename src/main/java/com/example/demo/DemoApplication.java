package com.example.demo;

import com.example.demo.conf.rabbitmq.sender.MessageSender;
import com.example.demo.model.Corren;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication{

	@Autowired
	private MessageSender messageSender;

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		MessageSender sender = applicationContext.getBean(MessageSender.class);
		Corren corren = new Corren();
		corren.setLove("Kate Kao");

		sender.send(corren);
	}

}
