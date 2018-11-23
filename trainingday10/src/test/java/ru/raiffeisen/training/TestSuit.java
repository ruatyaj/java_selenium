package ru.raiffeisen.training;


import javafx.beans.property.SimpleMapProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({AppTestStarter.class,App2Test.class})


public class TestSuit {

    @Test
    public void testMath(){
        Assert.assertEquals(100.00,TestSum.mult(20.00,5.00),1e-15);

    }


}
