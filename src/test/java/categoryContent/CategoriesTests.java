package categoryContent;

import MyStorePages.CategoriesContent;
import base.BaseTest;
import org.testng.annotations.Test;


public class CategoriesTests extends BaseTest {
    @Test
    public void hoverCategory() throws InterruptedException {
        CategoriesContent categoriesContent = homePage.clickLogo();
        Thread.sleep(1000);
        categoriesContent.locatorHoverMenuDresses();
        Thread.sleep(2000);
        categoriesContent.locatorHoverMenuWoman();
        Thread.sleep(2000);
        categoriesContent.locatorHoverMenuTShirt();

    }
}
