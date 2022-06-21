package PratcticeAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Zadatak5 {


    private WebDriverWait wdwait;
    private WebDriver driver;



    @Test
    public void test() throws InterruptedException {

        WebDriverManager wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
       // WebDriverCekaj.create(driver);
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.navigate().to("https://www.demoblaze.com/index.html");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Samsung galaxy s6")));
        WebElement galaxyS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        galaxyS6.click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add to cart")));
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("cartur")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Delete")));
        driver.findElement(By.linkText("Delete")).click();
    }
}
