package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class MyPersonalInfo {
    private WebDriver driver;
    private By buttonMyInfo = By.cssSelector("div#center_column li:nth-child(4) > a > span");
    private By nameInfo = By.cssSelector("input#firstname");
    private By lastNameInfo = By.cssSelector("input#lastname");
    private By saveMyChange = By.cssSelector("div#center_column button[type=\"submit\"] > span");
    private By alertText = By.cssSelector("div#center_column ol > li");

    public MyPersonalInfo(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButton(){
        driver.findElement(buttonMyInfo).click();
    }
    public void changeMyName(String newName){
        driver.findElement(nameInfo).sendKeys(newName.toLowerCase());
    }
    public void changeMyLastName(String newLastName){
        driver.findElement(lastNameInfo).sendKeys(newLastName.toLowerCase());
    }
    public String getMyName(){
        return  driver.findElement(nameInfo).getAttribute("value");
    }
    public String getMyLastName(){
        return  driver.findElement(lastNameInfo).getAttribute("value");
    }
    public void clickSave(){
        driver.findElement(saveMyChange).click();
    }
    public String getMyAlert(){
        return driver.findElement(alertText).getText();
    }

}
