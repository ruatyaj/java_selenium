package ru.raiffeisen.training;

public class Summator {

    //private int N;

    public static int summator(int ...  N){
       int d =0;

        for (int i = 0; i<N.length; i++)
        {
            d+=N[i];
        }

        return d;
    }
}
