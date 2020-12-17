
package com.ocp12.lambda3;

import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        int score = 65;
        Pass schoolPass = (x) -> x>=60;
        Pass javaPass = (x) -> x>=70;
        
        checkScore(score, javaPass);
        checkScore(score, schoolPass);
        
        //食品檢驗
        int foodScore = 100;
        checkScore(foodScore, (x)-> x==100); 
        
        //使用 Predicate
        //https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
        //boolean test(T t)
        Predicate<Double> pass = (x)-> x==0;
        System.out.println(pass.test(0.18));
        Predicate<Double> bmiPass = (x)-> x>=18 && x<28;
        System.out.println(bmiPass.test(21.76));     
    }
    
    public static void checkScore(int x, Pass p) {
        System.out.printf("%d 的判斷結果 ==> %b\n",x,p.check(x));
        
    }
    
    
}
