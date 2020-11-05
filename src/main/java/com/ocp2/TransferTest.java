
package com.ocp2;

public class TransferTest {
    public static void main(String[] args) {
        Accout ac1 = new Accout();
        ac1.name = "John";
        ac1.setBalance(10000);
        Accout ac2 = new Accout();
        ac2.name = "Mary";
        ac2.setBalance(10000);
        System.out.println("轉帳前金額為:");
        ac1.printBalance();
        ac2.printBalance();
        ac1.transfer(4000, ac2);
        System.out.println("轉帳後金額為：");
        ac1.printBalance();
        ac2.printBalance();
    }
    
}
