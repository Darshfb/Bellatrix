package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P04_CheckoutPage;

public class Tc4_checkout extends TestBase {
    Faker faker;

    String comment = "Need it quickly";

    @Test(priority = 6)
    public void submitOrder() {
        faker = new Faker();
        new P04_CheckoutPage(driver)
                .enterFirstName(faker.name().firstName())
                .enterLastName(faker.name().lastName())
                .enterCompanyName(faker.company().name())
                .selectCountry()
                .enterFirstAddress(faker.address().streetAddress())
                .enterSecondAddress(faker.address().buildingNumber())
                .enterCityText(faker.address().city())
                .selectState()
                .enterPostalCode(faker.address().zipCode())
                .enterPhoneNumber(faker.phoneNumber().phoneNumber())
                .enterEmailAddress(faker.internet().emailAddress())
                .selectCreateAccount()
                .addComment(comment)
                .placeOrder();

    }
}
