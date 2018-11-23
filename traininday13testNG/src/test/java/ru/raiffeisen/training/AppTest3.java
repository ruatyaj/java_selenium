package ru.raiffeisen.training;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest3 {

    @Test(groups = {"fast"})
    public void testCase06() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @Test(groups = {"slow"})
    public void testCase07() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(false);
    }

    @Test
    public void testCase08() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @Test(dataProvider = "getLogin", dataProviderClass = DataLogic.class)
    public void testCase09(String name, String sname, String realLogin) {

        Assert.assertEquals(DataLogic.getLogin(name, sname), realLogin);

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    //@DataProvider(name = "dataSet1")
    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"KOT1", "Wiskas", "K/WISKAS"},
                {"KOT2", "Kiticat", "K/KITICAT"},
                {"KOT3", "Purina", "PURINA"},
                {"KOT4", "MYASO", "K/MYASO"}
        };
    }

    @DataProvider(name = "dataSet2")
    public static Object[][] getData2() {
        return new Object[][]{
                {"KOT1", "Wiskas", "K/WISKAS"},
                {"KOT2", "Kiticat", "K/KITICAT"},
        };
    }
}
