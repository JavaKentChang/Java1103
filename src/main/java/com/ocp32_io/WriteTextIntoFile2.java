
package com.ocp32_io;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class WriteTextIntoFile2 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\ocp32_io\\files\\Data.txt");
        //使用 try-with-resource 的語法
        
        try(FileWriter fw = new FileWriter(file)) {
            fw.write("恭喜發財ㄝ " + new Date()+"\n");
            System.out.println("寫檔成功");
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
