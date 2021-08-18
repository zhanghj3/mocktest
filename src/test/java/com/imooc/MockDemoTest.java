package com.imooc;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MockDemoTest {

    @Before
    public void init(){
        new MockUp<SomeMethods>(SomeMethods.class){
            /**
             * clinit是jvm用来初始化静态变量和静态块的方法
             */
            @Mock
            void $clinit() {
                System.out.println("MockUp代替静态执行...");
                SomeMethods.a = "我是Mock之后的静态变量";
            }
            @Mock
            public String sayHi(String name){
                System.out.println("执行Mock的普通方法...");
                return "Mock！ " + name;
            }
        };
    }

    /**
     * method1方法会执行SomeMethods的静态块，也会加载静态变量
     */
    @Test
    public void testMethod1(){
        MockDemo mockDemo = new MockDemo();
        mockDemo.method1();
        Assert.assertEquals("","");
    }

}
