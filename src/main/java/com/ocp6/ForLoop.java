
package com.ocp6;

public class ForLoop {
    public static void main(String[] args) {
        int[] scores = {100,90,80};
        //standard for-loop
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
            }
        //Enhanced for-loop 
        //for(資料型別 每個元素的名字: 要分析的資料)
        //只能往下讀取，不能往前讀取如 i--
        for(int s:scores) {
            System.out.println(s);  
            }
  
        
    }
    
}
