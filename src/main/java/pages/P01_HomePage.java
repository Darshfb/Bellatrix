package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_HomePage {
    WebDriver driver;

    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCart = By.xpath("(//a)[text()='Add to cart']");
    By itemDetails = By.xpath("(//a)[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']");
    By itemPrice = By.xpath("(//ins)/span/bdi");
    By cartPage = By.xpath("(//a)[text()='Cart']");

    public void clickAddToCart() {
        driver.findElements(addToCart).get(0).click();
    }

    public void enterItemDetails()
    {
        driver.findElements(itemDetails).get(1).click();

    }

    public void enterCartPage(){
        driver.findElement(cartPage).click();
    }
}
