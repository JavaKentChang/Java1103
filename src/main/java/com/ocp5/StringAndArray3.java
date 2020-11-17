
package com.ocp5;

import java.util.Arrays;
import java.util.Random;

public class StringAndArray3 {
    public static void main(String[] args) {
          Random r = new Random();//亂數產生一數值
          String id = "H"; // 指定是那一個縣市
          id += r.nextInt(2)+1; //把H之後，隨機產生 1 or 2男生或女生
          id += r.nextInt(10);  //依據亂數產線第3碼
          id += r.nextInt(10);  //依據亂數產線第4碼
          id += r.nextInt(10);  //依據亂數產線第5碼
          id += r.nextInt(10);  //依據亂數產線第6碼
          id += r.nextInt(10);  //依據亂數產線第7碼
          id += r.nextInt(10);  //依據亂數產線第8碼
          id += r.nextInt(10);  //依據亂數產線第9碼
          id += r.nextInt(10);  //依據亂數產線第10碼
        //10123456789 <- int[]
        char[] cs = id.toCharArray(); // 設定一個id字號陣列
        System.out.println(Arrays.toString(cs)); //列印出一個這個字串陣列
        int[] idIntArray = new int[11];
        if(cs[0] == 'H' ) {
            idIntArray[0] = 1;
            idIntArray[1] = 7;
        }
        for (int i = 1; i < id.length(); i++) {
            idIntArray[i+1] = cs[i] -48;
        }
        System.out.println(Arrays.toString(idIntArray));
        int[] delta = {1,9,8,7,6,5,4,3,2,1,1}; //驗證的基本字串
        System.out.println(Arrays.toString(delta));
        int sum = 0;
        for (int i = 0; i < idIntArray.length; i++) {
            sum += idIntArray[i]*delta[i]; //把產出的字串列與驗證的字串列相乘後相加
        }
        System.out.println(sum);//列印出總值
        boolean check = sum % 10 ==0; //判斷產出的字串總值，能被10整除後，塞給check
        System.out.println(check);//印出結果
        if(!check){//當不能被10整除時，重新跑一次。
            main(null);//一直產出，直到有身份證字號是正確的。
        }
    }
        
}
