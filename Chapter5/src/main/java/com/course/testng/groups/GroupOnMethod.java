package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/21 - 12:09
 */
public class GroupOnMethod {

    @Test(groups = "server") //对方法分组使用的是test里的groups标签，标签上通过name属性命名区分
    public void test1(){
        System.out.printf("这是服务端的测试方法1111111111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.printf("这是服务端的测试方法222222222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.printf("这是客户端的测试方法333333333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.printf("这是客户端的测试方法444444444");
    }

    @BeforeGroups("server")//分组执行的方法，要加上括号组名
    public void beforGroupOnServer(){
        System.out.printf("这是在服务端运行前的方法");
    }

    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.printf("这是在服务端运行后的方法！！！！！！！！");
    }

    @BeforeGroups("client")
    public void beforGroupOnClient(){
        System.out.printf("这是在客户端运行前的方法");
    }

    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.printf("这是在客户端运行后的方法！！！！！！！！");
    }
}
