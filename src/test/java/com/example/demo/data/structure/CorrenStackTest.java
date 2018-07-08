package com.example.demo.data.structure;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * @author ZhangGR
 * @created on 2018/5/20
 **/
public class CorrenStackTest {

    /**
     * @verifies test
     * @see CorrenStack#(Object)
     */
    @Test
    public void pop_shouldTest() throws Exception {
        CorrenStack correnStack = new CorrenStack(5);
        correnStack.push(1);
        correnStack.push(2);
        correnStack.push(3);
        correnStack.push(4);
        correnStack.push(5);

        System.out.println("栈是否已满："+correnStack.isFull());
        System.out.println("遍历栈元素：");
        correnStack.display();

        System.out.println("弹出元素："+correnStack.pop());
        System.out.println("遍历栈元素：");
        correnStack.display();


        System.out.println("弹出元素：" +correnStack.pop());
        System.out.println("弹出元素：" +correnStack.pop());
        correnStack.display();
    }

    @Test
    public void test() {
        Random random = new Random(31);
        while(true) {
            System.out.println(random.nextInt(11) + 1);
        }
    }
}
