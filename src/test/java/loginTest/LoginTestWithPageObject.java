package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestWithPageObject extends ParentTest {

    @Test
    public void validTest (){
        homePage.openPage();
        homePage.clickSignIn();
        homePage.inputLogin("Fanat2019");
        homePage.inputPassword("Fanat2019");
        homePage.clickSubmit();
        //test

    }

}