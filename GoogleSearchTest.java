import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest extends BaseSeleniumTest{
//Lekcja.162
    @Test
    public void googleOpenTest()  {
//2) Wylączam pop up window (klikam na I Agree buton i wyłączam ten iframe)
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.switchTo().frame(0); // to sama ogarnęłam
        driver.findElement(By.xpath("//*[@id=\"introAgreeButton\"]/span/span")).click(); //po zaakceptowaniu iframe sam się on zamyka więc nie trzeba wracać
//3) Wpisuję frazę w inpucie szukania w google
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("seleniumhq.org");
        searchInput.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/a")).click();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser AutomationOLA", "Spodziewany tytuł jest inny niż faktyczny");
    }

}


