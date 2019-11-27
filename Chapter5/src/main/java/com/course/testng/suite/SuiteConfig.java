package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author aihao
 * @date 2019/11/20 - 18:45
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforSuite(){

        System.out.printf("before suite运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.printf("after suite运行啦");
    }

    @BeforeTest
    public void beforTest(){
        System.out.printf("before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.printf("after test");
    }
}
