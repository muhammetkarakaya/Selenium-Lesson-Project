package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dropDownSoru {
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
    public void Test1(){
        driver.get("http://amazon.com");
        WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));

        Select select=new Select((dropdown));
        select.selectByVisibleText("Software");

        WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("JAVA");
        search.submit();

        WebElement sonucSayisi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println("sonucSayisi.getText() = " + sonucSayisi.getText());


    }
}
