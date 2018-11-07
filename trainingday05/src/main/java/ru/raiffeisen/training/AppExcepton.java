package ru.raiffeisen.training;


import com.sun.istack.internal.NotNull;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

class DATA {
    int d = 10;
}

public class AppExcepton {

    private static  void testDAta(DATA data) {
        System.out.println(data.d);
    }

    private static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        try {

            Engine eng1 = new Engine();

            eng1.addFuel(13);

            eng1.addFuel(4);

            eng1.addFuel(30);
        }

        catch (FuelProcessinExcwption ex) {
            System.out.println(ex);
        }

        DATA dat = null;
        if (dat != null)
        testDAta(dat);


        try {
            FileWriter fw = new FileWriter("Y:\\test.txt");

            fw.write("HALO");
            //fw.close();
        }
            catch(IOException ex) {
                System.out.println(ex);
            }
        }
    }
