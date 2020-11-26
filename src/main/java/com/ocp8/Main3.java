
package com.ocp8;


public class Main3 {
    public static void main(String[] args) {
        //一種一種租
        //RentalCompany rc = new RentalCompany();
        //rc.rentTransportation(Car.class,2);
        //rc.rentTransportation(Bicycle.class,20);
        //rc.rentTransportation(Airplane.class, 20);
        //rc.print();
        
        //每一種都租2台
        int n=2;
        Class[] classes = {Car.class,Bicycle.class,Airplane.class};
        RentalCompany rc2 = new RentalCompany();
        for (Class clazz : classes) {
            boolean success = rc2.rentTransportation(clazz, n);
            System.out.printf("租 %s %d 台 %s\n",clazz.getSimpleName(),n,success?"成功":"失敗");
        }    
        rc2.print();
        //作業，可以承租任一數量
    }
    
}
