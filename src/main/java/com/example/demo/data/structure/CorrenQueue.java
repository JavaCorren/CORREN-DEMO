package com.example.demo.data.structure;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * FIFO队列
 *
 * @author ZhangGR
 * @created on 2018/5/20
 **/
@Slf4j
@Data
public class CorrenQueue {

    //队列容器
    private int[] array;

    //队列元素容量
    private int count;

    //队列头部指针
    private int start;

    //队列尾部指针
    private int end;

    //队列元素数量
    private int size;

    public CorrenQueue(int size) {
        this.size = size;
        array = new int[size];
    }

    /**
     * 插入元素（只有队列尾部指针会变化）
     * @param target
     * @return
     * @should test
     */
    public boolean push(int target) {

        if (count == size) {
            log.warn("The queue reached capacity limit already!");
            return false;
        }

        if (count == 0) {
             array[end] = target;
        } else {
            if (end == size - 1) {
                end = 0;
                array[end] = target;
            } else {
                array[++end] = target;
            }
        }



        count++;
        return true;
    }

    /**
     * 弹出队头元素（只有头部指针会变化）
     * @return
     */
    public int pop() {

        if (count == 0) {
            throw new RuntimeException("The queue is empty, hence nothing can be popped out");
        }

        int result;

        result = array[start];
        array[start] = 0;

        if (start == size - 1) {
            start = 0;
        } else {
            start++;
        }

        count--;
        return result;
    }

    /**
     * 遍历当前队列元素
     */
    public void display() {

        if (count == 0) {
            log.warn("The queue is empty");
        }

        //队列头指针小于尾指针
        if (start <= end) {
            for (int i = start; i <= end; i++) {

                if (i == start) {
                    System.out.println("队头元素：" + array[start]);
                    if (count == 1) {
                        System.out.println("元素只有一个：" + array[start]);
                    }
                    continue;
                }

                if (i == end) {
                    System.out.println("队尾元素："+ array[end]);
                    continue;
                }

                System.out.println("中间元素："+ array[i]);
            }
        }

        //队列头指针大于尾指针
        if (start > end) {

            for (int i = start; i <= size+end; i++) {

                int j ;

                if (i > size -1) {
                    j = i - size;
                } else {
                    j = i;
                }

                if (j == start) {
                    System.out.println("队头元素：" + array[start]);
                    continue;
                }

                if (j == end) {
                    System.out.println("队尾元素："+ array[end]);
                    continue;
                }

                System.out.println("中间元素："+ array[j]);

            }
        }

    }

}
