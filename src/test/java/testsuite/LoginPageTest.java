package testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homepage.clickOnLoginLink();
        String actualMessage = loginPage.getWelcomeText();
        String expectedMessage = "Welcome, Please Sign In!";
        org.testng.Assert.assertEquals(actualMessage, expectedMessage, "Login page verified");


    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("mindisney@gmail.it");
        loginPage.enterPassword("abc1234");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getErrorMessage();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual, expected, "error message with inavalid credentials");
    }

    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("mindisney@gmail.com");
        loginPage.enterPassword("abc123");
        loginPage.clickOnLoginButton();
        String expected = "Log out";
        Assert.assertEquals(expected, loginPage.verifylogoutlink());


    }

    @Test
    public void VerifyThatUserShouldLogOutSuccessFully() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("mindisney@gmail.com");
        loginPage.enterPassword("abc123");
        loginPage.clickOnLoginButton();
        loginPage.clickOnlogoutLink();
        String expected = "Log in";
        Assert.assertEquals(expected, loginPage.verifyloginLink());
    }
}