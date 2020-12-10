
package com.ocp11.case4_方法內部類別;


public class Bar {
    //int x = 1000;
    public void hello(){
        int x = 100;//java 8 以前都需要寫final,java 8 之後就不用寫
        //x++;
        class Foo{
            void printME(){
                System.out.println("I am Foo");
                //若要存取hello() 外部方法的區域變數
                //則該便是必須是final
                System.out.println(x);   
            }  
        }
        Foo foo = new Foo();
        foo.printME();
    }
}
