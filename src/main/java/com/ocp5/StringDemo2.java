
package com.ocp5;


public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        //方法1
        s1 = s1.intern();//字串在池子(string pool)外面，強迫移轉池子內，以節省記憶體的使用
        System.out.println(s1==s2);
        //方法2
        s1 = s2;//改變s1的指向位置，考試有考過
        System.out.println(s1==s2);
               
    }
   
}
