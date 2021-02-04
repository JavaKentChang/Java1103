
package com.ocp32_io;
import java.io.File;

//建立資料夾.../ocp32_io/files資料夾
public class CreateFolder {
    public static void main(String[] args) {
        String path="src\\main\\java\\com\\ocp32_io";
        File folder = new File(path);
        //確認folder是否是資料夾?
        if(folder.isDirectory()){
        //建立files 資料夾
        //folder.getPath() = "src\\main\\java\\com\\ocp32_io"
        //File.separator = "\\"
        File files = new File(folder.getPath()+ File.separator+"files");
        //確認是否已經被建立
        if(files.exists()){
            System.out.printf("%s 已經被建立",files);
            
        }else {
            System.out.printf("建立 %s 目錄\n",files);
            
                boolean check = files.mkdir();
                if(check){
                    System.out.println("成功");
                }else{
                    System.out.println("失敗");
                }
            
            }
        }
        else{
            System.out.printf("%s 不是資料夾\n",folder);
        }
    }
}
