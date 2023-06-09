package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        ReusableMethods.waitFor(2);
        mainPage.cookiesAcceptButton.click();
    }

    @Test
    public void LatestBlogTest_TC_39() {

        //actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//h3[.='07'])[1]//..//../..//../a"))).pause(1000).click().perform();
        actions.moveToElement(mainPage.ourclientYazisi).perform();
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);

        mainPage.LatesBlogGreenvillePhotoElement.click();



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
    public void LatestBlogTest_TC_40(){

        softAssert.assertTrue(mainPage.LatesBlogHittitesPhotoElement.isDisplayed());
        softAssert.assertTrue(mainPage.LatesBlogHittitesPhotoElement.isEnabled());
        softAssert.assertAll();

        mainPage.LatesBlogHittitesTextElement.click();

        Driver.getDriver().navigate().back();
        mainPage.LatesBlogHittitesReadMoreButton.click();

        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Discovering the Ancient Capital of the Hittites:Bogazkale and Hattusas";
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertAll();

    }

    @Test
    public void LatestBlogTest_TC_41(){

        softAssert.assertTrue(mainPage.LatesBlogSalinaIslandPhotoElement.isDisplayed());
        softAssert.assertTrue(mainPage.LatesBlogSalinaIslandPhotoElement.isEnabled());
        softAssert.assertAll();

        mainPage.LatesBlogSalinaIslandTextElement.click();

        Driver.getDriver().navigate().back();
        mainPage.LatesBlogSalinaIslandReadMoreButton.click();

        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Salina Island: A perfect Family Getaway";
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertAll();

    }

    @Test
    public void LatestBlogTest_TC_42(){

        softAssert.assertTrue(mainPage.LatesBlogBangkokPhotoElement.isDisplayed());
        softAssert.assertTrue(mainPage.LatesBlogBangkokPhotoElement.isEnabled());
        softAssert.assertAll();

        mainPage.LatesBlogBangkokTextElement.click();

        Driver.getDriver().navigate().back();
        mainPage.LatesBlogBangkokReadMoreButton.click();

        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Bangkok: A city of Contrasts";
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertAll();

    }

    @Test
    public void LatestBlogTest_TC_43(){

        softAssert.assertTrue(mainPage.LatesBlogBuenosAiresPhotoElement.isDisplayed());
        softAssert.assertTrue(mainPage.LatesBlogBuenosAiresPhotoElement.isEnabled());
        softAssert.assertAll();

        mainPage.LatesBlogBuenosAiresTextElement.click();

        Driver.getDriver().navigate().back();
        mainPage.LatesBlogBuenosAiresReadMoreButton.click();

        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Buenos Aires:The Paris of South America";
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertAll();

    }

    @Test
    public void LatestBlogTest_TC_44(){

        softAssert.assertTrue(mainPage.LatesBlogGreenvillePhotoElement.isDisplayed());
        softAssert.assertTrue(mainPage.LatesBlogGreenvillePhotoElement.isEnabled());
        softAssert.assertAll();

        mainPage.LatesBlogGreenvilleTextElement.click();

        Driver.getDriver().navigate().back();
        mainPage.LatesBlogGreenvilleReadMoreButton.click();

        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Discovering Greenville: A Hidden Gem in South Carolina";
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertAll();

    }

    @Test
    public void OurClientEasyTicketTest_TC_45(){

        actions.scrollToElement(mainPage.OurClientEasyTicketPhotoElement).perform();

        softAssert.assertTrue(mainPage.OurClientEasyTicketPhotoElement.isDisplayed());
        softAssert.assertAll();

    }
    @Test
    public void OurClientPassportTest_TC_46(){

        actions.scrollToElement(mainPage.OurClientPassportPhotoElement).perform();

        softAssert.assertTrue(mainPage.OurClientPassportPhotoElement.isDisplayed());
        softAssert.assertAll();

    }

    @Test
    public void OurClientIcanActivitiesTest_TC_47(){

        actions.scrollToElement(mainPage.OurClientIcanActivitiesPhotoElement).perform();

        softAssert.assertTrue(mainPage.OurClientIcanActivitiesPhotoElement.isDisplayed());
        softAssert.assertAll();

    }

    @Test
    public void OurClientParkmapTest_TC_48(){

        actions.scrollToElement(mainPage.OurClientParkmapPhotoElement).perform();

        softAssert.assertTrue(mainPage.OurClientParkmapPhotoElement.isDisplayed());
        softAssert.assertAll();

    }

    @Test
    public void OurClientEasyFlyTest_TC_49(){

        actions.scrollToElement(mainPage.OurClientEasyFlyPhotoElement).perform();

        softAssert.assertTrue(mainPage.OurClientEasyFlyPhotoElement.isDisplayed());
        softAssert.assertAll();

    }

    @Test
    public void OurClientBussinesIncreaseTest_TC_50(){

        actions.scrollToElement(mainPage.OurClientBussinesIncreasePhotoElement).perform();

        softAssert.assertTrue(mainPage.OurClientBussinesIncreasePhotoElement.isDisplayed());
        softAssert.assertAll();

    }

    @Test
    public void OurClientYachtseaITest_TC_51(){

        actions.scrollToElement(mainPage.OurClientYachtseaPhotoElement).perform();

        softAssert.assertTrue(mainPage.OurClientYachtseaPhotoElement.isDisplayed());
        softAssert.assertAll();

    }



}
