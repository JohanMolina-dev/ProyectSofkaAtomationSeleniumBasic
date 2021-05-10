package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {
    private WebDriver driver;
    private By figureBlouse = By.cssSelector("div#center_column img");
    private By alertSuccessful= By.cssSelector("div#layer_cart div.layer_cart_product.col-xs-12.col-md-6 > h2");
    private By push = By.cssSelector("div#center_column a.button.ajax_add_to_cart_button.btn.btn-default > span");
    private By checkout= By.cssSelector("div#layer_cart a > span");
    private By inventory = By.cssSelector("header#header a > span.ajax_cart_quantity");
    private By cartToCheckout = By.cssSelector("header#header div:nth-child(3) > div > a");
    private By unitPrice= By.id("product_price_2_7_0");
    private By totalPriceUnit = By.id("total_product_price_2_7_0");
    private By stepToShipping = By.cssSelector("div#center_column button[type=\"submit\"] > span");
    private By stepToPayment = By.cssSelector("form#form button[type=\"submit\"] > span");
    private By proceedToCheckoutButton = By.cssSelector("div#center_column a.button.btn.btn-default.standard-checkout.button-medium > span");
    private By checkBoxIAgreeTerms = By.cssSelector("input#cgv");
    private By finalPricePlusShipping =By.cssSelector("span#total_price");
    private By buttonPayBank = By.cssSelector("div#HOOK_PAYMENT div:nth-child(1) > div > p > a");
    private By buttonConfirmOrder = By.cssSelector("p#cart_navigation span");
    private By addition = By.cssSelector("table#cart_summary a.cart_quantity_up.btn.btn-default.button-plus > span > i");
    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }
    public void lacatorHoverImage(){
        WebElement imageBlouse = driver.findElement(figureBlouse);
        Actions actions = new Actions(driver);
        actions.moveToElement(imageBlouse).perform();
    }
    public void pushPlus(){
        driver.findElement(push).click();
    }
    public String getMessageAlertSuccessful(){
        return driver.findElement(alertSuccessful).getText();
    }
    public void clickCheckout(){
        driver.findElement(checkout).click();
    }
    public String getInventory(){
        return driver.findElement(inventory).getText();
    }
    public String getUnitPrice(){
        return driver.findElement(unitPrice).getText();
    }
    public String getTotalPriceUnit(){
        return driver.findElement(totalPriceUnit).getText();
    }
    public String getTotalPricePlusShipping(){
        return driver.findElement(finalPricePlusShipping).getText();
    }
    public void clickAdditionButton(){
        driver.findElement(addition).click();
    }
    public void clickNextStepToShipping(){
        driver.findElement(stepToShipping).click();
    }
    public void clickIAgreeTerms(){
        driver.findElement(checkBoxIAgreeTerms).click();
    }

    public void goToCheckout(){
        driver.findElement(cartToCheckout).click();
    }
    public void goToPayment(){
        driver.findElement(stepToPayment).click();
    }
    public Login clickProceedToCheckoutButton(){
        driver.findElement(proceedToCheckoutButton).click();
        return new Login(driver);
    }
    public void payByBank(){
        driver.findElement(buttonPayBank).click();
    }
    public void confirmMyOrder(){
        driver.findElement(buttonConfirmOrder).click();
    }
}
