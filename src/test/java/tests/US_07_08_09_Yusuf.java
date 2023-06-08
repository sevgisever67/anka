package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_07_08_09_Yusuf extends TestBaseRapor {

    MainPage mainPage = new MainPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();




    @BeforeMethod
    public void setUp() throws InterruptedException {
        // Siteye qa kısmından üye girişi yaptıktan sonra testleri yapıyoruz
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        mainPage.userEmailAddrsess.sendKeys("userUsername");
        mainPage.userPasswordButton.sendKeys("userPassword");
        mainPage.loginSubmitButton.click();
        actions.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(3000);

    }

    @Test
    public void verifyFooterSocialMediaIconsIsVisibleAndClickable_US07_TC01(){
        // Footer bolumundeki facebook iconun görünüt ve tıklanabilir oldugunu dogrulayın
        softAssert.assertTrue(mainPage.footerFacebookIconElement.isDisplayed());
        softAssert.assertTrue(mainPage.footerFacebookIconElement.isEnabled());
        softAssert.assertAll();
    }

    @Test
    public void verifyFooterSocialMediaIconsIsVisibleAndClickable_US07_TC02(){

    }

    @Test
    public void verifyFooterSocialMediaIconsIsVisibleAndClickable_US07_TC03(){

    }

    @Test
    public void verifyFooterSocialMediaIconsIsVisibleAndClickable_US07_TC04(){

    }

    @Test
    public void verifyFooterSocialMediaIconsIsVisibleAndClickable_US07_TC05(){

    }

    @Test
    public void verifyFooterAdressInformationsIsVisible_US_08_TC1(){
        // Verify the 'Adress' header of Adress section is visible
        softAssert.assertTrue(mainPage.footerAdressHeader.isDisplayed());
        // Verify the 'Company adress' information of Adress section is visible
        softAssert.assertTrue(mainPage.footerCompanyAdress.isDisplayed());
        // Verify the 'Phone number' information of Adress section is visible
        softAssert.assertTrue(mainPage.footerCompanyPhoneNumber.isDisplayed());
        // Verify the 'Email adress' information of Adress section is visible
        softAssert.assertTrue(mainPage.footerCompanyEmailAdress.isDisplayed());

        softAssert.assertAll();
    }


    @AfterMethod
    public void teardown(){
        Driver.getDriver().quit();
    }
}
