package ru.raiffeisen.training;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class AppTest2 {

    @Test
    public void test01(ITestContext ctx){
        System.out.println("Suite "+ ctx.getSuite().getName() + ", Test " + ctx.getCurrentXmlTest().getName() + ", Method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @BeforeTest
    public void InitSuite (ITestContext ctx){
        System.out.println("Init test" + ctx.getCurrentXmlTest().getName());
    }

    @AfterTest
    public void afterSuite (ITestContext ctx){
        System.out.println("After test" + ctx.getCurrentXmlTest().getName());
    }


    @Test
    public void test03(ITestContext ctx){
        System.out.println("Suite "+ ctx.getSuite().getName() + ", Test " + ctx.getCurrentXmlTest().getName() + ", Method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }
    @Test
    public void test04(ITestContext ctx){
        System.out.println("Suite "+ ctx.getSuite().getName() + ", Test " + ctx.getCurrentXmlTest().getName() + ", Method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

}
