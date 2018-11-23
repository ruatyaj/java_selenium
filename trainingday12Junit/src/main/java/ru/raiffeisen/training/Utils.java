package ru.raiffeisen.training;

public class Utils {
    public static int summator(double ...  N){
        int d =0;

        for (int i = 0; i<N.length; i++)
        {
            d+=N[i];
        }

        return d;
    }

}
