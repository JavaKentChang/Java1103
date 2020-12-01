
package com.ocp9;


public class MultiAdd {
    public static void add(int x,int y) {
        System.out.println(x+y);        
    }
    public static void add(int x,int y,int z) {
        System.out.println(x+y+z);        
    }
    //若要執行無限的整數陣列的話，
    //可以public static void add(int... nums){}
    //...代表0~*個參數
    public static void add(int... nums) {
        int sum=0;
        for (int n : nums) {
            sum += n;            
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add(10, 20);
        add(10, 20,30);
        add();//add(int... nums)才能成功
        //add(10, 20,30,40);若我們要連續執行一堆加法的話
        //可以透過一個整數陣列來運行
        int[] nums = {10,20,30,50,40,60,70};
        add(nums);
        
    }
}
