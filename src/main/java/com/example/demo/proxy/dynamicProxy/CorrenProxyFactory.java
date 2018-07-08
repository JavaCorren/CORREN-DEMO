package com.example.demo.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZhangGR
 * @created on 2018/5/23
 **/
public class CorrenProxyFactory {

    private Object target;

    public CorrenProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * @should test
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("I met Kate nearby the Wong Tai Sim metro station on the morning of Dec. 30th, 2017");
                Object value = method.invoke(target, args);
                System.out.println("I have fallen in deep love with her! I must work hard to be able to live her a quality life!");
                return value;
            }
        });
    }

}
