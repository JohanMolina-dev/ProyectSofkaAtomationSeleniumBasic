package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewUserForm {
    private WebDriver driver;
    private By selectMr = By.ByCssSelector.id("id_gender");
    private By selectMrs = By.ByCssSelector.id("id_gender2");
    private By inputName = By.ByCssSelector.cssSelector("input#customer_firstname");
    private By inputLastName = By.ByCssSelector.id("customer_lastname");
    private By inputPassword = By.ByCssSelector.id("passwd");
    private By inputRepeatName = By.ByCssSelector.id("firstname");
    private By inputRepeatLastName = By.ByCssSelector.id("lastname");
    private By inputAddress = By.ByCssSelector.id("address1");
    private By inputCity = By.ByCssSelector.id("city");
    private By inputMobileNumber = By.ByCssSelector.id("phone_mobile");
    private By searchNavBar = By.id("search_query_top");
    private By searchButton = By.name("submit_search");
    private By dropDownDay = By.ByCssSelector.id("days");
    private By dropDownMonth = By.ByCssSelector.id("months");
    private By dropDownYear = By.ByCssSelector.id("years");
    private By dropState = By.id("id_state");
    private By codePost = By.id("postcode");
    private By aliasAddress = By.id("alias");
    private By buttonSubmitRegister = By.id("submitAccount");
    public NewUserForm(WebDriver driver) {
        this.driver = driver;
    }
    public void selectMyBirthDay(String pDay, String pMonth, String pYear){
        try {
            Select dropDay = new Select(driver.findElement(dropDownDay));
            Thread.sleep(3000);
            dropDay.selectByValue(pDay);
            Select dropMonth = new Select(driver.findElement(dropDownMonth));
            dropMonth.selectByValue(pMonth);
            Select dropYear = new Select(driver.findElement(dropDownYear));
            dropYear.selectByValue(pYear);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectMyState(String pEstado){
        Select dropMyState = new Select(driver.findElement(dropState));
        dropMyState.selectByVisibleText(pEstado);

    }
   public void sendMyInfoP(String pNombre, String pApellido, String pPassword, String pDireccion, String pCiudad,
                           String pCelular, String pCodigoPostal, String aliasAdd){
        driver.findElement(selectMrs).click();
        driver.findElement(inputName).sendKeys(pNombre);
        driver.findElement(inputLastName).sendKeys(pApellido);
        driver.findElement(inputPassword).sendKeys(pPassword);
        driver.findElement(inputRepeatName).sendKeys(pNombre);
        driver.findElement(inputRepeatLastName).sendKeys(pApellido);
        driver.findElement(inputAddress).sendKeys(pDireccion);
        driver.findElement(inputCity).sendKeys(pCiudad);
        driver.findElement(inputMobileNumber).sendKeys(pCelular);
        driver.findElement(codePost).sendKeys(pCodigoPostal);
        driver.findElement(aliasAddress).sendKeys(aliasAdd);
   }

  public MyPersonalInfo submitMyInfo(){
        driver.findElement(buttonSubmitRegister).click();
        return  new MyPersonalInfo(driver);
  }

}
