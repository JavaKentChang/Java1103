package com.ocp12.lambda2;

@FunctionalInterface
public interface Add {
    int sum(int x , int y);//lambda 只會做這個
    public int hashCode();//公用方法
    default void copyright(){ //default 有實作的方法
    }
}
