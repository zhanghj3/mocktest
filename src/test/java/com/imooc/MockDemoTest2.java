package com.imooc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({SomeMethods.class})
public class MockDemoTest2 {

    /**
     * method2方法会调用SomeMethods的静态方法
     */
    @Test
    public void testMethod2(){
        PowerMockito.mockStatic(SomeMethods.class);
        PowerMockito.when(SomeMethods.sayHello(Mockito.anyString())).thenReturn("我是Mock后静态方法的返回值");
        MockDemo mockDemo = new MockDemo();
        mockDemo.method2();
        Assert.assertEquals("","");
    }
}
