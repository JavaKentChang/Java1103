
package com.ocp;


public class BMI {
    double h;
    double w;
    double calc(){
        double bmi=w /Math.pow(h/100, 2);
        return bmi;
    }
    double calc(int sex){
        double bmi=w /Math.pow(h/100, 2);
        switch(sex){
            case 1:
                bmi*=1.1;
            case 2:
                bmi*=0.9;
            default:
                bmi=0;
        }
        return bmi;
    }
}
