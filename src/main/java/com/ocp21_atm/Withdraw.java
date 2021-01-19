
package com.ocp21_atm;

/**
 *
 * @author MB-study
 */
public class Withdraw implements Runnable{
    private Account account;
    private int x;
    public Withdraw(Account account, int x){
        this.account = account;
        this.x = x;
    }
    

    @Override
    public void run() {
    account.withdraw(x);
    }
    
    
}
