
package com.ocp29_callback;

import java.util.Random;

public class Score implements Runnable{
    private Callback cb;

    public Score(Callback cb) {
        this.cb = cb;
    }
    
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Random r = new Random();
        
        try {
            Thread.sleep(new Random().nextInt());
            int score  = r.nextInt(101);//100 分
          
            System.out.printf("%s, 得到 %d, %s\n",name,score);
            cb.setValue(score);
        } catch (Exception e) {
        }
        
    }
    
}
