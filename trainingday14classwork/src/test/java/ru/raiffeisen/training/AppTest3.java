package ru.raiffeisen.training;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({MySuiteListener.class})
public class AppTest3 {


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Method " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void test01(ITestContext ctx){
        System.out.println("Suite "+ ctx.getSuite().getName() + ", Test " + ctx.getCurrentXmlTest().getName() + ", Method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }
}
