package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assertion {
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
    }
    @Test
    public void test1(){
        //Assert.assertEquals();  //string olanmmetinler üzerinden
        //Assert.assertFalse();   //aradigimiz ürünün olMAMAsini görünmemesi gerekiyor.
        //Assert.assertFalse();   //...olmasi...

        driver.get("https://google.com");
        String title=driver.getTitle();
        System.out.println(title);

        Assert.assertEquals("Google",title);
        System.out.println("Test gecti");

    }
    @Test
    public void Test2(){
        driver.get("http://youtube.com");


        String youtubeTitle=driver.getTitle();
        System.out.println("youtubeTitle = " + youtubeTitle);
        boolean iceryormu=youtubeTitle.contains("YouTube");
        Assert.assertTrue(iceryormu);

    }
    @Test
    public void Test3(){
        driver.get("http://facebook.com");
        String facebookTitle=driver.getTitle();
        System.out.println("facebookTitle = " + facebookTitle);
        boolean iceriyormu=facebookTitle.contains("youtube");
        Assert.assertFalse(iceriyormu);
    }
}

