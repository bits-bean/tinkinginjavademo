package com.bugbean.tinkinginjavademo.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-19 15:36
 */
public class Test {
    public static void main(String[] args) {
//        String s = "abc";
//        System.out.println(s.hashCode());
//        s = s.toUpperCase();
//        System.out.println(s.hashCode());

        String s1 = "11111";
        String s2 = "11111" + "11111";
//        String s2 = "";
        String s3 = "1" + "1" + "1" + "1" + "1";
        for (int i = 0; i < 5; i++) {
            s1 += "1";
        }
        System.out.println(s1 == s2);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        List<Integer> subList = list.subList(0, 2);
        System.out.println(subList);
        subList.clear();
        System.out.println(list);
    }

}
