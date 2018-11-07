package ru.raiffeisen.training;

import java.util.Random;

public class Util {

    public static int getRandom (int min, int max){
    int N = 1000;
    long seed = System.currentTimeMillis();
    int i = new Random().nextInt(N);
    return min + i*(max-min)/N;
    }

    public static int getRandom2 (int min, int max){
        //int N = 1000;
        //long seed = System.currentTimeMillis();
        double d = new Random().nextDouble();
        return min + (int)(d*(max-min));
    }

    public static void getsymbols (int N, String znak){
        System.out.println();
        int n = 1;
        while (n <= N)
        {
        System.out.println(znak);
            n++;
        }




    }

}
