
package com.ocp4;
 
import java.util.Arrays;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        int[] ans = RandomNumber.getRandomNumber(4);
        System.out.println(Arrays.toString(ans));
    }
    
}
