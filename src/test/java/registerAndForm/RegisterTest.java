package registerAndForm;

import MyStorePages.MyPersonalInfo;
import MyStorePages.NewUserForm;
import MyStorePages.Register;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegisterTest extends BaseTest {
    @Test
    public void registerSuccessful() throws InterruptedException {
        Register register = homePage.click();
        register.inputNewEmail("johanmolina8912@gmail.com");
        NewUserForm newUserForm = register.clickButtonAccount();
        Thread.sleep(2700);
        newUserForm.sendMyInfoP("Johan","Molina","123456789","Carrera 81A # 82 -21","Bogota",
                "3118982278","00000","Casa");
        newUserForm.selectMyState("Georgia");
        newUserForm.selectMyBirthDay("30","1","1994");
        MyPersonalInfo myPersonalInfo= newUserForm.submitMyInfo();
        myPersonalInfo.clickButton();
        assertEquals("Johan",myPersonalInfo.getMyName());
        assertEquals("Molina",myPersonalInfo.getMyLastName());
    }
}
