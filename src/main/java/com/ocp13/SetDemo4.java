
package com.ocp13;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class SetDemo4 {
    public static void main(String[] args) {
        //Exam e1 = new Exam();
        //System.out.println(e1);
        Set<Exam> exams = new LinkedHashSet<>();
        IntStream.rangeClosed(1, 20).forEach(i -> exams.add(new Exam()));
        System.out.println("全班成績"+exams);
        System.out.println("1.國文平均");
        //印出國文成績
        exams.stream()
                .mapToInt(e ->e.getChinese())// 
                .forEach(score -> System.out.print(score+", "));
        //印出國文
        double avg_chinese = exams.stream()
                                            .mapToInt(e -> e.getChinese())//取得國文分數
                                            .average()//取得平均
                                            .getAsDouble();//轉成double
        System.out.println("平均:"+avg_chinese);
              
        //印出英文成績
        System.out.println("2.英文平均");
        exams.stream().mapToInt(e ->e.getEnglish()).forEach(score -> System.out.print(score+", "));
        //印出英文平均
        double avg_english = exams.stream().mapToInt(e ->e.getEnglish()).average().getAsDouble();
        System.out.println("平均:"+avg_english);
        
        //印出數學成績
        System.out.println("3.數學平均");
        exams.stream().mapToInt(e ->e.getMath()).forEach(score -> System.out.print(score+", "));
        //印出數學平均
        double avg_math = exams.stream().mapToInt(e ->e.getMath()).average().getAsDouble();
        System.out.println("平均:"+avg_math);  
        
        //國文最高分為?
        int max_chinese = exams.stream().mapToInt(e ->e.getChinese()).max().getAsInt();
        System.out.println("國文最高分為:"+max_chinese);
        
        //國文最高分的人名為?
        exams.stream()
                .filter(e-> e.getChinese()==max_chinese) //先過濾最高分是多少
                .forEach(e->System.out.print(e.getName()+ ", "));
        System.out.println();
        
        //總成績最高的人為何? 是幾分?
        int max_score = exams.stream()
                .mapToInt(e->e.getChinese()+e.getEnglish()+e.getMath())
                .max()
                .getAsInt();
        exams.stream()
                .filter(e->e.getChinese()+e.getEnglish()+e.getMath()==max_score)
                .forEach(e -> System.out.print(e.getName()));// 找出最高分是誰
        System.out.println(max_score); // 最高分是多少
    }
}
