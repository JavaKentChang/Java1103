
package com.ocp7;


public class Wallet {
    private int money = 10_0000;
    private static String owner = "媽媽的錢包";

    public int getAndPrintMoney(){
        //資源= 屬性與方法
        //在物件方法中可以存取物件資源(屬性與方法)與類別資源
        System.out.println(owner + "有 $"+ money);
    return money;
    }
    public static void printMoney(){
       //在類別方法中僅能存取類別資源
        System.out.println(owner);
        //System.out.println(money);沒辦法存取物件資源
        
    }
    public static void printMoney2(){
       //在類別方法中僅能存取類別資源
        System.out.println(owner);
        Wallet wallet = new Wallet();//重新建立一個
        System.out.println(wallet.money);//沒辦法存取物件資源    
    }
}
