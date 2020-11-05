
package com.ocp2;


public class Accout {
    String name; // 戶名
    private int balance; // 餘額 // 私有的變數，只有自己看得到
    
    //存款程式
    void setBalance(int money){
        if(money >=0){
            balance += money;
            System.out.printf("存款 %d 成功! \n",money);
        }else{
            System.out.printf("存款 %d 失敗(存款金額必須大於0)!\n",money);
        }
    
    }
    //提款程式
    void withdraw(int money){
        if(money >0 && balance>=money){
        balance -= money;
        System.out.printf("提款 %d 成功! \n",money);
        }else{
            System.out.printf("提款 %d 失敗(提款金額必須大於0或餘額不足!) \n",money); 
           }
    }   
    //印出帳戶餘額
    void printBalance(){
        System.out.printf("name：%s, balance:%,d\n",name,balance);  
    }
}
