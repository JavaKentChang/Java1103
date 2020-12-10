/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp11.case5_匿名內部類別;

/**
 *
 * @author MB-study
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game(){
            @Override
            public void play(){
                System.out.println("玩飛機遊戲");
            }
        };
        Game game2 = new Game() {
            @Override
            public void play() {
                System.out.println("玩寵物遊戲");
            }
        };
        // java 8 Lambda 語法
        //以下的()，等同於play()，只有在interface 只有一個方法FunctionalInterface，才可以這樣寫
        //建議要有傳統的經驗才體驗Lambda語法
        Game game3 = () -> System.out.println("玩火車遊戲");
        
    }
}
