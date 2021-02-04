
package com.ocp32_io;

import java.io.File;


public class CreateFile {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp32_io\\files";
        String fname= "Data.txt";
        File file = new File(path + File.separator + fname);
        if(file.exists()){
            System.out.printf("%s 檔案已存在\n",file);   
        }else{
            System.out.printf("%s 建立檔案\n",file);
            try {
                if(file.createNewFile()){
                    System.out.println("成功");
                }else{
                    System.out.println("失敗");
                }
            } catch (Exception e) {
                System.out.printf("%s 建立檔案失敗\n",e);
            }
        }
    }
}
