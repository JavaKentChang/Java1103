
package com.ocp33_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo3 {
    public static void main(String[] args) {
        Path p1 = Paths.get("c:/aaa/bbb/ccc/salary.txt");
        Path p2 = Paths.get("c:/aa");
        Path p3 = Paths.get("salay.txt");
        System.out.println(p1.startsWith(p2)); // 起始是否相同
        System.out.println(p1.endsWith(p3)); // 結尾是否相同
    }
    
}
