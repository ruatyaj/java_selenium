package ru.raiffeisen.training;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyTestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("---startTest   " + iTestResult.getName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

        System.out.println("---start   " + iTestContext.getName());

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("---finish   " + iTestContext.getName());

    }
}
