
package com.ocp9;


public class MultiAdd2 {
    public static void print(int x , int y){
        System.out.println("A");
    }
    public static void print(int ... nums){
        System.out.println("B");
        //... 0~多
    }
    public static void main(String[] args) {
        print(1);  // 會先滿足0~多      所以答案是B
        print(1,2); //會滿足兩個參數的   所以答案是A
        print(1,2,3); //會滿足0~多的部份 所以答案是B
    }
}
