package demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    By cart = By.id("cartur");


    public MenuPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHome() {
        return driver.findElement(By.linkText("Home"));
    }

    public WebElement getContact() {
        return driver.findElement(By.linkText("Contact"));
    }

    public WebElement getAboutUs() {
        return driver.findElement(By.linkText("About us"));
    }

    public WebElement getCart() {
        return driver.findElement(cart);
    }

    public WebElement getLogIn() {
        return driver.findElement(By.id("login2"));
    }

    public WebElement getSignUp() {
        return driver.findElement(By.id("signin2"));
    }

    //--------------------------------------------------

    public void clickOnCart(){
        getCart().click();
    }
}
