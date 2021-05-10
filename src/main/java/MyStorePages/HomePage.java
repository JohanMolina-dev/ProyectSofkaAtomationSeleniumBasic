package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;
    private By menuHoverUp = By.linkText("WOMEN");
    private By optionBlouses = By.linkText("Blouses");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public Register click(){
        clickCssSelector("header#header div.header_user_info > a");
        return new Register(driver);

    }
    public Login clickSign(){
        clickCssSelector("header#header div.header_user_info > a");
        return new Login(driver);
    }
    public SearchQuery clickSearchBar(){
        clickCssSelector("input#search_query_top");
        return new SearchQuery(driver);
    }
    public void locatorHoverMenu(){
        WebElement menuHover = driver.findElement(menuHoverUp);
        Actions actions = new Actions(driver);
        actions.moveToElement(menuHover).perform();
    }
    public AddToCart clickCategoryWoman(){
       driver.findElement(optionBlouses).click();
       return new AddToCart(driver);
    }
    public CategoriesContent clickLogo(){
        clickCssSelector("div#header_logo img");
        return new CategoriesContent(driver);
    }


    private void clickCssSelector(String css){
        driver.findElement(By.cssSelector(css)).click();
    }
}
