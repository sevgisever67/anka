package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_03_HasanCan {

       MainPage mainPage = new MainPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();
    String expectedTitle;
    String actualTitle;

    @BeforeMethod
    public void setUp() {

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }

    @Test
    public void LatestBlogTesti_TC_39() {

        actions.moveToElement(mainPage.LatesBlogIstanbulReadMoreButton).perform();
        ReusableMethods.waitFor(2);
        mainPage.LatesBlogIstanbulReadMoreButton.click();



        softAssert.assertTrue(mainPage.LatesBlogIstanbulPhotoElement.isDisplayed());
        softAssert.assertTrue(mainPage.LatesBlogIstanbulPhotoElement.isEnabled());
        softAssert.assertAll();

        mainPage.LatesBlogIstanbulTextElement.click();

        Driver.getDriver().navigate().back();
        mainPage.LatesBlogIstanbulReadMoreButton.click();

        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Istanbul:A Fusion of East and West";
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertAll();

    }

    @Test
    public void OurClientTest_TC_46(){

    }



}
