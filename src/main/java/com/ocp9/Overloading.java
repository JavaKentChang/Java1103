
package com.ocp9;


public class Overloading {
    public static void add(Integer x, Integer y) {
        System.out.println("Integer: "+(x+y));
    }
    /*public static void add(int x, int y) {
        System.out.println("int: "+(x+y));
    }*/
    //故障將整數mark起來，查看以下add()的結果
    public static void add(float x,float y) {
        System.out.println("Float: "+(x+y));       
    }
    public static void add(double x,double y) {
        System.out.println("double: "+(x+y));       
    }
    public static void main(String[] args) {
        add(10.0f,20.0f);//呼叫第7號的add
        add(10,20);//呼叫第7號的add
        add(10L,20L);
        add(10.0,20.0f);
        add(10.0,20.0);
        add(10.0f,20L);
        add(2147483648L,20L);
    }
}
