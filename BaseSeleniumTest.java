import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseSeleniumTest {
//Lekcja.162
protected WebDriver driver;  //modyfikator dostępu ,protected' żeby klasy dziedziczące miały dostęp
    @BeforeTest
    public void setUp(){
        System.out.println("Before test");
        String driverPath = "C:\\Users\\ola\\IdeaProjects\\kursSeleniumUdemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown() {
        System.out.println("After test");
     //   driver.quit();
    }
}
