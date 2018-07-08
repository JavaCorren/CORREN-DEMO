package com.example.demo.data.structure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ZhangGR
 * @created on 2018/5/19
 **/
public class BiDirectionalLinkedArrayTest {

    /**
     * @verifies test
     * @see BiDirectionalLinkedArray#get(int)
     */
    @Test
    public void get_shouldTest1() throws Exception {

        BiDirectionalLinkedArray<Integer> integerBiDirectionalLinkedArray = new BiDirectionalLinkedArray(1);
        integerBiDirectionalLinkedArray.append(3);
        integerBiDirectionalLinkedArray.append(9);
        integerBiDirectionalLinkedArray.append(6);
        integerBiDirectionalLinkedArray.append(2);

        System.out.println(integerBiDirectionalLinkedArray.size());
        System.out.println(integerBiDirectionalLinkedArray.get(1).getT());
        System.out.println(integerBiDirectionalLinkedArray.get(3).getT());
        System.out.println(integerBiDirectionalLinkedArray.get(2).getT());
    }

    /**
     * @verifies test
     * @see BiDirectionalLinkedArray#get(int)
     */
    @Test
    public void get_shouldTest2() throws Exception {

        BiDirectionalLinkedArray<Integer> integerBiDirectionalLinkedArray = new BiDirectionalLinkedArray(1);
        integerBiDirectionalLinkedArray.append(6);
        integerBiDirectionalLinkedArray.append(2);

        integerBiDirectionalLinkedArray.insert(3,1);

        System.out.println(integerBiDirectionalLinkedArray.get(2));

    }
}
