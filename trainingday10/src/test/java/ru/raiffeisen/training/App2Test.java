package ru.raiffeisen.training;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;


public class App2Test {

    public App2Test(){
        System.out.println("Constructor++ " + this);
    }

    @Rule
    public Timeout t = new Timeout(200);

    @Category({IFastMethod.class})
    @Test
    public void testMethod1Fast() throws InterruptedException {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
        Thread.sleep(400);
    }

    @Test
    public void testMethod2(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @Before
    public void initMethod(){
        System.out.print("Before: ");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }


    @After
    public void outMethod(){
        System.out.print("After: ");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @BeforeClass
    public static void initClasstest(){
        System.out.print("Before: ");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }


    @AfterClass
    public static void outClasstest(){
        System.out.print("After: ");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }



    @Test
    @Category({ISlowMethod.class})
    public void testMethod3Slow() throws InterruptedException {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
        Thread.sleep(300);
    }

    @Test
    @Category({IFastMethod.class})
    public void testMethod4Fast(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }




    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
        System.out.println("dtor "+ this);
    }
}
