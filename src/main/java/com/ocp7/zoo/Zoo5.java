
package com.ocp7.zoo;

public class Zoo5 {
    public static void main(String[] args) {
        Animal[] animals = {
        new Bird("鸚鵡",2),
        new Lion("美洲獅",4),
        new Ostrich("非洲鴕鳥",2)
        };
        System.out.println(animals);
        System.out.println(animals[0]);
        System.out.println(animals[1]);
        System.out.println(animals[2]);
        int sum =0;
        int foot_sum=0;
        //利用不同for迴圈
        for (Animal animal : animals) {
            System.out.println(animal);
            sum +=animal.getFoot();
        }
        //利用
        for (int i = 0; i < animals.length; i++) {
            foot_sum +=animals[i].getFoot();   
        }
        System.out.println(sum);
        System.out.println("共有:"+foot_sum);
    }
        
}
    
