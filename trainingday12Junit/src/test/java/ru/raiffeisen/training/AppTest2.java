package ru.raiffeisen.training;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

@RunWith(Parameterized.class)
public class AppTest2 {

    private double a, b, res;
    private static Collection<Object[]> testList = null;

    public AppTest2(double a, double b, double res) {
        this.a = a;
        this.b = b;
        this.res = res;
    }


    //public AppTest2(){}

//    @BeforeClass
//    public static void classInit() {
//        testList = FileReaderSummator.getDataFromFile("src/test/resources/positiveTest");
//    }


    @Parameterized.Parameters
    public static Collection<Object[]> getData() {

        return FileReaderSummator.getDataFromFile("src/test/resources/positiveTest");
    }

    @Test
    public void testSummatorFromFile() {

        Assert.assertEquals(res, Utils.summator(a, b), 2 - 15);
    }
}
