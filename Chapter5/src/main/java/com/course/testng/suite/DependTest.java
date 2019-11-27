package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/21 - 16:40
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.printf("test1 执行");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.printf("test2 执行");
    }
}
