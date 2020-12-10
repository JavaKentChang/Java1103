
package com.ocp11.case2;

import com.ocp11.case1.Airplane;


public class PlayGame {
    public static void main(String[] args) {
        Airplane game = new Airplane();
        game.play();
        System.out.println(game.price());
                
    }
}
