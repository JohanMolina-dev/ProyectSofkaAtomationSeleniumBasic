package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
    private WebDriver driver;
    private By emailRegister = By.name("email_create");
    private By buttonCreateAnAccount = By.id("SubmitCreate");

    public Register(WebDriver driver) {
        this.driver = driver;
    }
    public void inputNewEmail(String newEmail){
        driver.findElement(emailRegister).sendKeys(newEmail);
    }
    public NewUserForm clickButtonAccount(){
        driver.findElement(buttonCreateAnAccount).click();
        return new NewUserForm(driver);
    }


}
