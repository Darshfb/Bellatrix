package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_CartPage {
    WebDriver driver;

    public P03_CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By itemQuantity = By.xpath("(//input)[@title='Qty']");
    By updateCart = By.name("update_cart");
    By proceedToCheckout = By.xpath("(//div)[@class='wc-proceed-to-checkout']/a");

    public P03_CartPage updateItemQuantity(String quantity) {
        driver.findElements(itemQuantity).get(0).clear();
        driver.findElements(itemQuantity).get(0).sendKeys(quantity);
        return this;
    }

    public P03_CartPage updateCart() {
        driver.findElement(updateCart).click();
        return this;
    }

    public P03_CartPage proceedToCheckout() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(proceedToCheckout).click();
        return this;
    }
}
