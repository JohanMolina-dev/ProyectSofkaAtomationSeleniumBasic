package MyStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchQuery {
    private WebDriver driver;
    private By searchItem = By.id("search_query_top");
    private By searchButton = By.name("submit_search");
    private By resultName = By.cssSelector("div#center_column h5 > a");

    public SearchQuery(WebDriver driver) {
        this.driver = driver;
    }
    public void objectsOfSearch(String article){
        driver.findElement(searchItem).sendKeys(article);
        driver.findElement(searchButton).click();
    }
    public String getResultName(){
        return driver.findElement(resultName).getAttribute("title");
    }
    public void clearSearchBar(){
        driver.findElement(searchItem).clear();
    }




}
