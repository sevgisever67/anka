package tests;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US02_Hasan2 extends TestBaseRapor{
    MainPage mainPage = new MainPage();


    @BeforeMethod
    public void setUp() {
        //  extentTest = extentReports.createTest("US02");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        extentTest= extentReports.createTest("US_02");
    }

    @Test
    public void sirketNosununGorunurOldugunuTestEt_TC_01() {
        String expectedTelefonNo = "202-456-3789";
        String actualTelefonno = mainPage.ziyaretciSirketTelefonNo.getText();
        Assert.assertEquals(actualTelefonno, expectedTelefonNo);
        extentTest.pass("Şirket nosunun görünür");
  }

    @Test
    public void sirketTelefonIconununGorunurOldugunuTestEt_TC_02() {
        Assert.assertTrue(mainPage.ziyaretciTelefonIcon.isDisplayed());
        extentTest.pass("Şirket telefon iconu görünür");
    }

    @Test
    public void sirketInfosununDogrulugununTesti_TC_03() {
        Assert.assertTrue(mainPage.ziyaretciIInfo.isDisplayed());
        extentTest.pass("Şirket infosu görünür");

    }

    @Test
    public void mailIkonununGorundugunuDogrula_TC_04() {

        Assert.assertTrue(mainPage.ziyaretciMailIconu.isDisplayed());
        extentTest.pass("Mail ikonu görünür");
    }

    @Test
    public void registrationGorundugunuDogrula_TC_05() {
        Assert.assertTrue(mainPage.registrationIcon.isDisplayed());
        extentTest.pass("Registration butonu görünür");
        mainPage.registrationButton.click();

        mainPage.registrationCookies.click();

        String expectedTitle = "Registration";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Registration sayfasında olduğu görünür");

    }

    @Test
    public void registrationTextiGorundugunuDogrula_TC_06() {
        Assert.assertTrue(mainPage.registrationButton.isDisplayed());
        extentTest.pass("Registration yazsının olduğu görünür");
        mainPage.registrationButton.click();
        mainPage.registrationCookies.click();
        String expectedTitle = "Registration";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Registration sayfasında olduğu görünür ");


    }


    @Test
    public void loginIconGorundugunuDogrula_TC_07() {

        Assert.assertTrue(mainPage.loginIcon.isDisplayed());
        extentTest.pass("Login iconu görünür");
        mainPage.loginIcon.click();
        mainPage.registrationCookies.click();

        String expectedTitle="Login";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("Login sayafsında olduğu görünür");

    }

    @Test
    public void loginTextGorundugunuDogrula_TC_08(){
        Assert.assertTrue(mainPage.loginButton.isDisplayed());
        extentTest.pass("Login butonu görünür");
        mainPage.loginButton.click();
        mainPage.registrationCookies.click();

        String expectedTitle="Login";
        String actualTitle=mainPage.loginButton.getText();
        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("Login sayafsında olduğu görünür");

    }

  /*  @Test
    public void tripandwayLogoGorundugunuDogrula_TC_09() {
        Assert.assertTrue(mainPage.tripandwayLogo.isDisplayed());
        mainPage.tripandwayLogo.click();

        String expectedTitle="Tripandway";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    */
}
