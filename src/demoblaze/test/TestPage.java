package demoblaze.test;

import demoblaze.base.BasePageH;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage extends BasePageH {



    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html#");

    }

    @Test
    public void goToPhonesPage() {
        categoryPage.getPhonesPage().click();
    }

    @Test
    public void printPhoneItems() throws InterruptedException {
        goToPhonesPage();
        String categoryName = "Phones";
        Thread.sleep(5000);
        categoryPage.printCategory(categoryName);
        categoryPage.totalPrice(categoryName);
    }

    @Test
    public void goToLaptopsPage() {
        categoryPage.getLaptopsPage().click();
    }

    @Test
    public void printLaptopItems() throws InterruptedException {
        goToLaptopsPage();
        Thread.sleep(2000);
        String categoryName = "Laptops";
        Thread.sleep(2000);
        categoryPage.printCategory(categoryName);
        categoryPage.totalPrice(categoryName);
    }

    @Test
    public void goToMonitorsPage() {
        categoryPage.getMonitorsPage().click();
    }

    @Test
    public void printMonitorItems() throws InterruptedException {
        goToMonitorsPage();
        Thread.sleep(2000);
        String categoryName = "Monitors";
        Thread.sleep(2000);
        categoryPage.printCategory(categoryName);
        categoryPage.totalPrice(categoryName);
    }

    @Test
    public void confirmThatPhonesAreAddedToCart() throws InterruptedException {
        String a = "Samsung galaxy s6";
        String b = "Nokia lumia 1520";
        String c = "Nexus 6";
        String[] elementi = {a, b, c};
        for(String e: elementi) {
            categoryPage.addItemtoCart(e);
            goToPhonesPage();

        }

        menuPage.clickOnCart();

        String expectedURL = "https://www.demoblaze.com/cart.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertTrue(cartPage.getPlaceOrderButton().isDisplayed());
        Assert.assertTrue(cartPage.cartItems(elementi));
    }

    @Test
    public void confirmThatLaptopsAreAddedToCart() throws InterruptedException {
        String a = "Sony vaio i5";
        String b = "Sony vaio i7";
        String c = "MacBook Pro";
        String[] elementi = {a, b, c};
        for(String e: elementi) {
            categoryPage.addItemtoCart(e);
            goToLaptopsPage();
            Thread.sleep(2000);
        }

        menuPage.clickOnCart();
        Thread.sleep(3000);

        String expectedURL = "https://www.demoblaze.com/cart.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);

        Assert.assertTrue(cartPage.getPlaceOrderButton().isDisplayed());
        Assert.assertTrue(cartPage.cartItems(elementi));
    }
        @Test
        public void confirmThatMonitorIsAddedToCart() throws InterruptedException {
            String a = "Apple monitor 24";
            String[] elementi = {a};
            goToMonitorsPage();
            categoryPage.addItemtoCart(a);

            Thread.sleep(2000);

            menuPage.clickOnCart();
            Thread.sleep(3000);

            String expectedURL = "https://www.demoblaze.com/cart.html";
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals(actualURL, expectedURL);

            Assert.assertTrue(cartPage.getPlaceOrderButton().isDisplayed());
            Assert.assertTrue(cartPage.cartItems(elementi));

        }
    }
