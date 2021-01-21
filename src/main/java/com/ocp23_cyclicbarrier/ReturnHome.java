
package com.ocp23_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;


public class ReturnHome {
    public static void main(String[] args) {
        int n = 3; //現在有三台車;
        Runnable lunch = () -> System.out.println("吃午餐");
        CyclicBarrier cb = new CyclicBarrier(n,lunch);
        for (int i = 1; i <=4; i++) {
            Car car = new Car(cb);
            Thread t = new Thread(car, (i + "號車"));
            t.start();
        }
    }
    
}
