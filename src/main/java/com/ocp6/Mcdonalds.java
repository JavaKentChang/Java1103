
package com.ocp6;

import java.util.Arrays;

public class Mcdonalds {
    public static void main(String[] args) {
        Hamburger h1 = new Hamburger();
        h1.setName("大麥克");
        h1.setPrice(73);
        System.out.println(h1.getName()+","+h1.getPrice());
        System.out.println(h1);
        System.out.println(h1.toString());//在toString 用Ctrl + 滑鼠右鍵，點進去
        
        Hamburger h2 = new Hamburger("麥香魚",60);
        System.out.println(h2);
        
        Hamburger[] hamburgers = {h1,h2};
        int sum = 0;
        for (Hamburger hamburger : hamburgers) {
            sum += hamburger.getPrice();
        }
        System.out.printf("總金額 %d\n",sum);
        System.out.printf("你買的有：%s\n",Arrays.toString(hamburgers) );
    }
}
