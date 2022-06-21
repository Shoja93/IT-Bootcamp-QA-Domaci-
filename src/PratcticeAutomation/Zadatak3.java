package PratcticeAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.*;

public class Zadatak3 {

    private static WebDriverManager wdm;
    private static WebDriver driver;
    private static WebDriverWait wdwait;

    @BeforeTest
    public void setUpTest(){
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void setUpMethod(){
        driver.navigate().to("https://demoqa.com/dynamic-properties");
    }

    @Test (priority = 1/*, enabled = false*/)
    public void testirajVisibleAfterClick(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));
        WebElement visibleAfter = driver.findElement(By.id("visibleAfter"));
        visibleAfter.click();
    }

    @Test (priority = 2/*, enabled = false*/)
    public void testirajVisibleAfterNijeTuPrviCetiriSekunde() throws InterruptedException {
        Thread.sleep(4000);
        //driver.findElement(By.id("visibleAfter")); // baca NoSuchElementException
        List<WebElement> al = driver.findElements(By.id("visibleAfter"));
        if (al.size() != 0){
            fail();
        }
    }

    @Test()
    public void testirajEnabledAfterClick(){
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        WebElement enabled  =  driver.findElement(By.id("enableAfter"));
        assertTrue(enabled.isEnabled());
        enabled.click();
    }

    @Test ()
    public void testirajEnableAfterNijeEnabledPrvihCetiriSekunde() throws InterruptedException {
        Thread.sleep(4000);
        WebElement enable = driver.findElement(By.id("enableAfter"));
        assertFalse(enable.isEnabled());
    }

    @AfterTest
    public void cleanUp(){
        driver.quit();
    }
}
