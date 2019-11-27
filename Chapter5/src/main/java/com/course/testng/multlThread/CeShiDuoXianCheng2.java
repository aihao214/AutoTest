package com.course.testng.multlThread;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/26 - 23:21
 */
public class CeShiDuoXianCheng2 {

    @Test
    public void duoXianC3(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        System.out.println("这是duoXianC33333");
    }

    @Test
    public void duoXianC4(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        System.out.println("这是duoXianC44444");
    }

}
