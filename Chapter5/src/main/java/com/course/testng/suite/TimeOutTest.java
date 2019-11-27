package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/27 - 11:14
 */
public class TimeOutTest {

    @Test(timeOut = 3000)//单位为毫秒
    public void timeOutSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void timeOutFail() throws InterruptedException {
        Thread.sleep(3000);
    }
}
