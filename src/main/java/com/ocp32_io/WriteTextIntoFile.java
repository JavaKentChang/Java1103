
package com.ocp32_io;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class WriteTextIntoFile {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\ocp32_io\\files\\Data.txt");
        
        FileWriter fw = null; // 最後一定要close
        try {
            fw = new FileWriter(file);
            fw.write("Hello World");
            System.out.println("寫檔成功");
        } catch (Exception e) {
        } finally{
             try {
                fw.close();
             } catch (IOException ex) {
           }   
        }
    }
}
