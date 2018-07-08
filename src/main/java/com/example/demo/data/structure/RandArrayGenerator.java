package com.example.demo.data.structure;

import java.util.*;

/**
 * Generate Random Integer Array
 *
 * @author ZhangGR
 * @created on 2018/7/1
 **/
public class RandArrayGenerator {

    /**
     * @should test
     * @return
     */
    public static List<Integer> generate() {

        List<Integer> integerList = new ArrayList<>();

        Random random = new Random();

        do {
            Integer rand = random.nextInt(11)+1;
            while (integerList.contains(rand)) {
                rand = random.nextInt(11)+1;
            }
            integerList.add(rand);
        } while (integerList.size() < 5) ;

       return integerList;
    }

}
