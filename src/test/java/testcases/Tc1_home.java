package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import util.Utility;

public class Tc1_home extends TestBase {
    Utility utility;

    @Test(priority = 2)
    public void addItemToCart() {
        utility = new Utility();
        new P01_HomePage(driver).clickAddToCart();
    }

    @Test(priority = 2)
    public void enterItemDetails() {
        new P01_HomePage(driver).enterItemDetails();
    }

    @Test(priority = 4)
    public void enterCartPage(){
        new P01_HomePage(driver).enterCartPage();
    }

}
