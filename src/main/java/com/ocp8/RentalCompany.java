
package com.ocp8;

//有一個租賃公司

import java.util.Arrays;

public class RentalCompany {
    //交通工具的庫存
    private Transportation[] transportation;
    public RentalCompany(){
        
        //庫存配置
        transportation = new Transportation[]{
        new Car("賓利",10,100,2000),        //買車
        new Bicycle("U-Bike",20,10,10),//買腳踏車
        new Airplane("灣流",50,800,502000),        //買飛機
        };
    }
    //取得交通工具庫存
    public Transportation[] getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation[] transportation) {
        this.transportation = transportation;
    }
    
    
    public static void main(String[] args) {
        //開公司
        RentalCompany rc = new RentalCompany();
        Transportation[] trans = rc.getTransportation();
        System.out.println(Arrays.toString(trans));
        
        
    }
  
}
