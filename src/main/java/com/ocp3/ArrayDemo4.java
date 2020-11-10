
package com.ocp3;
/*    
    調查五位學生之身高及體重如下。
    調查這個班級的身高及體重的分散程度比較高
    身高：172、168、164、170、176(公分)
    體重：62、57、58、64、64(公斤)
    比較其分散的程度(cv:變異系數)
    標準差公式 : https://zh.wikipedia.org/wiki/%E6%A8%99%E6%BA%96%E5%B7%AE
    變異係數公式 : 標準差 / 平均
*/
public class ArrayDemo4 {
    public static void main(String[] args) {
        double[] h = new double[]{172,168,164,170,176};
        double[] w = new double[]{62,57,58,64,64};
        double h_sum = 0;
        double h_avg = 0;
        double h_diff_sum=0;
        for (int i = 0; i < h.length; i++) {
            h_sum += h[i];            
        }
        for (int i = 0; i < h.length; i++) {
           h_diff_sum += Math.pow(h[i]-h_avg,2); 
        }
        
        System.out.printf("身高總和：%.2f\n",h_sum);
        h_avg = h_sum/h.length;
        System.out.printf("身高平均：%.2f\n",h_avg);
        double h_sd =Math.sqrt((1.0/h.length)*h_diff_sum);
        System.out.printf("身高平方差的總和：%.2f\n",h_diff_sum);
        System.out.printf("身高的標準差(SD):%.2f",h_sd);
        double h_cv = h_sd/h_avg;
        System.out.printf("身高的變異系數(CV):%.2f",h_cv);
        
    }
}
