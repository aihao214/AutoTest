package com.course.testng;

import org.testng.annotations.*;

/**
 * @author aihao
 * @date 2019/11/20 - 17:55
 */
public class BasicAnnotaion {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("这是测试用例2");
    }
    @BeforeMethod   //测试之前运行的标签
    public void beforeMethod(){
        System.out.printf("BeforeMethod这是在测试方法之前运行的方法");
    }

    @AfterMethod    //测试运行之后的标签
    public void afterMethod(){
        System.out.printf("AfterMethod这是在测试方法之后运行的方法");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.printf("BeforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.printf("AfterClass这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforSuite(){
        System.out.printf("beforSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.printf("afterSuite测试套件");
    }

    @BeforeTest
    public void beforTest(){
        System.out.printf("befortest 执行在beforSuite之后beforclass类之前");
    }

    @AfterTest
    public void afterTest(){
        System.out.printf("aftertest 执行在afterSuite之前afterclass类之后");
    }
}
