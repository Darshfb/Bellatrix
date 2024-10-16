package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_ItemDetailsPage {
    WebDriver driver;

    public P02_ItemDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    By itemQuantity = By.name("quantity");
    By addToCart = By.name("add-to-cart");

    public P02_ItemDetailsPage addQuantity(int quantity) {
        driver.findElement(itemQuantity).clear();
        driver.findElement(itemQuantity).sendKeys(String.valueOf(quantity));
        return this;
    }

    public P02_ItemDetailsPage clickAddToCart() {
        driver.findElement(addToCart).click();
        return this;
    }
}
