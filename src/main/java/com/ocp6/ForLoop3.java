
package com.ocp6;


public class ForLoop3 {
    public static void main(String[] args) {
        int[][][] nums={
            {{100,90},{80,70},{60,50}},
            {{70,90},{80,100},{90,90}}
        };
        //Enhanced\
        int sum = 0;
        for (int[][] num : nums) {
            for (int[] is : num) {
                for (int i : is) {
                    System.out.println(i);
                   sum +=i;
                }           
            }             
        }
        System.out.printf("sum= %d\n",sum);
        int sun = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    System.out.println(nums[i][j][k]);
                    sun +=k ;
                }
                
            }
            
        }
        System.out.println("");
    }
}
