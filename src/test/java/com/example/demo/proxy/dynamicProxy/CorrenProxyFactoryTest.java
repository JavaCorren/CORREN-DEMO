package com.example.demo.proxy.dynamicProxy;

import com.example.demo.proxy.staticProxy.CorrenDao;
import com.example.demo.proxy.staticProxy.ICorrenDao;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author ZhangGR
 * @created on 2018/5/23
 **/
public class CorrenProxyFactoryTest {
    /**
     * @verifies test
     * @see CorrenProxyFactory#getProxyInstance()
     */
    @Test
    public void getProxyInstance_shouldTest() throws Exception {
        CorrenProxyFactory correnProxyFactory = new CorrenProxyFactory(new CorrenDao());
        ICorrenDao correnDao =(ICorrenDao) correnProxyFactory.getProxyInstance();
        correnDao.love();
    }
}
