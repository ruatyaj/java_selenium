package ru.raiffeisen.training;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{

    @Test
    public void test()
    {
        assertEquals(100,Summator.summator(1,2,3,4));
    }
}
