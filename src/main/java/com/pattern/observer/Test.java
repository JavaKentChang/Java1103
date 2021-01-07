
package com.pattern.observer;


public class Test {
    public static void main(String[] args) {
        Subject  news  = new News();
        Observer user1 = new User("小明");
        Observer user2 = new User("小華");
        Observer user3 = new User("小英");
        
        news.add(user1);
        news.add(user2);
        news.add(user3);
        
        news.notifyObserver("今天天氣很冷~~~~");
        System.out.println();
        
        news.remove(user2);
              
        news.notifyObserver("明天會下雪~><");        
        
    }
    
}
