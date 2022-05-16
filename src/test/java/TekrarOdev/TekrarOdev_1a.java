package TekrarOdev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TekrarOdev_1a {
    static WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to("http://amazon.com");
    }
    @Test
    public void Test01(){
        WebElement searchBilgisayar=driver.findElement(By.id("twotabsearchtextbox"));
        searchBilgisayar.sendKeys("bilgisayar");
        searchBilgisayar.submit();
        driver.navigate().to("http://facebook.com");
        driver.navigate().refresh();
        driver.navigate().back();
        WebElement searchc22=driver.findElement(By.id("twotabsearchtextbox"));
        searchc22.clear();
        searchc22.sendKeys("s22");
        searchc22.submit();
        WebElement results22 = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println("results22 = " + results22.getText());
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
