package TekrarOdev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TekrarOdev_1 {
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
        driver.navigate().to("http://amazon.com");
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
        WebElement results22=driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));
        System.out.println("result of search s22 = " + results22.getText());



    }
    @Test
    @Ignore
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
        WebElement results22=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));




    }

    @AfterTest
    public void afterTest(){

    }
    @AfterMethod
    public void afterMethod(){

    }
    @AfterClass
    public void tearDown(){

        //driver.quit();
    }

}
