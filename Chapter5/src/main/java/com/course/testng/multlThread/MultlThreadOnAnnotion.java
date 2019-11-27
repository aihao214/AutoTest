package multlThread;

import org.testng.annotations.Test;

/**
 * @author aihao
 * @date 2019/11/26 - 21:56
 */


public class MultlThreadOnAnnotion {

    @Test(invocationCount = 10 ,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n ",Thread.currentThread().getId());
    }

}
