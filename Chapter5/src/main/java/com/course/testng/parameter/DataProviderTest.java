package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author aihao
 * @date 2019/11/26 - 17:08
 */
public class DataProviderTest {

    @Test(dataProvider = "Protest")
    public void dataProviderTest(String name,int age){
        System.out.printf("name = " + name +"; age = "+age);
    }

    @DataProvider(name = "Protest")
    public Object[][] providerTest(){
        Object[][] o = new Object[][]{
                {"zhangsan",20},{"lisi,",25},{"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.printf("这是test1方法 ：name = " + name +"; age = "+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.printf("这是test2方法 ：name = " + name +"; age = "+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] dataProviderMethod(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{{"zhangsan",21},{"lisi",26}};
        }else if (method.getName().equals("test2")){
            result = new Object[][]{{"wangwu",31},{"liuniu",36}};
        }
        return result;
    }
}
