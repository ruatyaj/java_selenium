package ru.raiffeisen.training;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest2
{

    @Test
    public void meth5()
    {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @Test
    public void meth6()
    {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertEquals(10,10);
    }

    @Test
    public void meth7()
    {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(false);
    }

    @Test
    public void meth8()
    {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertEquals(10,10);
    }
}
