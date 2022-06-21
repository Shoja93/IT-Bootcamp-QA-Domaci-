package PratcticeAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class Page {

    private final WebDriverManager wdm;
    private final WebDriver driver;
    private WebDriverWait wdwait;

    public Page(Duration d){
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, d);
    }

    public Page(){
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
    }

    public WebDriverManager getWdm() {
        return wdm;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }
}
