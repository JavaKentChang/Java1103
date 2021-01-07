
package com.pattern.decorator;

public class Bread extends Food {

    public Bread() {
        name= "麵包";
        price= 40;
    }
    
    @Override
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
  
}
