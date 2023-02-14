package testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expected = "Register";
        Assert.assertEquals(expected, homePage.VerifyRegisterLink());
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        homePage.clickOnRegisterLink();
        registerPage.ClickonRegisterButton();
        String expectedFirstname = "First name is required.";
        Assert.assertEquals(expectedFirstname, registerPage.VerifyFirstnameError());

        String expectedLastname = "Last name is required.";
        Assert.assertEquals(expectedLastname, registerPage.VerifyLastnameError());

        String expectedEmail = "Email is required.";
        Assert.assertEquals(expectedEmail, registerPage.VerifyEmailError());

        String expectedPassword = "Password is required.";
        Assert.assertEquals(expectedPassword, registerPage.VerifyPasswordError());

        String expectedConfirmPass = "Password is required.";
        Assert.assertEquals(expectedConfirmPass, registerPage.VerifyConfirmPasswordError());
    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.Clickonfemale();
        registerPage.EnterFirstname("Minnie");
        registerPage.EnterLastname("Disney");
        registerPage.SelectDay("1");
        registerPage.SelectMonth("1");
        registerPage.SelectYear("2000");
        registerPage.EnterEmail("mindisney@gmail.com");
        registerPage.EnterPassword("abc123");
        registerPage.EnterConfirmPassword("abc123");
        registerPage.ClickonRegisterButton();
        String expected = "Your registration completed";
        Assert.assertEquals(expected, registerPage.VerifyRegisterSuccessfullMsg());
    }
}