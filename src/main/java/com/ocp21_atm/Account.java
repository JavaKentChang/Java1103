
package com.ocp21_atm;

/**
 *
 * @author MB-study
 */
public class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    //提款x 
    public void withdraw(int x){
        String name = Thread.currentThread().getName();
        System.out.printf("%s 誰進來提款ㄌ\n",name);
        int temp_money = getMoney();
        
        for(int i=1;i<999999;i++);
        
        if(temp_money>=x){//餘額充足
            //提款成功回寫餘額
            setMoney(temp_money-x);
            System.out.printf("%s 提款 $%d 成功，帳戶餘額: $%d\n",name,x, getMoney());
        }else{
            System.out.printf("%s 提款: $%d 失敗, 帳戶餘額: $%d\n", name, x, getMoney());
        }
        
      
        System.out.printf("%s 完成提款ㄌ\n",name);
    
    }
}
