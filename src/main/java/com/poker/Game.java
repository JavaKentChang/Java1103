package com.poker;

import static com.poker.PokerUtil.getPokers;
import static com.poker.PokerUtil.getScore;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Queue<Poker> pokers = getPokers();
        Collections.shuffle((List)pokers);
        System.out.println(pokers);
        play(pokers);
    }
    public static void play(Queue<Poker> pokers) {
        List<Poker> myPokers = new LinkedList<>(); // 我手邊的牌
        List<Poker> pcPokers = new LinkedList<>(); // 我手邊的牌
        //莊家先拿一張牌
        pcPokers.add(pokers.poll());
        //User 的迴圈        
        do {  
            //檢查手邊的牌
            System.out.printf("你的牌是: %s 目前分數: %.1f \n", 
                              myPokers, getScore(myPokers));
            //先判斷是否爆了 
            if (getScore(myPokers)>10.5){
                System.out.println("爆了");
                break;
            }
            //是否過5關
            if(myPokers.size()==5){
                System.out.println("完美結束過5關，恭喜您贏了");
                break;
            }
            //是否10.5
            if(getScore(myPokers)==10.5){
                System.out.println("完美結束10點半，恭喜您贏了");
                break;
            }
            Scanner sc = new Scanner(System.in);
            System.out.printf("你的牌是: %s 目前分數: %.1f 是否要牌(y/n) ? ", 
                              myPokers, getScore(myPokers));
            String yn = sc.next();
            if(yn.equals("y")) {
                Poker poker = pokers.poll();
                myPokers.add(poker);
            } else {
                break;
            }
        } while (true);
        //pc
        do{
        if(getScore(pcPokers)<8){pcPokers.add(pokers.poll());}
            else{
                break;
            } 
            
        }while(true);
        System.out.printf("User的牌是: %s 目前分數: %.1f \n", 
                              myPokers, getScore(myPokers));
        System.out.printf("PC的牌是: %s 目前分數: %.1f \n", 
                              pcPokers, getScore(pcPokers));
        System.out.println("剩餘的牌: " + pokers);
    }
}