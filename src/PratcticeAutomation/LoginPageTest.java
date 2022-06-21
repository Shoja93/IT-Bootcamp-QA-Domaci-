package PratcticeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTest {

    private LoginPage login;
    private String username;
    private String password;
    private String url;



    @BeforeTest
    public void setUp() {
        //login = new LoginPage(Duration.ofSeconds(10));
        login = new LoginPage();
        username = "student";
        password = "Password123";
        url = "https://practicetestautomation.com/practice-test-login/";
    }

    @AfterTest
    public void cleanUp(){
        login.getDriver().quit();
    }

    @BeforeMethod
    public void prepare(){
        login.getDriver().navigate().to(url);
        login.getDriver().navigate().refresh();
        setUsernamePass();
    }

    private void setUsernamePass(){
        login.setUsername(login.getDriver().findElement(By.id("username")));
        login.setPassword(login.getDriver().findElement(By.id("password")));
        login.setSubmit(login.getDriver().findElement(By.id("submit")));
    }

    @Test
    public void positiveLoginTest() {
        login.login(username, password);
        assertTrue(login.getDriver().getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
        String successfully = login.getDriver().findElement(By.className("post-title")).getText();
        String congratulations = login.getDriver().findElement(By.className("has-text-align-center")).getText();
        assertTrue(successfully.contains("successfully logged in") || congratulations.contains("Congratulations"));
        /*
        * I nacin:
        * */
        //WebElement logout = login.getDriver().findElement(By.cssSelector("a[class=\"wp-block-button__link has-text-color has-background has-very-dark-gray-background-color\"]"));
        WebElement logout = login.getDriver().findElement(By.linkText("Log out")); //II nacin
        assertTrue(logout.isDisplayed());
    }

    @Test
    public void negativeUsernameTest(){
        login.login("incorrectUser", password);
        WebElement error = login.getDriver().findElement(By.id("error"));
        System.out.println(error.getText());
        assertTrue(error.isDisplayed());
        assertEquals(error.getText(), "Your username is invalid!");
    }

    @Test
    public void negativePasswordTest(){
        login.login(username, "incorrectPassword ");
        WebElement error = login.getDriver().findElement(By.id("error"));
        assertTrue(error.isDisplayed());
        assertEquals(error.getText(), "Your password is invalid!");
    }

    @Test
    public void negativeUsernamePasswordTest(){
        login.login("incorrectUser", "incorrectPassword");
        WebElement error = login.getDriver().findElement(By.id("error"));
        System.out.println(error.getText());
        assertTrue(error.isDisplayed());
        assertEquals(error.getText(), "Your username is invalid!");
    }
}