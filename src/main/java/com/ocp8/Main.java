/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp8;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class Main {

    public static void main(String[] args) {
        //開公司
        RentalCompany rc = new RentalCompany();
        //取得交通公司 看庫存
        Transportation[] trans = rc.getTransportation();
        //印出租賃公司的交通工具
        //System.out.println("目前庫存" + Arrays.toString(trans));
        //租一台車
       int subtotal = 0;
        for (Transportation ts : trans) {
            if (ts instanceof Car) {// ts 是不是車子的陣列裡
                Car car = (Car) ts; //強制將陣列裡的東西就是車子
                car.play();
                int car_rentprice;
                System.out.printf("我要租： %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 1;
                ts.setAmount(amount);
                car_rentprice = car.getPrice()*1;
                System.out.printf("車子租金: %d\n",car_rentprice);
                subtotal += ts.getPrice() * ts.getRentnum();
            }
            if (ts instanceof Bicycle) {// ts 是不是腳踏車的陣列裡
                Bicycle bicycle = (Bicycle) ts; //強制將陣列裡的東西就是腳
                bicycle.message();
                int bicycle_rentprice;
                System.out.printf("我要租： %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 3;
                ts.setAmount(amount);
                bicycle_rentprice = bicycle.getPrice()*3;
                System.out.printf("腳踏車租金: %d\n",bicycle_rentprice);
                subtotal += ts.getPrice() * ts.getRentnum();
            }
            if (ts instanceof Airplane) {// ts 是不是車子的陣列裡
                Airplane airplane = (Airplane) ts; //強制將陣列裡的東西就是車子
                airplane.service();
                int airplane_rentprice;
                System.out.printf("我要租： %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 2;
                ts.setAmount(amount);
                airplane_rentprice = airplane.getPrice()*2;
                System.out.printf("飛機租金: %d\n",airplane_rentprice);
                subtotal += ts.getPrice() * ts.getRentnum();
            }
             //int sum = 0;
             //sum = car_rentprice+bicycle_rentprice+airplane_rentprice;
             
        }
        
        //更新後庫存
       
        System.out.println("更新後的庫存\n" + Arrays.toString(trans));
        System.out.printf("總租金: %d\n",subtotal);
    }
}
