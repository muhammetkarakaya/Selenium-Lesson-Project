package Ders_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigationKomutlar {
    static WebDriverManager driver;

    @Test
    public void driver_Tanimlama() throws InterruptedException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.get("https://google.com");
        // baska  bir sayfaya gideriz

        Thread.sleep(3000);
        driver.navigate().to("https://amazon.com");
        //önceki sayfaya geri döndük
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();

    }
}
