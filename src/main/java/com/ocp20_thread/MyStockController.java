/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp20_thread;

import java.util.Date;
import java.util.concurrent.FutureTask;
import javax.swing.JLabel;
import yahoofinance.Stock;

/**
 *
 * @author MB-study
 */
public class MyStockController implements Runnable{
    private String symbol;
    private JLabel priceLabel;
    private JLabel changeLabel;
    private static boolean play;

    public MyStockController(String symbol,JLabel priceJLabel,JLabel changJLabel) {
        this.symbol=symbol;
        this.priceLabel=priceJLabel;
        this.changeLabel=changJLabel;
        play = true;
    }
    
    @Override
    public void run(){
        while (play) {            
            try {
                System.out.println(new Date());
                FutureTask<Stock> task = new FutureTask<>(new MyStock(symbol));
                new Thread(task).start();//放到執行續執行
                Stock stock = task.get();
                double price = stock.getQuote().getPrice().doubleValue();
                double change = stock.getQuote().getChange().doubleValue();
                priceLabel.setText(String.format("%.2f", price));
                changeLabel.setText(String.format("%.2f", change));
                Thread.sleep(3000);      
                       
            } catch (Exception e) {
            }
        }
    }
    
}
