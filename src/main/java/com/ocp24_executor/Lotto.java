
package com.ocp24_executor;

import java.util.Random;

/**
 *
 * @author MB-study
 */
public class Lotto implements Runnable{
    @Override
    public void run() {
        int n = new Random().nextInt(100);
        System.out.println(n);
    }
}
