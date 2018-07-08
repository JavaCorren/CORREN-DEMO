package com.example.demo.proxy.staticProxy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ZhangGR
 * @created on 2018/5/23
 **/
public class CorrenDaoProxyTest {
    /**
     * @verifies test
     * @see CorrenDaoProxy#love()
     */
    @Test
    public void love_shouldTest() throws Exception {

        CorrenDaoProxy proxy = new CorrenDaoProxy(new CorrenDao());
        proxy.love();

    }
}
