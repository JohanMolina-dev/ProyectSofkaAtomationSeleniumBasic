package base;

import MyStorePages.Login;
import MyStorePages.MyPersonalInfo;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void successfulLogin(){
        Login login = homePage.clickSign();
        login.userEmail("jsmolina49@gmail.com");
        login.userPassword("123456789");
        MyPersonalInfo myPersonalInfo =login.clickButtonSignIn();
        assertTrue(login.getNameUser().contains("Johan Molina"));
        myPersonalInfo.clickButton();
        myPersonalInfo.changeMyName("SEBASTIAN");
        myPersonalInfo.changeMyLastName("MONTOYA");
        myPersonalInfo.clickSave();
        assertEquals("The password you entered is incorrect.",myPersonalInfo.getMyAlert());




    }
    @Test
    public void failureLogin(){
        Login login = homePage.clickSign();
        login.userEmail("jsmolina49@gmail.com");
        login.userPassword("12345678");
        login.clickButtonSignIn();
        assertEquals("AUTHENTICATION",login.getNamePage());
        assertEquals("Authentication failed.",login.getTextAlert());
    }
}
