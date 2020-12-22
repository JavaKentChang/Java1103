
package com.ocp13;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        //集合與泛型       
        Set set = new LinkedHashSet();
        while (set.size()<5 ) {            
            set.add(new Random().nextInt(39)+1);
        }
        set.add("雜質");
        System.out.println(set);
        set.remove("雜質");
        System.out.println(set);
        System.out.println("----------------------------------");       
        //===========================
        Set<Integer> set2 = new LinkedHashSet<>(); // Set<Interger> 只放Integer元素 (泛型)
        //LinkedHashSet<> <----- Diamond 
        while (set.size()<5 ) {            
            set.add(new Random().nextInt(39)+1);
        }
        //set.add("雜質");//Set<Interger> 只放Integer元素無法放字串，就不加了
        set.add(set2);
    }        
}
