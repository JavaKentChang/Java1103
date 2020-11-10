
package com.ocp3;


public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] score = {10,9,8};//第一次的初始值，才可以不寫new int[](精簡型寫法)
        score = new int[]{100,90,80};//第二次就一定要寫new int[]標準型寫法
        int sum = 0;
        int avg = 0;
        System.out.println("列出成績：");
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
            sum += score[i]; 
        }
        System.out.printf("總分：%d\n",sum);
        avg = sum/score.length;
        System.out.printf("平均：%d",avg);
    }
}
