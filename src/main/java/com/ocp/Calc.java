
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
    }
    
}
