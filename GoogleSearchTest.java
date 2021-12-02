import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest extends BaseSeleniumTest{

    @Test
    public void googleOpenTest()  {

        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.switchTo().frame(0); 
        
        By agreeButtonXpath=By.xpath("//*[@id=\"introAgreeButton\"]/span/span");
        WebElement agreeButton=driver.findElement(agreeButtonXpath);
        agreeButton.click();

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("seleniumhq.org");
        searchInput.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/a")).click();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser AutomationOLA", "Expected title is different than the actual one");
    }

}


