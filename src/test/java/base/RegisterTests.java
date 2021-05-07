package base;


import MyStorePages.FormNewUser;
import MyStorePages.Register;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {
    @Test
    public void testSuccessfulRegister(){
        Register registerPage = homePage.click();
        registerPage.inputNewEmail("tester@gmail.com");
        FormNewUser formNewUser = registerPage.clickButtonAccount();
        formNewUser.enterFirstName("tester");
        formNewUser.enterLastName("QA");
        formNewUser.enterPassword("12345678");

    }
}
