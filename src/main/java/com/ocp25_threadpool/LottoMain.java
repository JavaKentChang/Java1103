
package com.ocp25_threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LottoMain {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        //ExecutorService exec = Executors.newFixedThreadPool();
        for (int i = 1; i <= 10; i++) {
             exec.submit(new Lotto());        
             System.out.println("執行緒使用量:"+Thread.activeCount());
        }
       exec.shutdown();
        
    }
}
