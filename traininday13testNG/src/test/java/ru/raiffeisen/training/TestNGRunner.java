package ru.raiffeisen.training;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.Arrays;

public class TestNGRunner {


    public static void main(String[] arg) {

        TestNG testNG = new TestNG();
        //testNG.setTestClasses(new Class[]{AppTest2.class});

        //if (testNG.hasFailure()) System.out.println("Errors!!!");

        XmlSuite s1 = new XmlSuite();
        s1.setName("Virtual_suite");

        XmlTest t1 = new XmlTest(s1);
        t1.setName("virtual");

        XmlClass c1 = new XmlClass();
        c1.setClass(AppTest3.class);

        t1.setClasses(Arrays.asList(
                new XmlClass[]{c1}
        ));

        s1.setTests(Arrays.asList(
                new XmlTest[]{t1}
        ));


        testNG.setXmlSuites(Arrays.asList(
                new XmlSuite[]{s1}
        ));

//        testNG.setTestSuites(Arrays.asList(
//                new String[]{"testngfast.xml",
//                        "testng.xml"}
//
//        ));

        testNG.run();

    }
}
