package com.ocp8;

public class Car extends Transportation {

    public Car() {

    }
    
    public Car(String name, int amount, int km, int price,int rentnum) {

        setName(name);
        setAmount(amount);
        setKm(km);
        setPrice(price);
        setRentnum(rentnum);
        
    }

    public void play() {
        System.out.println("我要開賓利");
    }
}
