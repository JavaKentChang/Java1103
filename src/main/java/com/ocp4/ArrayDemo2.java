
package com.ocp4;

import java.util.Arrays;
import java.util.Random;

//玩骰子遊戲
public class ArrayDemo2 {
    public static void main(String[] args) {
        //骰子
        int[] dice = {1,2,3,4,5,6};
        int score = getScore(dice);//每次得到一數值
        System.out.println(score);//列印出得到數值
        //十八拉三顆
        int[] scores=playDice(dice, 3);//宣告一個陣列有3個位置，來依序存放3顆骰子跑出來的資料
        for (int i = 0; i < scores.length; i++) {
            scores[i] = getScore(dice);
       }
        System.out.println(Arrays.toString(scores));
        int sum = getSum(scores);
        System.out.println(sum);
        
    }
    public static int[] playDice(int[] dice, int n) {
        int[] scores = new int[n];// 記錄每一顆骰子的分數
        for (int i = 0; i < scores.length; i++) {
             scores[i] = getScore(dice);
        }
            return scores;
    }
 //隨機取得一個骰子數值 
    public static int getScore(int[] dice) {
        Random r = new Random();
        int index = r.nextInt(dice.length);
        int score = dice[index];
        return score;
    }
 //取得骰子的總和
    public static int getSum(int[] scores) {
        int sum = 0;
        for (int i = 0;i<scores.length;i++){
            sum += scores[i];
        }
        return sum;
    }
}
