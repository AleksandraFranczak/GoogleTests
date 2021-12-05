package pl.testyNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

@Listeners(value={SampleTestListener.class})
public class CheckNewlyAppearedText {
    WebDriver driver;
    @Test
    public void secondText() throws InterruptedException {
        driver=DriverFactory.getDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        WebElement clickOnMeButton=driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();


        WebElement newParagraph=driver.findElement(By.cssSelector("p"));
        newParagraph.getText();

        SoftAssert softAssert=new SoftAssert(); //stosuję miękką asercję

        softAssert.assertEquals(newParagraph.getText(),"Dopiero się pojawiłem hehehehehhe!","Teksty są różne"); //fałszywa asercja
        softAssert.assertFalse(newParagraph.getText().isEmpty());
        softAssert.assertTrue(newParagraph.getText().startsWith("Dopiero"));
        // driver.quit();
        softAssert.assertAll();}
}
