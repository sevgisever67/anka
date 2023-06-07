package tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.ConfigurationGroupMethods;
import pages.HomePage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.TestBaseRapor.extentReports;

public class US_04_05_06_Melike extends TestBaseRapor {
    MainPage mainPage = new MainPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();


    @BeforeMethod
    public void setUp() {
        extentTest = extentReports.createTest("US04_05_06");
        //extentTest = extentReports.createTest("US04_05_06");
        //Go to url as a user
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }

    @Test
    public void verifyTheFeaturedPackagesAreActiveAndClickable_04() {
        //mainPage.cookie.click();
        // mainPage.homeElementi.click();
        actions.sendKeys(Keys.END).perform();
       mainPage.featuredPackagestFirstElement.click();

        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClick(mainPage.featuredPackagesSecondElement);
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClick(mainPage.featuredPackagesThirdElement, 5);
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClickElement(mainPage.featuredPackagesFourthElement, 5);

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
       mainPage.latestPackagesFirstElement.click();
        Driver.getDriver().navigate().back();
        mainPage.latesPackagesSecondElement.click();
        Driver.getDriver().navigate().back();
        mainPage.latesPackagesThirdElement.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.waitAndClickElement(mainPage.latesPackagesFourthElement,5);
        Driver.getDriver().navigate().back();
       ReusableMethods.waitAndClickElement(mainPage.latesPackagesFifthElement,5);

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

        softAssert.assertTrue(mainPage.recentPostFirstElement.isEnabled());
        softAssert.assertTrue(mainPage.recentPostSecondElement.isEnabled());
        softAssert.assertTrue(mainPage.recentPostThirdElement.isEnabled());
        softAssert.assertTrue(mainPage.recentPostFourthElement.isEnabled());
        softAssert.assertTrue(mainPage.recentPostFifthElement.isEnabled());
        softAssert.assertAll();
        extentTest.pass("TheRecent Posts Are Active And Clickable");


    }


}









