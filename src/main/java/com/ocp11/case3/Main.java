
package com.ocp11.case3;

public class Main {
    public static void main(String[] args) {
        /*寫法1
        Bar.Foo foo = new Bar().new Foo(); //Foo 是在Bar 保護下，所以必須先new Bar()後，再new Foo();
        foo.printMe();//new 完之後，才能使用到printMe();
        */
        //第二種宣告方法
        Bar bar = new Bar();
        Bar.Foo foo = bar.new Foo();
        foo.printMe();
        
        //第3種宣告方法
        new Bar().new Foo().printMe();
        
        
        
    }
}
