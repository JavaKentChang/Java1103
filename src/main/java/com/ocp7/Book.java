
package com.ocp7;

public class Book { //物件屬性
private String name;
private int price;
public static String publishName = "gotop";//出版社

//預設建構子
public Book(){
    System.out.println("執行預設建構子");
}

//自己設定一個建構子，帶參數值的

public Book(String name,int price){
    System.out.println("執行自定建構子");
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
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", price=" + price + ", publishName=" + publishName + '}';
    }

   

}
