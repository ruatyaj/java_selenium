package ru.raiffeisen.training;


import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class AppTest
{

    private static int arr[] = {3,5,6};
    private static int arr2[];

    @Test(priority = -1)
    public void testCase01(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr);
        Assert.assertTrue(true);
    }

    @Test(enabled = true,priority = -10)
    public void testCase02(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr2);
        Assert.assertTrue(true);
    }

    @Test(groups = {"Select1"})
    //@Ignore
    public void testCase03(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr);
        Assert.assertTrue(true);
    }


    @Test(dependsOnMethods = {"testCase03"})
    public void testCase04(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr);
        Assert.assertTrue(true);
    }

}
