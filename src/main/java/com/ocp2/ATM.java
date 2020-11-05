
package com.ocp2;

import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        atm_loop:// 迴圈的名字  
      do {
        System.out.println("----------");
        System.out.println("1: 建立新帳戶");
        System.out.println("2: 存款");
        System.out.println("3: 提款");
        System.out.println("4: 查詢");
        System.out.println("9: 離開");
        System.out.println("----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("請選擇(1-9):");
        int no = sc.nextInt();
        switch (no){
            case 1:
                System.out.println("1: 建立新帳戶");
                break;
            case 2:
                System.out.println("2: 存款");
                break;
            case 3:
                System.out.println("3: 提款");
                break;
            case 4:
                System.out.println("4: 查詢");
                break;
            case 9:
                System.out.println("9: 離開");
                break atm_loop;
          }  
        
      } while(true);
      
    }
        
}
