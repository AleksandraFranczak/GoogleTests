package pl.testyNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;  //Teraz już driver może zostać ustawiony jako prywatny!!! Bo
//Lekcja: 220 (Rozwiązanie pracy domowej)
// PROBLEM: w SampleTestListenerze użyty jest nowy driver, a powinien być użyty ten co już był tworzony w tescie
// dlatego tworzę te klasę

    public static WebDriver getDriver(){
        String path="C:\\Users\\aliczbinska\\Desktop\\Instalki\\drivers\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        if(driver==null){
            driver= new ChromeDriver();
        }
        return driver;
    }
}
