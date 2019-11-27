package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/27 - 23:09
 */
public class TestReport {

    @Test
    public void test1(){
        System.out.println("这是test1测试用例11111的执行");
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        System.out.println("这是test2测试用例22222的执行");
        String[] a ={"zhangsan","lisi","wangwu"};
        String[] b ={"wangwu","lisi","zhangsan"};
        Assert.assertNotEquals(a,b,"两者相等");
    }

    @Test
    public void test3(){
        System.out.println("这是test3测试用例33333的执行");
        Assert.assertEquals("av","bb");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我自己打印的日志");
        throw new RuntimeException("这是我自己跑出来的异常");
    }
}
