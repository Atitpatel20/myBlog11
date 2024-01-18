package com.myblog.myblog;

public class DebugClass {
    public static void main(String[] args) {
//        DebugClass debugClass= new DebugClass();
//        int val = debugClass.test();
//        System.out.println(val);
//    }
//    public int test(){
//        int x=100;
//        return x*x;

        DebugClass debugClass= new DebugClass();
        int val = debugClass.test();
        System.out.println(val);
    }
    public int test(){
        int otp = SampleTest.test1();
        return otp;
    }
}
