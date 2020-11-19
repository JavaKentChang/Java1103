
package com.ocp6;


public class Hamburger {
    private String name;
    private int price;
/*自己撰寫的建構子
public Hamburger(){

}
public Hamburger(String name,int price){
    this.name=name;//this.name物件的Name; name變數的name;
    this.price=price;
}    
    
自己撰寫的建構子*/
//用insert code 產生的
    //按右鍵，insert codes -> constructor

    public Hamburger() {
    }

    public Hamburger(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price > 0 ){
            this.price = price;
        }
        
    }
    //@Override//程式對程式的複寫
    /*自己寫的
    public String toString() {
        return name +"$"+ price;
    }
    */

    @Override
    public String toString() {
        return "Hamburger{" + "name=" + name + ", price=" + price + '}';
    }
           
    
}
