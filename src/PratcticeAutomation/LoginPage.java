package PratcticeAutomation;

import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginPage extends Page {

    private WebElement username;
    private WebElement password;
    private WebElement submit;

    public LoginPage(WebElement username, WebElement password, WebElement submit, Duration d) {
        super(d);
        this.username = username;
        this.password = password;
        this.submit = submit;
    }

    public LoginPage(Duration d){
        super(d);
    }

    public LoginPage(WebElement username, WebElement password, WebElement submit){
        super();
        this.username = username;
        this.password = password;
        this.submit = submit;
    }

    public LoginPage() {
    }

    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public void setSubmit(WebElement submit) {
        this.submit = submit;
    }

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();
    }


}
