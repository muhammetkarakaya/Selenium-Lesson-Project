package Ders_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    static WebDriver driver;

    @Test
    public void bikeArama() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='Ich stimme zu']"));
        Thread.sleep(3000);
        guvenlikDuvari.click();

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("City bike"+ Keys.ENTER);
        //search.submit();

        WebElement result = driver.findElement(By.id("result-stats"));
        System.out.println("result = " + result.getText());

        WebElement shopping= driver.findElement(By.partialLinkText("Shopping"));
        shopping.click();









//https://www.google.com/search?q=City+bike&source=lnms&tbm=shop&sa=X&ved=2ahUKEwiYvKerotn3AhXD66QKHaWzDOwQ_AUoAXoECAIQAw




    }
}
