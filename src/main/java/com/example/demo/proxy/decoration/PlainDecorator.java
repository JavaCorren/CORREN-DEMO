package com.example.demo.proxy.decoration;

/**
 * 普通装饰实现类
 *
 * @author ZhangGR
 * @created on 2018/6/10
 **/
public class PlainDecorator implements Decorator {
    @Override
    public void display() {
        //普通装饰实现类
        System.out.println("普通装饰实现类");
    }
}
