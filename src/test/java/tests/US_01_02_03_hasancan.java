package tests;

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

public class US_01_02_03_hasancan extends TestBaseRapor {
    PackagePage packagePage = new PackagePage();
    MainPage mainPage = new MainPage();

    @BeforeMethod
    public void setup() {

        extentTest = extentReports.createTest("US_01_02_03");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

    }

    @Test
    public void us01OpenHomePage() {

        String expectedTitle = "Tripandway";
        String actualTitle = Driver.getDriver().getTitle();

        //System.out.println(Driver.getDriver().getTitle());

        Assert.assertEquals(actualTitle, expectedTitle);
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
        extentTest.pass("Registration butonu görünür");
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
        extentTest.pass("Registration yazısının olduğu görünür");
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
        extentTest.pass("Login iconu görünür");
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
        extentTest.pass("Login butonu görünür");
        mainPage.loginButton.click();
        mainPage.registrationCookies.click();

        String expectedTitle = "Login";
        String actualTitle = mainPage.loginButton.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
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


    @Test

    public void us03Logo_TC_01() {
        packagePage.SiteLogo.isDisplayed();

    }

    @Test
    public void us03HomePage_TC_02() {
        Assert.assertTrue(mainPage.homeElementi.isDisplayed());
        extentTest.pass("HOME sekmesi görünür");
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
        extentTest.pass("Services sekmesi görünür");
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
        extentTest.pass("Destinations sekmesi görünür");
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
        extentTest.pass("Packages sekmesi görünür");
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
        extentTest.pass("AboutUs sekmesi görünür");
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
        extentTest.pass("FAQ sekmesi görünür");
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
        extentTest.pass("Blog sekmesi görünür");
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
        extentTest.pass("Contact sekmesi görünür");
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
        extentTest.pass("mainSlider1 resmi görünür");
        packagePage.cookiesAcceptButton.click();
        mainPage.readMore1.click();
        extentTest.fail("Read More butonu çalışmıyor");
        //mainPage.registrationCookies.click();

        //String expectedTitle = "Contact Us";(//div[@class='text-animated'])[9]
        //String actualTitle = Driver.getDriver().getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle);
       // extentTest.pass("Contact sayfasının olduğu görünür");

    }

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


}
