package cart;

import MyStorePages.AddToCart;
import MyStorePages.Login;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTest extends BaseTest {
    @Test
    public void appendCart() throws InterruptedException {

        homePage.locatorHoverMenu();
        AddToCart addToCart = homePage.clickCategoryWoman();
        Thread.sleep(2000);
        addToCart.lacatorHoverImage();
        Thread.sleep(1800);
        addToCart.pushPlus();
        Thread.sleep(2000);
        assertEquals("Product successfully added to your shopping cart",addToCart.getMessageAlertSuccessful());
        addToCart.clickCheckout();
        Thread.sleep(2000);
        assertEquals("1",addToCart.getInventory());
        addToCart.goToCheckout();
        assertEquals("$27.00",addToCart.getUnitPrice());
        assertEquals("$27.00",addToCart.getTotalPriceUnit());
        addToCart.clickAdditionButton();
        Thread.sleep(1300);
        assertEquals("2",addToCart.getInventory());
        assertEquals("$27.00",addToCart.getUnitPrice());
        assertEquals("$54.00",addToCart.getTotalPriceUnit());
        Login login = addToCart.clickProceedToCheckoutButton();
        login.userEmail("jsmolina49@gmail.com");
        login.userPassword("123456789");
        AddToCart newAddToCart = login.clickButtonSignInToAddCart();
        newAddToCart.clickNextStepToShipping();
        newAddToCart.clickIAgreeTerms();
        newAddToCart.goToPayment();
        assertEquals("$56.00",newAddToCart.getTotalPricePlusShipping());
        newAddToCart.payByBank();
        newAddToCart.confirmMyOrder();

    }
}
