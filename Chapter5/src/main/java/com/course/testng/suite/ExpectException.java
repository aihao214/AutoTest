package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/21 - 16:15
 */
public class ExpectException {

    /**
     * 什么时候进行异常测试?
     *在我们期望结果为某一个异常的时候
     *比如：我们传入了某个不合法的参数，程序会抛出异常
     *也就是说我的预期结果就是这个异常
     */

    //这是一个测试结果会失败的异常测试

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFail(){
        System.out.printf("这是一个失败的异常测试");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){

        System.out.printf("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
