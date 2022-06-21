package demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Category {
    WebDriver driver;
    WebDriverWait wdwait;

    public Category(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public WebElement getPhonesPage() {
        return driver.findElement(By.linkText("Phones"));
    }

    public WebElement getLaptopsPage() {
        return driver.findElement(By.linkText("Laptops"));
    }

    public WebElement getMonitorsPage() {
        return driver.findElement(By.linkText("Monitors"));
    }

    public List<WebElement> getCategoryItemNames() {
        return driver.findElements(By.className("hrefch"));
    }

    public List<WebElement> getcategoryItemDescription() {
        return driver.findElements(By.id("article"));
    }

    public List<WebElement> getCategoryItemPrice() {
        WebElement p = driver.findElement(By.id("tbodyid"));
        return p.findElements(By.tagName("h5"));
    }




    //-------------------------------------------------------------
    // vraca ispis svih elemenata kategorije (naziv, opis, cena)
    public void printCategory(String categoryName) throws InterruptedException {
        System.out.println(categoryName);

        Thread.sleep(2000);
        for(int i = 0; i < getCategoryItemNames().size(); i++) {
            System.out.println("Stavka " + (i+1) + ":");
            System.out.println("Naziv: " + getCategoryItemNames().get(i).getText());
            System.out.println("Opis: " + getcategoryItemDescription().get(i).getText());
            System.out.println("Cena: " + getCategoryItemPrice().get(i).getText());
            System.out.println();
        }
        System.out.println("Ukupno stavki iz kategorije " + categoryName + " je: " + getCategoryItemNames().size());
    }

    // vraca cenu svih elemenata kategorije
    public void totalPrice(String x){
        int suma = 0;
        for(int i = 0; i < getCategoryItemPrice().size(); i++){
           String s =  getCategoryItemPrice().get(i).getText();
           String result = s.substring(1); //$800 [$, 8, 0, 0] substring(1) [8, 0, 0] = 800
            int j = Integer.parseInt(result); // pretvori string u int (castovanje) Double.parseDouble(String broj)
            //int x = Integer.reverse(x); //x = 123 reverse(x) = 321
            suma = suma + j;
        }
        System.out.println("Cena svih stavki iz kategorije " + x + " je: "  + suma + "\n");

    }

    // klik na odredjeni item
    public void clickOnCategoryItem(String s){
        for(int i = 0; i < getCategoryItemPrice().size(); i++){
            if(s.equals(getCategoryItemNames().get(i).getText())){
                getCategoryItemNames().get(i).click();
                break;
            }
        }
    }

    // dodaje item u korpu
    public void addItemtoCart(String x) throws InterruptedException {
        Thread.sleep(2000);
        clickOnCategoryItem(x);
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.cssSelector(".btn.btn-success.btn-lg"));
        button.click();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.navigate().to("https://www.demoblaze.com/index.html#");
    }
}
