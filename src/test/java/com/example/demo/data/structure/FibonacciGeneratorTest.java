package com.example.demo.data.structure;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author ZhangGR
 * @created on 2018/6/17
 **/
public class FibonacciGeneratorTest {
    /**
     * @verifies test
     * @see FibonacciGenerator#generateFibonacci(Integer)
     */
    @Test
    public void generateFibonacci_shouldTest() throws Exception {

        List<Integer> integerList = FibonacciGenerator.generateFibonacci(15);

        System.out.println(integerList);



    }
}
