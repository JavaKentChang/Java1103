
package com.ocp6;

import java.util.Arrays;


public class Mcdoalds3 {
    public static void main(String[] args) {
        Hamburger h1 = new Hamburger("大麥克",70);
        Hamburger h2 = new Hamburger("麥香魚",50);
        SideMeal s1 = new SideMeal("薯條","大",55);
        SideMeal s2 = new SideMeal("沙拉",40);
        Drink D1 = new Drink("可樂","大杯",30);
        Drink D2 = new Drink("咖啡","中杯",50);
        
        //套餐
        SetMeal sone = new SetMeal(h1,s1,D1);
        SetMeal stwo = new SetMeal(h2,s2,D2);
        int sum = 0;
        SetMeal[] setMeals = {sone,stwo};
        for(SetMeal setMeal:setMeals){
            sum +=setMeal.getSum();
        }
        System.out.printf("總金額:%d\n",sum);
        System.out.printf("你買的有：%s\n",Arrays.toString(setMeals));
        }
        
        
        
    }
 

