
package com.ocp11.case6_靜態內部類別;


public class Bar {
    int x = 100;
    //靜態內部類別
    //可以有 static成員與instance成員
    
    public static class Foo {
        //Static 不可以使用x,只能透過new Bar()才行
        public static void printMe() {
            System.out.println("I am Foo");
        }
        public void hello(){
            System.out.println("I am Hello");
        }
    }
    //一般內部類別
    //只能有instance 成員
    public class Hoo{
        public void hello(){
            System.out.println("I am Hello");
            Foo.printMe();//instance 一般內部類別可以引用static內的方法
        }
    }
}
