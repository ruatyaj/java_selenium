package ru.raiffeisen.training;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//import java.io.
//import java.nio.
public class AppIO {

    public static void main(String[] args) {
        File file = new File("C:\\training\\");
        File file2 = new File("C:\\training\\test1\\test2\\");// создание каталога
        File file3 = new File("C:\\training\\text.txt");

        if (!file2.exists()) file2.mkdirs();
        try {
            Files.copy(file3.toPath(), Paths.get("C:\\training\\test1\\res.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.out.println(ex);
        }

        if (file.isAbsolute())
            for (File f : file.listFiles()) {
                System.out.println(f + "\t file" + f.isFile());
            }

    }
}
