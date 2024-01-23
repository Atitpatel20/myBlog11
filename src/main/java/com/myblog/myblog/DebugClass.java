package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DebugClass {
    public static void main(String[] args) {
//        DebugClass debugClass= new DebugClass();
//        int val = debugClass.test();
//        System.out.println(val);
//    }
//    public int test(){
//        int x=100;
//        return x*x;

//        DebugClass debugClass= new DebugClass();
//        int val = debugClass.test();
//        System.out.println(val);
//    }
//    public int test(){
//        int otp = SampleTest.test1();
//        return otp;

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

        List<Integer> data1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4, 6, 3, 8, 9, 10);
        List<Integer> collect = data1.stream().filter(s -> s % 2 == 0).distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("Hello new");
        System.out.println("nvhhr");
        System.out.println("2445");

    }
}
