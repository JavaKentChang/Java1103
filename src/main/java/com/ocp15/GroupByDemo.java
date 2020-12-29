
package com.ocp15;

//分析資料三要素


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import sun.security.pkcs11.wrapper.Functions;

//群組 GroupBy, 數量Count, 排序Sort  
public class GroupByDemo {
    public static void main(String[] args) {
        List<String> fruit = Arrays.asList("apple","apple","banana",
                                        "apple","banana","watermelon","orange");
        //分組
        Map<String,Long> result = fruit.stream()
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
        

        //排序
        result.entrySet().stream()
                        .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                        .forEach(e->System.out.println(e));
        result.entrySet().stream()
                         .sorted((a,b) ->(int)(b.getValue()-a.getValue()))
                         .forEach(e->System.out.println(e));
                         
        
    }
}
