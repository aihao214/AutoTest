package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/21 - 11:48
 */
public class IgoneTest {

    @Test
    public void igoreTest1(){
        System.out.printf("igore1 执行");
    }

    @Test(enabled = false) //test通过enabled这个标签来控制用例是否执行
    public void igoreTest2(){
        System.out.printf("igore2 执行");
    }

    @Test(enabled = true)
    public void igoreTest3(){
        System.out.printf("igore3 执行");
    }
}
