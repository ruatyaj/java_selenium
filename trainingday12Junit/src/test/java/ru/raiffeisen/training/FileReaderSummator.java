package ru.raiffeisen.training;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FileReaderSummator {

    public static Collection<Object[]> getDataFromFile(String fileName) {
        List<String> lines = null;
        Collection<Object[]> testData = new ArrayList<>();
        Object argData[];

        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }

        for (String st : lines) {
            if (!st.isEmpty() && !st.startsWith("#")) {
                //System.out.println(st);

                st = st.trim();
                int g = 0;
                argData = new Object[3];
                for (String s : st.split(",")) {
                    s = s.trim();
                    argData[g] = Double.parseDouble(s);
                    g++;
                }
                testData.add(argData);
            }
        }
        return testData;
    }
}
