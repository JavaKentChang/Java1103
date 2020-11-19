
package com.ocp6;

public class SetMeal {
    private Hamburger hamburger;
    private SideMeal sideMeal;
    private Drink drink;
//總金額
    private int sum; // 這個sum值是在建構子產生時，就加總了。
    
    
    //要求套餐一定都要有東西
    public SetMeal(Hamburger hamburger, SideMeal sideMeal, Drink drink) {
        this.hamburger = hamburger;
        this.sideMeal = sideMeal;
        this.drink = drink;
        this.sum = hamburger.getPrice()+sideMeal.getPrice()+drink.getPrice();
    }
//只提供Getter 給外面值，不可以變更價格
    public int getSum() {
        return sum;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public SideMeal getSideMeal() {
        return sideMeal;
    }

    public void setSideMeal(SideMeal sideMeal) {
        this.sideMeal = sideMeal;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "SetMeal{" + "hamburger=" + hamburger + ", sideMeal=" + sideMeal + ", drink=" + drink + '}';
    }
    
}
