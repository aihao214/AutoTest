package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/21 - 15:41
 */

@Test(groups = "student")
public class GroupOnClass2 {

    public void stu1(){
        System.out.printf("此时运行student类的分组GroupOnClass2里边的stu1111的方法");
    }

    public void stu2(){
        System.out.printf("此时运行student类的分组GroupOnClass2里边的stu2222的方法");
    }
}
