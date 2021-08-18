package com.imooc;

public class MockDemo {

    public void method1(){
        SomeMethods someMethods = new SomeMethods();
        System.out.println("调用普通方法返回的值：" + someMethods.sayHi("zhj"));
        System.out.println("静态变量a的值：" + SomeMethods.a);
        System.out.println("method1执行结束...");
    }

    public void method2(){
        System.out.println("调用静态方法返回的值：" + SomeMethods.sayHello("zhj"));
        System.out.println("method2执行结束...");
    }
}
