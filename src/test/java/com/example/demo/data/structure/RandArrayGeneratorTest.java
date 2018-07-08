package com.example.demo.data.structure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ZhangGR
 * @created on 2018/7/1
 **/
public class RandArrayGeneratorTest {
    /**
     * @verifies test
     * @see RandArrayGenerator#generate()
     */
    @Test
    public void generate_shouldTest() throws Exception {

        for (int i = 0; i < 1000; i++) {
            System.out.println(RandArrayGenerator.generate());
        }
    }
}
