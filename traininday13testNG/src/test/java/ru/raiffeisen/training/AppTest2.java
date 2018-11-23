package ru.raiffeisen.training;


import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class AppTest2
{
    @Test(priority = -1,groups = {"fast","highPriority"})
    public void testCase03(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @Test(groups = {"highPriority"})
    public void testCase04(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(false);
    }

    @Test
    public void testCase05(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }
}
