package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    private By inputEmail = By.cssSelector("input#email");
    private By inputPassword = By.cssSelector("input#passwd");
    private By buttonSignIn = By.id("SubmitLogin");

    public Login(WebDriver driver) {
        this.driver = driver;
    }
    public void userEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }
    public void userPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }
    public void clickButtonSignIn(){
        driver.findElement(buttonSignIn).click();
    }


}
