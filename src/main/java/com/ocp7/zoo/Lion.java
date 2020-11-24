
package com.ocp7.zoo;

public class Lion extends Animal{

    public Lion() {
    }

    public Lion(String name, int foot) {
        super(name, foot);//super 就是爸爸建構子，必須存在於extends Animal
    }
 @Override
    public void move(){
        System.out.println("會跑");
    
    }
}
