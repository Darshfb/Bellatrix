package testcases;

import org.testng.annotations.Test;
import pages.P02_ItemDetailsPage;

public class Tc2_ItemDetails extends TestBase
{
    @Test(priority = 3)
    public void addItemToCartFromItemDetails()
    {
        new P02_ItemDetailsPage(driver).addQuantity(10).clickAddToCart();
    }
}
