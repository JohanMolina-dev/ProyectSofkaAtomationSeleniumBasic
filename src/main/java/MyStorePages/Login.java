package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    private By inputEmail = By.cssSelector("input#email");
    private By inputPassword = By.cssSelector("input#passwd");
    private By buttonSignIn = By.id("SubmitLogin");
    private By nameUser =  By.cssSelector("header#header nav > div:nth-child(1) > a > span");
    private By contentH1page = By.cssSelector("div#center_column > h1");
    private By contentAlert = By.cssSelector("div#center_column li");

    public Login(WebDriver driver) {
        this.driver = driver;
    }
    public void userEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }
    public void userPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }
    public MyPersonalInfo clickButtonSignIn(){
        driver.findElement(buttonSignIn).click();
        return new MyPersonalInfo(driver);
    }
    public String getNameUser(){
        return driver.findElement(nameUser).getText();
    }
    public String getNamePage(){
        return driver.findElement(contentH1page).getText();
    }
    public String getTextAlert(){
        return driver.findElement(contentAlert).getText();
    }
    public AddToCart clickButtonSignInToAddCart(){
        driver.findElement(buttonSignIn).click();
        return new AddToCart(driver);
    }


}
