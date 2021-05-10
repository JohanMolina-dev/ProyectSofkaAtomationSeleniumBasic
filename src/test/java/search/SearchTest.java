package search;

import MyStorePages.SearchQuery;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest {
    @Test
    public void searchAndFind() throws InterruptedException {
        SearchQuery searchQuery = homePage.clickSearchBar();
        searchQuery.objectsOfSearch("BlOuSeS");
        Thread.sleep(1000);
        assertEquals("Blouse",searchQuery.getResultName());
        searchQuery.clearSearchBar();
        searchQuery.objectsOfSearch("FaDeD");
        Thread.sleep(1000);
        assertTrue(searchQuery.getResultName().contains("Faded"));
        searchQuery.clearSearchBar();
        searchQuery.objectsOfSearch("PrInTed");
        Thread.sleep(1000);
        assertTrue(searchQuery.getResultName().contains("Printed"));
    }
}
