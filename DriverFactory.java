package pl.testyNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver; 

    public static WebDriver getDriver(){
        String path="C:\\Users\\aliczbinska\\Desktop\\Instalki\\drivers\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        if(driver==null){
            driver= new ChromeDriver();
        }
        return driver;
    }
}
