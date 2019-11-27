package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/21 - 17:00
 */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest(String name,int age){
        System.out.printf(" name ：" + name + " ;  age :" + age);
    }
}
