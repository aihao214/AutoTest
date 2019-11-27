package com.course.testng.multlThread;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/26 - 22:18
 */
public class MultlThreadOnXML {

    @Test
    public void test1(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        System.out.println("这是test11111");
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        System.out.println("这是test22222");
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        System.out.println("这是test33333");
    }
}
