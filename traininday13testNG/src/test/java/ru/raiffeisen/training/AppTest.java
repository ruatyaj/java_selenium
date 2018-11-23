package ru.raiffeisen.training;


import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest
{
    @Test(groups = {"slow"})
    @Parameters({"data1","p"})
    public void testCase01(double d, double percent){
        System.out.println(("d="+d+" result="+(percent*d)));
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @Test(groups = {"fast"})
    @Parameters({"greee6"})
    public void testCase02(@Optional("BOO") String gr){
        System.out.println("Parametrs" +gr);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }
}
