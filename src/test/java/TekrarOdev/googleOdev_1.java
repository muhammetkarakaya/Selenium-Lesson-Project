package TekrarOdev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class googleOdev_1 {
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

    }
    @BeforeTest
    public void beforeTest(){

    }
    @Test
    public void Test01(){
        driver.get("http://google.com");
        String titleGoogle=driver.getTitle();
        System.out.println("titleGoogle = " + titleGoogle);
        String urlGoogle=driver.getCurrentUrl();
        System.out.println("urlGoogle = " + urlGoogle);
        if(titleGoogle.equals("Google"))
            System.out.println("titleGoogle = dogrudur");
        else System.out.println("titleGoogle = yanlistir");
        if (urlGoogle.equals("https://www.google.com/?gws_rd=ssl"))
            System.out.println("urlGoogle = dogrudur");
        else System.out.println("urlGoogle = yanlistir");
    }
    @Test
    public void Test02() throws InterruptedException {
        //driver.get("http://google.com");
        WebElement googleGüvenlikKontrolü= driver.findElement(By.xpath("//*[.='Ich stimme zu']"));
        Thread.sleep(2000);
        googleGüvenlikKontrolü.click();
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("Kulaklik");
        search.submit();
        WebElement resultKulaklik=driver.findElement(By.id("result-stats"));
        System.out.println("resultKulaklik = " + resultKulaklik.getText());
        driver.navigate().back();
        WebElement search2=driver.findElement(By.name("q"));
        search2.sendKeys("Masa");
        search2.submit();
        WebElement resultMasa=driver.findElement(By.id("result-stats"));
        System.out.println("resultMasa = " + resultMasa.getText());
        driver.navigate().back();
        WebElement search3=driver.findElement(By.name("q"));
        search3.sendKeys("Sandalye");
        search3.submit();
        WebElement resultSandalye=driver.findElement(By.id("result-stats"));
        System.out.println("resultSandalye.getText() = " + resultSandalye.getText());
        


    }
    @Test
    public void Test03(){
        System.out.println("Test03 calisti");

    }
    @AfterTest
    public void afterTest(){

    }
    @AfterMethod
    public void afterMethod(){

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
