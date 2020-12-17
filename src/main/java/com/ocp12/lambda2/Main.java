
package com.ocp12.lambda2;


public class Main {
    public static void main(String[] args) {
        Add add = (x,y) -> x+y;
        Add add2 = (x,y) ->{return x*y;};
        
        System.out.println(add.sum(10, 20));
        System.out.println(add2.sum(10,20));
    }
    
}
