
package com.ocp7;


public class BookStore {
    public static void main(String[] args) {
        Book.publishName = "Microsoft";
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book("Python",70);
        
        b1.setName("Java");
        b1.setPrice(100);
        
        b2.setName("VB");
        b2.setPrice(100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
  
}
