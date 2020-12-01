
package com.ocp8;


public class Airplane extends Transportation{
    public Airplane(){
    }
    public Airplane(String name,int amount,int km,int price){
    
            setName(name);
            setAmount(amount);
            setKm(km);
            setPrice(price);
            
    }   
    public void service(){
        System.out.println("租飛機必須同時租駕駛");
    
    }
}
