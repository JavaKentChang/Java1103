
package com.ocp8;

public class Main2 {
    public static void main(String[] args) {
        int rentCarAmount = 2;
        int rentBicycleAmount = 5;
        int rentAireplaneAmount = 3;
        RentalCompany rc = new RentalCompany();
        boolean success_car = rc.rentCar(rentCarAmount);
        boolean success_bicycle = rc.rentCar(rentBicycleAmount);
        boolean success_airplane = rc.rentCar(rentAireplaneAmount);
        
        if(success_car) {
            System.out.printf("租車 %d 台成功, 租金: %,d\n", 
                    rentCarAmount, rc.getRent());
        } else {
            System.out.printf("租車 %d 台失敗(庫存不足)\n", rentCarAmount);
        }
        if(success_bicycle) {
            System.out.printf("租腳踏車 %d 台成功, 租金: %,d\n", 
                    rentBicycleAmount, rc.getRent());
        } else {
            System.out.printf("租車 %d 台失敗(庫存不足)\n", rentBicycleAmount);
        }
    

    }
}

//程式未完，請再參考老師檔案