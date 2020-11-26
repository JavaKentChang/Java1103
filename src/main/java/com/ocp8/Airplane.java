
package com.ocp8;


public class Airplane extends Transportation{
    public Airplane(){
    }
    public Airplane(String name,int amount,int km,int price,int rentnum){
    
            setName(name);
            setAmount(amount);
            setKm(km);
            setPrice(price);
            setRentnum(rentnum);
    }   
    public void service(){
        System.out.println("租飛機必須同時租駕駛");
    
    }
}
