package com.ocp10.pet.service;

import com.ocp10.pet.entity.Chihuahua;
import com.ocp10.pet.entity.Pet;
import com.ocp10.pet.entity.EDog;
import com.ocp10.pet.entity.Shiba;

public class PetService {

    //取得目前所有的寵物(Pet)
    public Pet[] getPets() {
        Pet[] pets = {
            new Chihuahua(15000),
            new Chihuahua(20000),
            new Shiba(26000),
            new Shiba(18000),
            new EDog(300),
            new EDog(300),};
        return pets;
    }

    public int allPrice(Pet[] pets) {
        int sum = 0;
        for (Pet pet : pets) {
            sum += pet.getPrice();
        }
        return sum;
    }

    public void print(Pet[] pets) {
        for (Pet pet : pets) {
            String className = pet.getClass().getSimpleName();
            int price = pet.getPrice();
            System.out.printf("%s 價格 %d 飲食", className, price);
            pet.eat();
        }
    }

    //查出所有柴犬的價格
    public int getPricebyShiba(Pet[] pets) {
        int sum = 0;
        for (Pet pet : pets) {
            String className = pet.getClass().getSimpleName();
            if (className.equals("Shiba")) {
                sum += pet.getPrice();
            }
        }
        return sum;
    }

    // 查出指定寵物的總價
    public int getPriceByPet(Pet[] pets, Class clazz) {
        int sum = 0;
        for (Pet pet : pets) {
            String className = pet.getClass().getSimpleName();
            if (className.equals(clazz.getSimpleName())) {
                sum += pet.getPrice();
            }
        }
        return sum;
    }

    //印出每一個寵物的總價
    public void printEachTotalPriceByPet(Pet[] pets) {
        Class[] clazzes = {Chihuahua.class, Shiba.class, EDog.class};
        for (Class clazz : clazzes) {
            String clazzName = clazz.getSimpleName();
            //int totalPriceByPet = service.getPriceByPet(pets, clazz);//原本這行是從petStore取得，因放回到service，所以要取消
            int totalPriceByPet = getPriceByPet(pets, clazz);
            System.out.printf("Total price(%s) : %,d\n",
                    clazzName, totalPriceByPet);
        }
    }

    //印出最高價寵物
    public void printPetMaxprice(Pet[] pets) {
        Pet p = null; //先 new 一個空的寵物;
        for (Pet pet : pets) {
            if (p == null) { //第一次比
                p = pet;
                continue;
            }
            if (pet.getPrice() > p.getPrice()) {
                p = pet;
            }

        }
        System.out.printf("最高價寵物: %s 價格: %,d\n",
                p.getClass().getSimpleName(), p.getPrice());

    }

}
