
package com.ocp9;

class Bird{
    void move(){System.out.println("飛");}
}
class Ostrich extends Bird{
    void move(){System.out.println("跑");}
}

public class Zoo {
    public static void main(String[] args) {
        Ostrich o = new Ostrich();
        ((Bird)o).move();
        Bird b = new Bird();               
        //會發生轉型失敗 ClassCastException
        //((Ostrich)o).move();
        //正確寫法，要透過instanceof 驗證
        if(b instanceof Ostrich){
            System.out.println("b可以轉Ostrich");
            ((Ostrich)b).move();
        }else{
          System.out.println("b 不可以轉 Ostrich");
        }
        
    }
}
