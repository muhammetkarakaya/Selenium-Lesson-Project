package TekrarOdev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TekrarOdev_3 {
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
        driver.navigate().to("https://youtube.com");
    }
    @Test
    public void Test01() throws InterruptedException {
        Thread.sleep(2000);

        WebElement acceptPolicy= driver.findElement(By.className("style-scope tp-yt-paper-button"));

        acceptPolicy.click();

    }
    @Test
    public void Test02(){

    }
    @Test
    public void Test03(){

    }
    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

}
