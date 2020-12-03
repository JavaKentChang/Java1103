
package com.ocp10;


public class PersonalComputer implements Computer{
   public int add(int x, int y) {
       return (x+y);
   }
   //需要加上public，定義電腦品牌
   public String getName(){
       return ("ASUS");
   }
}
