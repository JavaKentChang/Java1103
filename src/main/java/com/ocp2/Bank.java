
package com.ocp2;


public class Bank {
    public static void main(String[] args) {
        Accout ac1 = new Accout();//建立一個房間，把地址給了ac1
        Accout ac2 = new Accout();//建立一個房間，把地址給了ac2
        ac1.name = "John"; //
        //ac1.balance = 10000;//因balacnce 被設定成私有的，所以不能使用
        ac1.setBalance(10000);
        ac1.setBalance(5000);
        //ac1.setBalance(-5000);//因在類別Accout的控制項裡有設定money >=0,所以存款不為負
        ac2.name = "Mary";
        //ac2.balance = 10000;//因balacnce 被設定成私有的，所以不能使用
        ac2.setBalance(10000);
        ac2.setBalance(3000);
        ac1.printBalance();
        ac2.printBalance();
    }
     
        
}
