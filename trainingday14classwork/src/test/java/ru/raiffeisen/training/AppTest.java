package ru.raiffeisen.training;


import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AppTest {

    private static String fname;

    @BeforeSuite
    @Parameters({"fname"})
    public void initSuit(String s){
        System.out.println("fname: " + s);
        fname = s;
    }

    @DataProvider(name = "data")
    public Object[][] getDataFromFile() {
        System.out.println("file" + fname);
        return FileReader.getDataFromFile(fname);


    }

    @Test(dataProvider = "data")
    public void testCase09(double a, double b, double res) {
        Assert.assertEquals(res, Summator.summa(a, b),1e-15);

    }


    //@DataProvider
//    public static Object[][] getData() {
//        return new Object[][]{
//                {1, 2, 3},
//                {5, 2, 7},
//
//        };
//    }

    }

