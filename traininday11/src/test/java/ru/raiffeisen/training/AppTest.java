package ru.raiffeisen.training;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.JUnitCore;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test()
    @Category({IRegressTest.class})
    public void meth1()
    {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertEquals(10,10);
    }

    @Test
    public void meth2()
    {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @Test
    public void meth3()
    {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(false);
    }

    @Test
    @Category({IRegressTest.class})
    public void meth4()
    {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotEquals(10,11);
    }
}
