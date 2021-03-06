
package com.ocp25_threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class JobMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.submit(new ShortJob());
        service.submit(new Job());
        service.submit(new ShortJob());
        service.submit(new LongJob());
        service.submit(new ShortJob());
        
        service.shutdown();
        System.out.println("shutdown.....");
        //監測執行緒的執行狀況
        while (!service.awaitTermination(1,TimeUnit.SECONDS)){            
            System.out.println("還有執行緒正在執行任務"+Thread.activeCount());
        }
        System.out.println("Close......所有工作都已經結束");
    }
}
