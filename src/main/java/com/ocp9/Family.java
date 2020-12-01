
package com.ocp9;
class Father{
    public Father(){
        System.out.println("Father no money");
    }
    public Father(int money){
        System.out.println("Father's money= "+money);
    }
}

//若son 未繼承Father，則son會預設繼續object
//class son extends Objects
class son extends Father{
    public son(){
        super();
    }

}

public class Family {
    public static void main(String[] args) {
        son son = new son();
           
    }   
}
