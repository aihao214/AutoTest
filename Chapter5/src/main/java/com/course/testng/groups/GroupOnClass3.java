package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/21 - 15:41
 */

@Test(groups = "teacher")
public class GroupOnClass3 {

    public void stu1(){
        System.out.printf("此时运行teacher类的分组GroupOnClass3里边的stu1111的方法");
    }

    public void stu2(){
        System.out.printf("此时运行teacher类的分组GroupOnClass3里边的stu2222的方法");
    }
}
