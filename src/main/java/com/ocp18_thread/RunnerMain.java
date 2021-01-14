
package com.ocp18_thread;


public class RunnerMain {
    public static void main(String[] args) {
        Runner r1 = new Runner();
        Runner r2 = new Runner();
        //分時多工
        r1.setName("烏龜");
        r2.setName("兔子");
        //讓烏龜權證變高
        //r1.setPriority(Thread.MAX_PRIORITY);//1~10
        //r2.setPriority(Thread.MIN_PRIORITY);//1~10
        //設定兔子為陪襯 背景執行續
        r1.setDaemon(false);
        r2.setDaemon(false);
      
        r1.start();//啟動執行緒
        r2.start();
    }
}
