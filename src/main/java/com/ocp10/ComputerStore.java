
package com.ocp10;

public class ComputerStore {
    public static void main(String[] args) {
        Computer pc= new PersonalComputer();
        System.out.println(pc.add(10, 20));
        System.out.println(pc.getName());
        //因Mobile為半成品抽象類別，所以不能new,new 會有問題
        //只有正常的類別才可以new, 如Android, iPhone, PersonalComputer
        //Mobile mobile = new Mobile();
        Mobile mobile = new Android();//這個時候就會多型 Android, 同理可以應用於PersonalComputer
        System.out.println(mobile.add(10,30));
        System.out.println(mobile.getName());
        
    }
    
}
