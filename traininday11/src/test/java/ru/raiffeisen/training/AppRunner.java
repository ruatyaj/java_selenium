package ru.raiffeisen.training;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AppRunner {

    public static void main( String[] args )
    {

        Result res = JUnitCore.runClasses(AppTest2.class,AppTest2.class);

        for (Failure f: res.getFailures()){
            System.out.println(f.toString());
        }
    }
}
