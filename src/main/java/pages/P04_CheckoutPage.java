package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static common.PageBase.selectRandomElement;

public class P04_CheckoutPage {
    WebDriver driver;

    public P04_CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstNameText = By.id("billing_first_name");
    By lastNameText = By.id("billing_last_name");
    By companyName = By.id("billing_company");
    By countrySelect = By.id("select2-billing_country-container");
    By countrySelection = By.xpath("(//span)[@class='select2-results']/ul/li");
    By addressText = By.id("billing_address_1");
    By address2Text = By.id("billing_address_2");
    By cityText = By.id("billing_city");
    By selectState = By.id("select2-billing_state-container");
    By states = By.xpath("(//span)[@class='select2-results']/ul/li");
    By postalCodeText = By.id("billing_postcode");
    By phoneText = By.id("billing_phone");
    By emailText = By.id("billing_email");
    By createAccountCheckbox = By.id("createaccount");
    By submitOrder = By.id("place_order");
    By commentOrder = By.id("order_comments");

    public P04_CheckoutPage enterFirstName(String firstName) {
        driver.findElement(firstNameText).sendKeys(firstName);
        return this;
    }

    public P04_CheckoutPage enterLastName(String lastName) {
        driver.findElement(lastNameText).sendKeys(lastName);
        return this;
    }

    public P04_CheckoutPage enterCompanyName(String companyName) {
        driver.findElement(this.companyName).sendKeys(companyName);
        return this;
    }

    public P04_CheckoutPage selectCountry() {
        driver.findElement(countrySelect).click();
        List<WebElement> countries = driver.findElements(countrySelection);
        selectRandomElement(countries).click();
        return this;
    }

    public P04_CheckoutPage enterFirstAddress(String address) {
        driver.findElement(addressText).sendKeys(address);
        return this;
    }

    public P04_CheckoutPage enterSecondAddress(String address) {
        driver.findElement(address2Text).sendKeys(address);
        return this;
    }

    public P04_CheckoutPage enterCityText(String city) {
        driver.findElement(cityText).sendKeys(city);
        return this;
    }

    public P04_CheckoutPage selectState() {
        driver.findElement(selectState).click();
        List<WebElement> stateList = driver.findElements(states);
        selectRandomElement(stateList).click();
        return this;

    }

    public P04_CheckoutPage enterPostalCode(String postalCode) {
        driver.findElement(postalCodeText).sendKeys(postalCode);
        return this;
    }

    public P04_CheckoutPage enterPhoneNumber(String phone) {
        driver.findElement(phoneText).sendKeys(phone);
        return this;
    }

    public P04_CheckoutPage enterEmailAddress(String email) {
        driver.findElement(emailText).sendKeys(email);
        return this;
    }

    public P04_CheckoutPage selectCreateAccount() {
        driver.findElement(createAccountCheckbox).click();
        return this;
    }

    public P04_CheckoutPage addComment(String comment){
        driver.findElement(commentOrder).sendKeys(comment);
        return this;
    }

    public P04_CheckoutPage placeOrder()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(submitOrder).click();
        return this;
    }




}
