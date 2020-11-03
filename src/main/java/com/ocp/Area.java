
package com.ocp;


public class Area {
    int w;
    int h;
    void calcAndPrint(){
        int sum = w * h;
        System.out.println(sum);
    }
    int calcNotPrint(){// 代表有回傳一個int 結果
        int sum = w * h;
        return sum; // 代表它有回傳一個結果
    }    
        
}
