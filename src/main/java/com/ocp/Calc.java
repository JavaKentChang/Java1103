
package com.ocp;


public class Calc {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.h = 100;
        a1.w = 50;
        //第一種無回傳值的方法;
        a1.calcAndPrint();
        //第二種有回傳值的方法;
        int sum2 = a1.calcNotPrint();//回傳一個int值後，接起來。
        System.out.println(sum2);//印出那個回傳值
        //---------------------------------------
        BMI bmi = new BMI();//問老師這行的意思為何？
        bmi.h = 170.0;
        bmi.w = 60.0;
        double b1 = bmi.calc();
        double b2 = bmi.calc(1);
        double b3 = bmi.calc(2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        
    }
    
}
