
package com.ocp10.computer;

import java.math.BigInteger;
//因為半成品抽象類別，所以要加註abstract
public abstract class Mobile implements Computer{

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
    //以下mobile回傳手機不太對，所以可以全部取消。
    //因為半成品抽象類別，所以在類別上要加上 abstract
    /*@Override
    public String getName() {
            return ("手機");
    }
    */
    
}
