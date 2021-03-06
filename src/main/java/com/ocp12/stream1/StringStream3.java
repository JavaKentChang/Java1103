
package com.ocp12.stream1;

import java.util.function.IntConsumer;
import java.util.stream.Stream;


public class StringStream3 {
    public static void main(String[] args) {
        String[] names= {"Java","Python","C","Visual Basic"};
        //印出每個字串長度的總和 -- > 轉換 mapToInt
        //{4,6,1,12} = 23
        
        int sum = Stream.of(names).mapToInt(x->x.length()).sum();
        System.out.println(sum);
        //印出長度<=4的長度各是多少 - - > filler - - > forEach
        Stream.of(names)                                    //{"Java","Python","C","Visual Basic"}
                .mapToInt(x->x.length())                    //{4,6,1,12}
                .filter(x-> x<=4)                            //{4,1}
                .forEach(x->System.out.println(x));         //4,1   
        //用雙::
        Stream.of(names)                                    //{"Java","Python","C","Visual Basic"}
                .mapToInt(String::length)                    //{4,6,1,12}
                .filter(Util::isLessThan4)                            //{4,1} 
                .forEach(System.out::println);                   //4,1   
    }
}
