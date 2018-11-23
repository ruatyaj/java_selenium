package ru.raiffeisen.training;

import org.junit.Assert;
import org.junit.Test;

public class TestSum {

    double a = 0.53878,b=0.534546,c=1.06356;
    @Test
    public void mathMethod(){

        Assert.assertEquals("Result of operation ",a,b,2);
        Assert.assertEquals(c,a+b,1e-2);

    }


    public static double mult (double a, double b){return a*b;}

}
