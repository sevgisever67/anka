package tests;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import pages.PackagePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import javax.swing.*;

public class US_01_02_03_hasancan extends TestBaseRapor {
    PackagePage packagePage ;
    MainPage mainPage;

    Actions actions;
    SoftAssert softAssert;
    String expectedTitle;
    String actualTitle;


    @BeforeMethod
    public void setup() {
        packagePage = new PackagePage();
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());
        softAssert = new SoftAssert();

        extentTest = extentReports.createTest("US_01_02_03");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

    }

    @Test
    public void us01OpenHomePage() {
        // verify tripandway title text
        String expectedTitle = "Tripandway";
        String actualTitle = Driver.getDriver().getTitle();

        //System.out.println(Driver.getDriver().getTitle());

        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Tripandway title texti görünür");
    }

    @Test
    public void us02sirketNosununGorunurOldugunuTestEt_TC_01() {
        String expectedTelefonNo = "202-456-3789";
        String actualTelefonno = mainPage.ziyaretciSirketTelefonNo.getText();
        Assert.assertEquals(actualTelefonno, expectedTelefonNo);
        extentTest.pass("Şirket nosunun görünür");
    }

    @Test
    public void us02sirketTelefonIconununGorunurOldugunuTestEt_TC_02() {
        Assert.assertTrue(mainPage.ziyaretciTelefonIcon.isDisplayed());
        extentTest.pass("Şirket telefon iconu görünür");
    }

    @Test
    public void us02sirketInfosununDogrulugununTesti_TC_03() {
        Assert.assertTrue(mainPage.ziyaretciIInfo.isDisplayed());
        extentTest.pass("Şirket infosu görünür");

    }

    @Test
    public void mailIkonununGorundugunuDogrula_TC_04() {

        Assert.assertTrue(mainPage.ziyaretciMailIconu.isDisplayed());
        extentTest.pass("Mail ikonu görünür");
    }

    @Test
    public void us02registrationGorundugunuDogrula_TC_05() {
        Assert.assertTrue(mainPage.registrationIcon.isDisplayed());
        extentTest.info("Registration butonu görünür");
        mainPage.registrationButton.click();

        mainPage.registrationCookies.click();

        String expectedTitle = "Registration";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Registration sayfasında olduğu görünür");

    }

    @Test
    public void us02registrationTextiGorundugunuDogrula_TC_06() {
        Assert.assertTrue(mainPage.registrationButton.isDisplayed());
        extentTest.info("Registration yazısının olduğu görünür");
        mainPage.registrationButton.click();
        mainPage.registrationCookies.click();
        String expectedTitle = "Registration";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Registration sayfasında olduğu görünür ");


    }


    @Test
    public void us02loginIconGorundugunuDogrula_TC_07() {

        Assert.assertTrue(mainPage.loginIcon.isDisplayed());
        extentTest.info("Login iconu görünür");
        mainPage.loginIcon.click();
        mainPage.registrationCookies.click();

        String expectedTitle = "Login";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Login sayfasında olduğu görünür");

    }

    @Test
    public void us02loginTextGorundugunuDogrula_TC_08() {
        Assert.assertTrue(mainPage.loginButton.isDisplayed());
        extentTest.info("Login butonu görünür");
        mainPage.loginButton.click();
        mainPage.registrationCookies.click();

        String expectedTitle = "Login";
        String actualTitle = mainPage.loginButton.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Login sayafsında olduğu görünür");

    }

    @Test

    public void us03Logo_TC_01() {
        packagePage.SiteLogo.isDisplayed();

    }

    @Test
    public void us03HomePage_TC_02() {
        Assert.assertTrue(mainPage.homeElementi.isDisplayed());
        extentTest.info("HOME sekmesi görünür");
        mainPage.homeElementi.click();
        //mainPage.registrationCookies.click();

        String expectedTitle = "Tripandway";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Home sayfasının olduğu görünür");

    }

    @Test
    public void us03Services_TC_03() {
        Assert.assertTrue(mainPage.servicesElementi.isDisplayed());
        extentTest.info("Services sekmesi görünür");
        mainPage.servicesElementi.click();
        //mainPage.registrationCookies.click();

        String expectedTitle = "Services";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Services sayfasının olduğu görünür");

    }

    @Test
    public void us03Destinations_TC_04() {
        Assert.assertTrue(mainPage.destinationElementi.isDisplayed());
        extentTest.info("Destinations sekmesi görünür");
        mainPage.destinationElementi.click();
        //mainPage.registrationCookies.click();

        String expectedTitle = "Destinations";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Destinations sayfasının olduğu görünür");

    }

    @Test
    public void us03Packages_TC_05() {
        Assert.assertTrue(mainPage.packageElementi.isDisplayed());
        extentTest.info("Packages sekmesi görünür");
        mainPage.packageElementi.click();
        //mainPage.registrationCookies.click();

        String expectedTitle = "Packages";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Packages sayfasının olduğu görünür");

    }

    @Test
    public void us03AboutUs_TC_06() {
        Assert.assertTrue(mainPage.aboutUsElemnti.isDisplayed());
        extentTest.info("AboutUs sekmesi görünür");
        mainPage.aboutUsElemnti.click();
        //mainPage.registrationCookies.click();

        String expectedTitle = "About Us";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("AboutUs sayfasının olduğu görünür");

    }

    @Test
    public void us03Faq_TC_07() {
        Assert.assertTrue(mainPage.fqaElementi.isDisplayed());
        extentTest.info("FAQ sekmesi görünür");
        mainPage.fqaElementi.click();
        //mainPage.registrationCookies.click();

        String expectedTitle = "FAQ";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("FAQ sayfasının olduğu görünür");

    }

    @Test
    public void us03BlogTC_08() {
        Assert.assertTrue(mainPage.blogElementi.isDisplayed());
        extentTest.info("Blog sekmesi görünür");
        mainPage.blogElementi.click();
        //mainPage.registrationCookies.click();

        String expectedTitle = "Blog";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Blog sayfasının olduğu görünür");

    }

    @Test
    public void us03ContactTC_09() {
        Assert.assertTrue(mainPage.contactElementi.isDisplayed());
        extentTest.info("Contact sekmesi görünür");
        mainPage.contactElementi.click();
        //mainPage.registrationCookies.click();

        String expectedTitle = "Contact Us";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Contact sayfasının olduğu görünür");

    }

    @Test
    public void us03mainSlider1_TC_10() {
        Assert.assertTrue(mainPage.mainSlider1.isDisplayed());
        extentTest.info("mainSlider1 resmi görünür");
        packagePage.cookiesAcceptButton.click();
        mainPage.readMore1.click();
        extentTest.fail("Read More butonu çalışmıyor");



    }
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

    @Test
    public void us03mainSlider2_TC_11() {
        packagePage.cookiesAcceptButton.click();
        mainPage.nextSliderButton.click();
        Assert.assertTrue(mainPage.mainSlider2.isDisplayed());
        extentTest.info("mainSlider2 resmi görünür");
        mainPage.readMore2.click();
        String expectedTitle = "7 days in Istanbul";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("İstanbul sayfasının olduğu görünür");

    }

    @Test
    public void us03mainSlider3_TC_12() {
        packagePage.cookiesAcceptButton.click();
        mainPage.nextSliderButton.click();
        mainPage.nextSliderButton.click();
        Assert.assertTrue(mainPage.mainSlider3.isDisplayed());
        extentTest.info("mainSlider3 resmi görünür");
        mainPage.readMore3.click();
        String expectedTitle = "7 days in Salina Island";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("Salina Island sayfasının olduğu görünür");



    }

    @Test
    public void us03internationalTourResim_TC_13() throws InterruptedException {
        packagePage.cookiesAcceptButton.click();
        Assert.assertTrue(mainPage.iconInternationalTour.isDisplayed());
        extentTest.info("İnternatinol Tour ikonu görünür");
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(500, 750)");
        //actions.scrollToElement(mainPage.intTourText).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        mainPage.intTourText.click();
        extentTest.pass("İnternational Tour resmi tıklanabilir ve içeriği görüntülenir.");

    }

    @Test
    public void us03adventureTourResim_TC_14() throws InterruptedException {
        packagePage.cookiesAcceptButton.click();
        Assert.assertTrue(mainPage.iconAdventureTour.isDisplayed());
        extentTest.info("Adventure Tour ikonu görünür");
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(500, 750)");
        //actions.scrollToElement(mainPage.intTourText).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        mainPage.advantureText.click();
        extentTest.pass("Adventure Tour resmi tıklanabilir ve içeriği görüntülenir.");
    }

    @Test
    public void us03cultureTourResim_TC_15() throws InterruptedException {
        packagePage.cookiesAcceptButton.click();
        Assert.assertTrue(mainPage.iconCultureTour.isDisplayed());
        extentTest.info("Culture Tour ikonu görünür");
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(500, 750)");
        //actions.scrollToElement(mainPage.intTourText).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        mainPage.cultureText.click();
        extentTest.pass("Culture Tour resmi tıklanabilir ve içeriği görüntülenir.");
    }
    @Test
    public void us03businessTourResim_TC_16() throws InterruptedException {
        packagePage.cookiesAcceptButton.click();
        Assert.assertTrue(mainPage.iconBussinessTour.isDisplayed());
        extentTest.info("Business Tour ikonu görünür");
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(500, 750)");
        //actions.scrollToElement(mainPage.intTourText).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        mainPage.businessText.click();
        extentTest.pass("Business Tour resmi tıklanabilir ve içeriği görüntülenir.");

    }
    @Test
    public void us03healthTourResim_TC_17() throws InterruptedException {
        packagePage.cookiesAcceptButton.click();
        Assert.assertTrue(mainPage.iconHealthTour.isDisplayed());
        extentTest.info("Health Tour ikonu görünür");
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(500, 750)");
        //actions.scrollToElement(mainPage.intTourText).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        mainPage.healthText.click();
        extentTest.pass("Health Tour resmi tıklanabilir ve içeriği görüntülenir.");
    }
    @Test
    public void us03religiousTourResim_TC_18() throws InterruptedException {
        packagePage.cookiesAcceptButton.click();
        Assert.assertTrue(mainPage.iconReligiousTour.isDisplayed());
        extentTest.info("Religious Tour ikonu görünür");
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(500, 750)");
        //actions.scrollToElement(mainPage.intTourText).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        mainPage.religiousText.click();
        extentTest.pass("Religious Tour resmi tıklanabilir ve içeriği görüntülenir.");

    }
}


