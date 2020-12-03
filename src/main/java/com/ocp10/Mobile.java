
package com.ocp10;

import java.math.BigInteger;

public class Mobile implements Computer{

    @Override
    //故意寫成比較複雜的算式
    public int add(int x, int y) {
        //BigInteger 數字可以超過Long，可以到無限大，大資料的計算
        //BigInteger <--大整數，只能運算整理，BigDecimal <---，這個可以運算小數
        BigInteger b1 = new BigInteger(x+"");
        BigInteger b2 = new BigInteger(y+"");
        BigInteger sum = b1.add(b2);
            return sum.intValue();
    }

    @Override
    public String getName() {
            return ("手機");
    }
    
}
