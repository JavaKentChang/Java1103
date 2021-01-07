
package com.ocp13_collection_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet(); // 特性:元素之間的擺放是按照HashCode來決定，提高原色查詢的效率。
        set.add("國文");//String
        set.add(100); //不是int 而是Integer
        set.add("英文");
        set.add(Integer.valueOf("100"));
        set.add("數學");
        set.add(new Integer("90"));
        System.out.println(set);//因100分重複僅只有5筆資料
        for (Object obj : set) {
            System.out.println(obj);
        }
        //Java 8 foreach
        set.forEach(e -> System.out.println(e));
        set.forEach(System.out::println);
        System.out.println(set.size());//集合長度
        
    }
}
