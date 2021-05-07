package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormNewUser {
    private WebDriver driver;
    private By mr = By.id("id_gender1");
    private By mrs = By.id("id_gender2");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By emailReference = By.id("email");
    private By newPassword = By.id("passwd");
    private By selectDayOfBirth = By.id("days");
    private By selectMonth =  By.id("months");
    private By selectYear = By.id("years");
    private By addressFirstName = By.id("firstname");
    private By  addressLastName= By.id("lastname");
    private By address = By.id("address1");
    private By city = By.id("city");
    private By selectState = By.id("id_state");
    private By postalCode = By.id("postcode");
    private By selectCountry = By.id("id_country");
    private By mobilePhone = By.id("phone_mobile");
    private By aliasAddress = By.id("alias");
    private By buttonRegister = By.id("submitAccount");

    public FormNewUser(WebDriver driver) {
        this.driver = driver;
    }
    public void selectOptionMr(){
        driver.findElement(mr).click();
    }
    public void selectOptionM(){
        driver.findElement(mrs).click();
    }
    public void enterFirstName(String name1){
        driver.findElement(firstName).sendKeys(name1);
    }
    public void enterLastName(String lastName1){
        driver.findElement(lastName).sendKeys(lastName1);
    }
    public void enterPassword(String password){
        driver.findElement(newPassword).sendKeys(password);
    }





}
