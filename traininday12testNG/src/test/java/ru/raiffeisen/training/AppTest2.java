package ru.raiffeisen.training;


import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest2
{

    private static int arr[] = {3,5,6};
    private static int arr2[];


    @Test(dependsOnGroups = {"Select1"},enabled = true)
    public void testCase05(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr2);
        Assert.assertTrue(true);
    }



}
