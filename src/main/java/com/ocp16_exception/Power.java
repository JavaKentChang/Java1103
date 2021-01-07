package com.ocp16_exception;

//電力換算
//V=電壓;W=瓦數;A=安培;
public class Power {
    public int getV(int w, int a){
        int v= w/a;
        return v;
    }
   public int getA(int v, int w){
       int a = w/v;
       return a;
   }
   public int getW(int v, int a){
       int w= a*v;
       return w;
   }

    public int getw(int v, int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
