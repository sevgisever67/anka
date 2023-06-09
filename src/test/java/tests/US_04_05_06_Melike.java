package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_04_05_06_Melike extends TestBaseRapor {
    MainPage mainPage ;
    Actions actions ;
    SoftAssert softAssert;


    @BeforeMethod
    public void setUp() {
        mainPage= new MainPage();
        actions= new Actions(Driver.getDriver());
        softAssert = new SoftAssert();
        extentTest = extentReports.createTest("US04_05_06");
        //Go to url as a user
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }

    @Test
    public void verifyTheFeaturedPackagesAreActiveAndClickable_04() {

        actions.sendKeys(Keys.END).perform();
        extentTest.info("go to the bottom of the page");
        mainPage.featuredPackagestFirstElement.click();

        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClick(mainPage.featuredPackagesSecondElement, 5);
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClick(mainPage.featuredPackagesThirdElement, 5);
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClickElement(mainPage.featuredPackagesFourthElement, 5);
        extentTest.info("Elements under Featured Packages are clicked in order");


        softAssert.assertTrue(mainPage.featuredPackagestFirstElement.isEnabled());
        softAssert.assertTrue((mainPage.featuredPackagesSecondElement.isEnabled()));
        softAssert.assertTrue(mainPage.featuredPackagesThirdElement.isEnabled());
        softAssert.assertTrue(mainPage.featuredPackagesFourthElement.isEnabled());

        softAssert.assertAll();
        extentTest.pass("The Featured Packages Are Active And Clickable");

    }


    @Test
    public void verifyTheLatestPackagesAreActiveAndClickable_05() {
        //mainPage.cookie.click();
        actions.sendKeys(Keys.END).perform();
        extentTest.info("go to the bottom of the page");
        mainPage.latestPackagesFirstElement.click();
        Driver.getDriver().navigate().back();
        mainPage.latesPackagesSecondElement.click();
        Driver.getDriver().navigate().back();
        mainPage.latesPackagesThirdElement.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClickElement(mainPage.latesPackagesFourthElement, 5);
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClickElement(mainPage.latesPackagesFifthElement, 5);
        extentTest.info("Elements under late packages are clicked in order");


        softAssert.assertTrue(mainPage.latestPackagesFirstElement.isEnabled());
        softAssert.assertTrue(mainPage.latesPackagesSecondElement.isEnabled());
        softAssert.assertTrue(mainPage.latesPackagesThirdElement.isEnabled());
        softAssert.assertTrue(mainPage.latesPackagesFourthElement.isEnabled());
        softAssert.assertTrue(mainPage.latesPackagesFifthElement.isEnabled());
        softAssert.assertAll();
        extentTest.pass("The Latest Packages Are Active And Clickable");


    }

    @Test
    public void verifyTheRecentPostsAreActiveAndClickable_06() {
        extentTest.info("go to the bottom of the page");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        mainPage.recentPostFirstElement.click();
        Driver.getDriver().navigate().back();
        mainPage.recentPostSecondElement.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClickElement(mainPage.recentPostThirdElement, 5);
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClickElement(mainPage.recentPostFourthElement, 5);
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClickElement(mainPage.recentPostFifthElement, 5);
        extentTest.info("Elements under Recent Post are clicked in order");


        softAssert.assertTrue(mainPage.recentPostFirstElement.isEnabled());
        softAssert.assertTrue(mainPage.recentPostSecondElement.isEnabled());
        softAssert.assertTrue(mainPage.recentPostThirdElement.isEnabled());
        softAssert.assertTrue(mainPage.recentPostFourthElement.isEnabled());
        softAssert.assertTrue(mainPage.recentPostFifthElement.isEnabled());
        softAssert.assertAll();
        extentTest.pass("TheRecent Posts Are Active And Clickable");


    }



}

