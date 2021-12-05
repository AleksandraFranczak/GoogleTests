package pl.testyNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class SampleTestListener implements ITestListener {
    @Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        WebDriver driver=DriverFactory.getDriver();
        int randomName=(int) (Math.random()*1000);
        String fileName="ScreenshotFailedTest"+randomName+".png";

        System.out.println("I am taking screenshot");
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile,new File("src/test/resources/"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestStart(ITestResult arg0) {
       System.out.println("I am starting test from listener");

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

}
