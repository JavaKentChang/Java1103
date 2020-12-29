package com.ocp14;

//vector 是執行緒安全(多人存取的安全)的集合，自動增長演算

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v  =  new Vector(81,5);//Vector(81)可預設給予初始值，5 為每次新增多少擴增。
        //超過長度*2
        for (int i = 1; i <=81; i++) {
            v.add(i);
        }
        v.add(100);//
        v.add(100);//
        System.out.println("Capacity:"+v.capacity());
        System.out.println("Size:"+v.size());
    }
            
}
