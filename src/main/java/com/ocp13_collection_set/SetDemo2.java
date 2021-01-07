
package com.ocp13_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo2 {
    public static void main(String[] args) {
        //Set set = new HashSet();//不按順序
        //Set set = new LinkedHashSet();//順序依樣
        Set set = new TreeSet();//按順序
        //今彩539，1~39 中取5個不重複的值
        //電腦選號
        System.out.println(set.size());
        //在小於5時作
        while (set.size()<5 ) {            
            int n = new Random().nextInt(10)+1;
            set.add(n);
            System.out.println("加入 ==> "+n);
        }
        System.out.println(set);
        //彩球號碼總和
        //Java 7 for-Loop
        int sum = 0;
        for (Object obj : set) {
            if (obj instanceof Integer) {
                sum+= (Integer)obj;
            }
            
        }
        System.out.println(sum);
        //Java 8 
        int sum2 = set.stream().mapToInt(e->((Integer)e).intValue()).sum();
        int sum3 = set.stream().mapToInt(e->(Integer)e).sum();//Java 5 以後可省略上述寫法
        
        System.out.println(sum2);
        
    }
  
}
