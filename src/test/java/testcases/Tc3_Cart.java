package testcases;

import org.testng.annotations.Test;
import pages.P03_CartPage;

public class Tc3_Cart extends TestBase
{
    @Test(priority = 5)
    public void updateCart(){
        new P03_CartPage(driver).updateItemQuantity("5").updateCart().proceedToCheckout();
    }
}
