package demoblaze.base;

import demoblaze.pages.Cart;
import demoblaze.pages.Category;
import demoblaze.pages.MenuPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePageH {
    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdwait;
    public Category categoryPage;
    public Cart cartPage;
    public MenuPage menuPage;

    @BeforeClass
    public void setUp() {
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        categoryPage = new Category(driver, wdwait);
        cartPage = new Cart(driver, wdwait);
        menuPage = new MenuPage(driver,wdwait);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
