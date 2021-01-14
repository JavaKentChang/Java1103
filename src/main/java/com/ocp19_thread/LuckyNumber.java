/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp19_thread;

import java.util.Random;

/**
 *
 * @author MB-study
 */
public class LuckyNumber extends Thread{
    @Override
    public void run(){
        play();
    }
    
    public void play(){
     int nums;
     String name = Thread.currentThread().getName();
        Random r = new Random();
        for(int i =1;true;i++){
            nums = r.nextInt(778);
            if(nums==777){
                System.out.printf("%s 共取 %d 次取到 %d \n", name, i, nums);
                break;
            }
        }
    }
}
