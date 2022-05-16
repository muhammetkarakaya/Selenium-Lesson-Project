package Ders_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class driverTanimlama {
    static WebDriverManager driver;

    @Test
    public void driver_Tanimlama(){
        //driver i kullanilabilir hale getirme
        WebDriver driver;
        //driver imizi chrome drivera tanitiyoruz
        WebDriverManager.chromedriver().setup();
        //driver nesnesi olusturma
        driver=new ChromeDriver();
        //sayfayi tam ekran yapiyoruz.
        driver.manage().window().maximize();
        //sayfa yüklenene kadar bekle
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");






    }

}
