
package com.ocp7;

public class NumPlay {
    public static void main(String[] args) {
        Num num1 = new Num();
        num1.runFiveTimes();
        System.out.println(num1); //由於m 與n 屬性不同，所以執行後會有不同的結果
        Num num2 = new Num();
        num2.runFiveTimes();
        System.out.println(num2);
    }
}
