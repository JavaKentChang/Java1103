
package com.pattern.decorator;


public class SideDish extends Food{
    protected Food food;
    @Override
    
    public int getPrice() {
        return price + food.getPrice();       
    }

    public SideDish(Food food) {
        this.food = food;
    }

    @Override
    public String getName() {
        return food.getName()+ " + "+name;
    }
    
    
}
