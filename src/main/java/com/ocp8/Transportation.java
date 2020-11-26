package com.ocp8;

//交通工具(父類別)
public class Transportation {
    private String name;
    private int amount;
    private int km;
    private int price;
    private int rentnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRentnum() {
        return rentnum;
    }

    public void setRentnum(int rentnum) {
        this.rentnum = rentnum;
    }

    @Override
    public String toString() {
        return "Transportation{" + "name=" + name + ", amount=" + amount + ", km=" + km + ", price=" + price + ", rentnum=" + rentnum + '}';
    }



    
    
    
}
