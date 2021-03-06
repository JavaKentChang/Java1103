package com.ocp4;

/*
    調查五位學生之身高及體重如下。
    身高：172、168、164、170、176(公分)
    體重：62、57、58、64、64(公斤)
*/
public class ArrayDemo {
    public static void main(String[] args) {
        double[] height = {172, 168, 164, 170, 176};
        double[] weight = {62, 57, 58, 64, 64};
        // 算出身高總和
        double h_sum = getSum(height);
        // 算出體重總和
        double w_sum = getSum(weight);
        System.out.printf("%.1f, %.1f\n", h_sum, w_sum);
        // 算出身高平均
        double h_avg = getAvg(height);
        // 算出體重平均
        double w_avg = getAvg(weight);
        System.out.printf("%.1f, %.1f\n", h_avg, w_avg);
        //算出BMI均
        double bmi_avg = getBMIAvg(height, weight);//給予值的前後數值要正確唷
        System.out.printf("BMI平均： %.2f\n",bmi_avg);
        
    }
    public static double getBMIAvg(double[] h_array, double[] w_array) {
        if(h_array.length != w_array.length){
            System.out.println("資料長度不一致");
            return 0.0;
        }
        double bmi_sum = 0;//bmi 的總和
        //因為h_array與w_array 的長度是相同的，所以可以共用i值
        int len = h_array.length; //先把長度(筆數、個數)存入到len 變數中;
        for (int i = 0; i < h_array.length; i++) {
            double h = h_array[i];
            double w = w_array[i];
            double bmi = w/Math.pow(h/100,2);//計算bmi值
            bmi_sum += bmi;//累加bmi的總和
        }
        return bmi_sum / len; // 算出bmi 總和平均 回傳給getBMIAvg 數值;
    }
            
        
    
    
    public static double getSum(double[] array) {//
        double sum = 0;
        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double getAvg(double[] array) {
        double sum = getSum(array);
        return sum / array.length;
    }
}