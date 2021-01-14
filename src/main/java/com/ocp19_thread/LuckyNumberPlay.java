
package com.ocp19_thread;


public class LuckyNumberPlay {
    public static void main(String[] args) {
        LuckyNumber luckynum1 = new LuckyNumber();
        LuckyNumber luckynum2 = new LuckyNumber();
        luckynum1.setName("小明");
        luckynum2.setName("小華");
        luckynum1.start();
        luckynum2.start();
        
    }
}
