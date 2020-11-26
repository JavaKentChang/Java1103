
package com.ocp8;

//有一個租賃公司

import java.util.Arrays;

public class RentalCompany {
    //交通工具的庫存
    private Transportation[] transportation;
    
    private int rent;
    public RentalCompany(){
        
        //庫存配置
        transportation = new Transportation[]{
        new Car("賓利",10,100,2000,1),        //買車
        new Bicycle("U-Bike",20,10,10,3),    //買腳踏車
        new Airplane("灣流",5,800,50000,2),  //買飛機
        };
    }
    //取得交通工具庫存
    public Transportation[] getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation[] transportation) {
        this.transportation = transportation;
    }
    
    
    public int getRent(){
        return rent;
    }
    //租車
    public boolean rentCar(int amount){//可能會租不到
    //查car的數量
        int carAmount = 0;
        for (Transportation ts : transportation) {
            if (ts instanceof Transportation){
            carAmount = ts.getAmount();   
            }
        }
        if (carAmount >= amount) {
            // 租金區域變數
            int rent = 0;
            for (Transportation ts : transportation) {
                if (ts instanceof Car) {
                    // 減去庫存
                    ts.setAmount(ts.getAmount() - amount);
                    // 累計租金
                    rent += ts.getPrice() * amount;
                }
            }
            // 將租金區域變數的值設定給 rent 物件變數
            this.rent = rent;
            return true;
        } else {
            return false;
        }
    }
    
    //租腳踏車
    public boolean rentBicycle(int amount){//可能會租不到
    //查car的數量
        int bicycleAmount = 0;
        for (Transportation ts : transportation) {
            if (ts instanceof Transportation){
            bicycleAmount = ts.getAmount();   
            }
        }
        if (bicycleAmount>= amount) {
            // 租金區域變數
            int rent = 0;
            for (Transportation ts : transportation) {
                if (ts instanceof Bicycle) {
                    // 減去庫存
                    ts.setAmount(ts.getAmount() - amount);
                    // 累計租金
                    rent += ts.getPrice() * amount;
                }
            }
            // 將租金區域變數的值設定給 rent 物件變數
            this.rent = rent;
            return true;
        } else {
            return false;
        }
    }
    
    
    //租飛機
    public boolean rentAirplane(int amount){//可能會租不到
    //查car的數量
        int airplaneAmount = 0;
        for (Transportation ts : transportation) {
            if (ts instanceof Transportation){
            airplaneAmount = ts.getAmount();   
            }
        }
        if (airplaneAmount>= amount) {
            // 租金區域變數
            int rent = 0;
            for (Transportation ts : transportation) {
                if (ts instanceof Airplane) {
                    // 減去庫存
                    ts.setAmount(ts.getAmount() - amount);
                    // 累計租金
                    rent += ts.getPrice() * amount;
                }
            }
            // 將租金區域變數的值設定給 rent 物件變數
            this.rent = rent;
            return true;
        } else {
            return false;
        }
    }
    //租任意交通工具
    public boolean rentTransportation(Class clazz,int amount){
        
        //計算數量是否足夠？
        
        for (Transportation ts : transportation) {
            if(clazz.isInstance(ts)){
                if(ts.getAmount() >= amount){
                    this.rent += ts.getPrice()*amount;
                    ts.setAmount(ts.getAmount()-amount);
                
                }else{
                    return false;
                }
            }
        }
        
        return true;
    }
    
   //列印庫存
    public void print(){
        for(Transportation ts:transportation){
            System.out.printf("%s 有 %d 台，每台租金: $ %d\n",ts.getName(),ts.getAmount(),ts.getPrice());
    
    
        }
    
    }
    

  
}
