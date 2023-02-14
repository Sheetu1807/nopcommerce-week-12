package testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ComputerPageTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopsPage.DesktopPage desktopPage = new DesktopsPage.DesktopPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputers();
        String expected = "Computers";
        Assert.assertEquals(expected, homePage.VerifyComputersText());
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnComputers();
        computerPage.Desktops();
        String expected = "Desktops";
        Assert.assertEquals(expected, computerPage.VerifyDesktoplink());
    }

    @Test
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully() {
        homePage.clickOnComputers();
        computerPage.Desktops();
        buildYourOwnComputerPage.ClickonProduct();
        buildYourOwnComputerPage.SelectProcessorDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.RamDropDown("2 GB");
        buildYourOwnComputerPage.HddRadio();
        buildYourOwnComputerPage.OsRadio();
        buildYourOwnComputerPage.SoftwareCheckbox();
        buildYourOwnComputerPage.ClickonAddToCart();
        String expected = "The product has been added to your shopping cart";
        Assert.assertEquals(expected, buildYourOwnComputerPage.Theproduchasbeenaddedtoyourshoppingcart());


    }

}