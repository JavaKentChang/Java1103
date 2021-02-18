
package com.ocp33_nio;

import com.sun.xml.internal.bind.api.impl.NameConverter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("src\\main\\java\\com\\ocp33_nio\\a.txt");
        Path target = Paths.get("src\\main\\java\\com\\ocp33_nio\\b.txt");
        //若copy的目的已有b.txt, 則replace_existing 可有可無,反之一定要寫
        Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING);
    }
}
