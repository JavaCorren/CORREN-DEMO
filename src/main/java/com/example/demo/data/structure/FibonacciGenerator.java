package com.example.demo.data.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * test fibonacci
 *
 * @author ZhangGR
 * @created on 2018/6/17
 **/
public class FibonacciGenerator {

    /**
     * 斐波纳妾数列生成器
     * @param max
     * @return
     * @should test
     */
    public static List<Integer> generateFibonacci(Integer max) {

        List<Integer> integerList = new ArrayList<>();

        int a = 0;
        int b = 1;

        int i = 0;
        while(i < max) {
            integerList.add(b);
            int next = a+b;
            a = b;
            b = next;
            i++;
        }
        return integerList;
    }


}
