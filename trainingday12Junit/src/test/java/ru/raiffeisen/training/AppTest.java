package ru.raiffeisen.training;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;


@RunWith(Parameterized.class)
public class AppTest {

    private double a,b,res;

    public AppTest(double a, double b, double res) {
        this.a = a;
        this.b = b;
        this.res = res;
    }


     @Parameterized.Parameters
    public static ArrayList<Object> getData() {

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Object[]{4, 2, 6});
        arrayList.add(new Object[]{4, 1, 5});
        arrayList.add(new Object[]{4, 8, 13});


        //return Arrays.asList(new Object[][]{{4, 2, 6}, {21, 1, 22}, {3, 20, 23}, {3, 2, 1}});
        return arrayList;
    }


    @Test
    public void testSummator() {
        Assert.assertEquals(res, Utils.summator(a, b), 2 - 15);

    }
}
