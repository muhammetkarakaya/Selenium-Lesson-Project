package TekrarOdev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TekrarOdev_3a {


    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void beforeMethod()  {
        driver.get("https://youtube.com");
    }

    @Test
    public void Test1 () throws InterruptedException {
        Thread.sleep(2000);
        WebElement güvenlikDuvari = driver.findElement(By.xpath("//*[.='Accept all']"));
        güvenlikDuvari.click();
        Thread.sleep(2000);

        WebElement search = driver.findElement(By.xpath("//input[@class='ytd-searchbox']"));
        search.sendKeys("daha dün annemizin");
        search.submit();

        WebElement seciliParca=driver.findElement(By.linkText("Daha Dün Annemizin - Sevimli Dostlar çizgi film çocuk şarkıları 2017 - Adisebaba TV Bebek Şarkıları"));
        seciliParca.click();





    }




    @AfterClass
    public void teardown(){
        //driver.quit();
        System.out.println("bitti");
    }




}


