package Ders_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CssSelector {
    WebDriver driver;

    @Test
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://facebook.com");

        WebElement güvenlikDuvari= driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
        Thread.sleep(1000);
        güvenlikDuvari.click();

        WebElement email = driver.findElement(By.cssSelector("input#email"));
        email.sendKeys("ali");
        WebElement sifre= driver.findElement(By.cssSelector("input[type='password']"));
        sifre.sendKeys("3427sjsjdskl"+ Keys.ENTER);
    }
}
