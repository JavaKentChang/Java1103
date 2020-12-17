
package com.ocp12.stream1;

import java.util.stream.Stream;


public class StringStream2 {
    public static void main(String[] args) {
        String[] names= {"Java","Python","C","Visual Basic"};
        //印出字串長度<=4 的name
        //before Java8
        for (String x : names) {
            if(x.length()<=4){
                System.out.println(x);
            }
        }
        //new Java 8 lambda
        //印出前先過濾filter(x->x.length()<=4)
        //Stream.of(names).forEach(System.out::println);
        Stream.of(names).filter(x->x.length()<=4).forEach(System.out::println);
        
    }
}
