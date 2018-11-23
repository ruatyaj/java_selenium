package ru.raiffeisen.training;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {



        public static Object[][] getDataFromFile(String fileName) {
            List<String> lines = null;

            try {
                lines = Files.readAllLines(Paths.get(fileName));
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }

            int numberOfLine = lines.size();
            Object[][] datas = new Object[numberOfLine][2];
            for (String st : lines) {
                    int g = 0;
                    for (String s : st.split(",")) {
                        int i =0;
                        datas[g][i] = Double.parseDouble(s);
                        i++;
                    }
                    g++;
            }
            return datas;
        }
    }

