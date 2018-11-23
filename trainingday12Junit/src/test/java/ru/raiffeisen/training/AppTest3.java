package ru.raiffeisen.training;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AppTest3 {

    public AppTest3() {
        this.data = data;
    }

    private String data;

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][]
                {{"HOH555"},
                {"LOS333"},
                 {"LOST333"}});
    }


    @Test
    public void testParam() {
        System.out.println(data);
        Assert.assertTrue(data.matches("^[A-Z]{3}[0-9]{5,10}.*"));
    }

}
