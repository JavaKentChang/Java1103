
package com.ocp10;
//規格是一個方法簽章，我要建立一個電腦規格，110v，別人無法變更
public interface Computer {
    int volt = 110;         //伏特
    int add(int x, int y);  //計算
    String getName();       //品牌提供一個品牌的名字
}
