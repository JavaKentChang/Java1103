package com.ocp25_threadpool;

import java.util.concurrent.TimeUnit;


public class Job implements Runnable{

    @Override
    public void run() {
        System.out.println("一般任務工作-Start");
        try {
            TimeUnit.SECONDS.sleep(3); // 相當於 Thread.sleep(5000);
        } catch (Exception e) {
        }
        
        System.out.println("一般工作任務-結束");
        
        
    }
    
}
