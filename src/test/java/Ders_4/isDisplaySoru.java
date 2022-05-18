package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class isDisplaySoru {
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver.get("http://bestbuy.com");


    }
    @Test
    public void titleTest(){
        String title=driver.getTitle();
        boolean bestIcerirmi = title.contains("Best");
        Assert.assertTrue(bestIcerirmi);


    }
    @Test
    public void logoTest(){
        WebElement logo=driver.findElement(By.className("logo"));
        boolean logoGorunuyormu =logo.isDisplayed();
        Assert.assertTrue(logoGorunuyormu);
    }
    @Test
    public void mexicoLinkTest(){
        WebElement mexicoLink= driver.findElement(By.partialLinkText("Mexico"));
        boolean MexicoLinlkiVarmi= mexicoLink.isDisplayed();
        Assert.assertTrue(MexicoLinlkiVarmi);
    }

}
