package com.example.demo.data.structure;

import org.junit.Test;

/**
 * @author ZhangGR
 * @created on 2018/5/20
 **/
public class CorrenQueueTest {
    /**
     * @verifies test
     * @see CorrenQueue#push(int)
     */
    @Test
    public void push_shouldTest() throws Exception {
        CorrenQueue queue = new CorrenQueue(5);

        System.out.println("CorrenQueue实例添加元素是否成功："+queue.push(10));
        System.out.println("CorrenQueue实例添加元素是否成功："+queue.push(20));
        System.out.println("CorrenQueue实例添加元素是否成功："+queue.push(30));
        System.out.println("CorrenQueue实例添加元素是否成功："+queue.push(40));
        System.out.println("CorrenQueue实例添加元素是否成功："+queue.push(50));
        System.out.println("CorrenQueue实例添加元素是否成功："+queue.push(60));

        queue.display();

        System.out.println("CorrenQueue实例弹出元素：" + queue.pop());
        System.out.println("CorrenQueue实例弹出元素：" + queue.pop());
        System.out.println("CorrenQueue实例添加元素是否成功："+queue.push(60));

        queue.display();

        System.out.println("CorrenQueue实例弹出元素：" + queue.pop());
        System.out.println("CorrenQueue实例弹出元素：" + queue.pop());
        System.out.println("CorrenQueue实例弹出元素：" + queue.pop());

        queue.display();
    }
}
