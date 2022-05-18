package TekrarOdev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class googleOdev_1b {

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://google.com");
    }

    @Test
    public void test1() throws InterruptedException {
        WebElement guvenlikDuvari=driver.findElement(By.xpath("//*[.='Ich stimme zu']"));
        Thread.sleep(3000);
        guvenlikDuvari.click();

        String titleGoogle= driver.getTitle();
        System.out.println("GoogleTitle => "+ titleGoogle);
        String urlGoogle= driver.getCurrentUrl();
        System.out.println("UrlGoogle => "+ urlGoogle);

        if(urlGoogle.contains("goog")) {
            System.out.println("Var " + urlGoogle);
        }else{
            System.out.println("Yok " + urlGoogle);
        }
        WebElement arama= driver.findElement(By.name("q"));
        arama.sendKeys("Kulaklik"+ Keys.ENTER);

    }
    @Test
    public void test2(){
        WebElement arama= driver.findElement(By.name("q"));
        arama.sendKeys("masa"+ Keys.ENTER);



    }
    @Test
    public void test3(){
        WebElement arama= driver.findElement(By.name("q"));
        arama.sendKeys("sandalye"+Keys.ENTER);
    }
    @AfterMethod
    public void AfterMethod(){
        WebElement sonuc=driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());
    }
    @AfterClass
    public void tearDown(){

        driver.close();
    }
}