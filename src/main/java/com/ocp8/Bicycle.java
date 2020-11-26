
package com.ocp8;


public class Bicycle extends Transportation{
    public Bicycle(){
    }
    public Bicycle(String name,int amount,int km,int price,int rentnum){
    
            setName(name);
            setAmount(amount);
            setKm(km);
            setPrice(price);
            setRentnum(rentnum);
    } 
    public void message(){
        System.out.println("公園不可以騎腳踏車");
    }
}
