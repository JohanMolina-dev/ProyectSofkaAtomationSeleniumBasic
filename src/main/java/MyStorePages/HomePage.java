package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

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

    private void clickCssSelector(String css){
        driver.findElement(By.cssSelector(css)).click();
    }
}
