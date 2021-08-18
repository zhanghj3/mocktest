package com.imooc;


public class SomeMethods {

    public static String a = "我是静态变量";
    static{
        System.out.println("执行静态块...");
    }
    public static String sayHello(String name){
        System.out.println("执行静态方法...");
        return "Hello！ " + name;
    }
    public String sayHi(String name){
        System.out.println("执行普通方法...");
        return "Hi！ " + name;
    }

}
