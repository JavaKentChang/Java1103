
package com.ocp23_cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author MB-study
 */
public class Car implements Runnable{
    private CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }
     @Override
    public void run() {
     String name = Thread.currentThread().getName();
         System.out.printf("%s 從台北出發\n",name);
         try {
             Thread.sleep(new Random().nextInt(5000));
             System.out.printf("%s 到台中ㄌ\n",name);
             cb.await(10,TimeUnit.SECONDS);
             System.out.printf("%s 繼續往高雄前進\n",name);
             Thread.sleep(new Random().nextInt(5000));
         } catch (Exception e) {
             System.out.printf("%s 不耐煩先走ㄌ\n",name);
         }
         System.out.printf("%s 到高雄ㄌ\n",name);
        
    }
    
    
    
}
