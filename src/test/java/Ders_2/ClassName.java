package Ders_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ClassName {
    static WebDriver driver;
    @Test
    public void driverTanimlama(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://gcreddy.com/project/admin/login.php");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("gcreddy");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Temp@2020");

        WebElement login = driver.findElement(By.id("tdb1"));
        login.click();

        String sayfaTitle = driver.getTitle();
        System.out.println("sayfaTitle = " + sayfaTitle);

        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        if(sayfaTitle.contains("osCommerce Online Merchant Administration Tool")){
            System.out.println("dogru sayfa");
        }
        else {
            System.out.println("yanlis sayfa");
        }

        WebElement administrator= driver.findElement(By.className("headerLink"));
        administrator.click();




    }
}
