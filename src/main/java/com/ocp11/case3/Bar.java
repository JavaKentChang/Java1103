
package com.ocp11.case3;


public class Bar {
    int x = 1000;
    public class Foo{
        int x = 10;
        public void printMe(){
            System.out.println("I am Foo");
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Bar.this.x);
        }
    
    }
}
