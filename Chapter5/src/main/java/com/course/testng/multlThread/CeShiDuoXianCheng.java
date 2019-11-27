package com.course.testng.multlThread;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/26 - 23:21
 */
public class CeShiDuoXianCheng {

    @Test
    public void duoXianC1(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        System.out.println("这是duoXianC11111");
    }

    @Test
    public void duoXianC2(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        System.out.println("这是duoXianC22222");
    }

}
