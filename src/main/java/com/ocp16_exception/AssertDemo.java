
package com.ocp16_exception;

import java.util.Random;


public class AssertDemo {
    public static void main(String[] args) {
        int x = new Random().nextInt(100);
        //假設X都應該大於等於>=60
        assert(x>=60):"發生Assert 錯誤，挑戰失敗 X= "+x;
        System.out.printf("%d 大於等於>=60 正確\n",x);
    }
    
}
