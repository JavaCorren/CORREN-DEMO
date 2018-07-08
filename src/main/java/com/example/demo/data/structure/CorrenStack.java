package com.example.demo.data.structure;

import lombok.Data;

/**
 * 栈数据结构实现
 *
 * @author ZhangGR
 * @created on 2018/5/20
 **/
@Data
public class CorrenStack {

    //栈大小
    private int size;

    //栈数组容器
    private Object[] array;

    //栈尾指针
    private int tail;

    //元素个数
    private int count;


    public CorrenStack(int size) {
        this.size = size;
        this.array = new Object[size];
    }

    /**
     * 判断栈是否已满
     * @return
     */
    public boolean isFull() {
        return tail == size - 1;
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty() {
        return array.length == 0;
    }

    /**
     * 压入元素
     * @param o
     * @return
     */
    public boolean push (Object o) {

        if (tail == size) {
            return false;
        }

        if (count == 0) {
            array[tail] = o;
        } else {
            array[++tail] = o;
        }

        count++;

        return true;
    }

    /**
     * 弹出栈顶元素
     * @return
     * @should test
     */
    public Object pop () {

        if (isEmpty()) {
            return null;
        }

        Object target = array[tail];
        array[tail--] = null;

        return target;
    }

    public void display() {

        for (int i = 0; i<array.length; i++) {
            System.out.println("index: "+i+", value: "+array[i]+";");
        }
    }

}
