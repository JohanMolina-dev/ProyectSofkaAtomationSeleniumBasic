package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CategoriesContent {
    private WebDriver driver;
    private By categoryWoman = By.linkText("WOMEN");
    private By categoryDresses = By.linkText("DRESSES");
    private By categoryTShirt = By.linkText("T-SHIRTS");

    public CategoriesContent(WebDriver driver) {
        this.driver = driver;
    }

    public void locatorHoverMenuWoman(){
        WebElement menuHoverWoman = driver.findElement(categoryWoman);
        Actions actions = new Actions(driver);
        actions.moveToElement(menuHoverWoman).perform();
    }
    public void locatorHoverMenuDresses(){
        WebElement menuHoverDresses = driver.findElement(categoryDresses);
        Actions actions = new Actions(driver);
        actions.moveToElement(menuHoverDresses).perform();
    }
    public void locatorHoverMenuTShirt(){
        WebElement menuHoverTShirt = driver.findElement(categoryTShirt);
        Actions actions = new Actions(driver);
        actions.moveToElement(menuHoverTShirt).perform();
    }

}
