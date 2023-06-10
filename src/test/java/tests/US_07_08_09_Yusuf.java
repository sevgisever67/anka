package tests;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ContactPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_07_08_09_Yusuf extends TestBaseRapor {

    MainPage mainPage;
    Actions actions;
    SoftAssert softAssert;
    Faker faker;
    ContactPage contactPage ;
    ExtentTest extentTest;

    String expectedTitle;
    String actualTitle;


    @BeforeMethod
    public void setUp() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());
        softAssert = new SoftAssert();
        faker = new Faker();
        contactPage = new ContactPage();
        extentTest = extentReports.createTest("US_07_08_09");

        // Siteye qa kısmından üye girişi yaptıktan sonra testleri yapıyoruz
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        mainPage.loginButton.click();
        mainPage.userEmailAddrsess.sendKeys(ConfigReader.getProperty("userUsername"));
        mainPage.userPasswordButton.sendKeys(ConfigReader.getProperty("userPassword"));
        mainPage.loginSubmitButton.click();
        mainPage.cookiesAcceptButton.click();
        mainPage.homeElementi.click();
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(2);

    }

    @Test
    public void verifyFooterSocialMediaFacebookIconsIsVisibleAndClickable_US07_TC01() throws InterruptedException {

        // Footer bolumundeki facebook iconunun görünür ve tıklanabilir oldugunu dogrulayın
        softAssert.assertTrue(mainPage.footerFacebookIconElement.isDisplayed());
        softAssert.assertTrue(mainPage.footerFacebookIconElement.isEnabled());
        String driverIlkWhd=Driver.getDriver().getWindowHandle();



        // Footer bolumundeki facebook iconuna tıkladigimda facebook sayfasina gidebilmeliyim
        mainPage.footerFacebookIconElement.click();
        extentTest.info("Kullanıcı facebook ikonuna tıklar");
        //ReusableMethods.switchToWindowTarget("Facebook");
        System.out.println(Driver.getDriver().getTitle());

        Thread.sleep(2000);
        System.out.println(Driver.getDriver().getTitle());
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle="Facebook";

        softAssert.assertEquals(actualTitle,expectedTitle);

        extentTest.pass("Facebook ikonuna tıklandığında,facebook sayfasına başarılı bir sekilde gecildi");


    }

    @Test
    public void verifyFooterSocialMediaTwitterIconsIsVisibleAndClickable_US07_TC02() throws InterruptedException {


        // Footer bolumundeki twitter iconunun görünür ve tıklanabilir oldugunu dogrulayın
        softAssert.assertTrue(mainPage.footerTwitterIconElement.isDisplayed());
        softAssert.assertTrue(mainPage.footerTwitterIconElement.isEnabled());

        // Footer bolumundeki twitter iconuna tıkladigimda twitter sayfasina gidebilmeliyim
        mainPage.footerTwitterIconElement.click();
        extentTest.info("Kullanıcı twitter ikonuna tıklar");

        //ReusableMethods.switchToWindowTarget("Twitter");


        Thread.sleep(2000);
        //System.out.println(Driver.getDriver().getTitle());
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle="Twitter";

        softAssert.assertEquals(actualTitle,expectedTitle,"Twitter iconuna tıklandığında twitter sayfasına geçilemedi");

        softAssert.assertAll();

        extentTest.fail("Twitter ikonuna tıklandıginda,facebook sayfasına gecis yapildi");




    }

    @Test
    public void verifyFooterSocialMediaLinkedinIconsIsVisibleAndClickable_US07_TC03() throws InterruptedException {


        // Footer bolumundeki Linkedin iconunun görünür ve tıklanabilir oldugunu dogrulayın
        softAssert.assertTrue(mainPage.footerLinkedinIconElement.isDisplayed());
        softAssert.assertTrue(mainPage.footerLinkedinIconElement.isEnabled());
        extentTest.info("Footer'daki Linkedin butonu gorunur ve aktif");

        // Footer bolumundeki Linkedin iconuna tıkladigimda Linkedin sayfasina gidebilmeliyim
        mainPage.footerLinkedinIconElement.click();
        extentTest.info("Kullanıcı Linkedin ikonuna tıklar");

        ReusableMethods.switchToWindowTarget("Linkedin");
        System.out.println(Driver.getDriver().getTitle());

        Thread.sleep(2000);
        System.out.println(Driver.getDriver().getTitle());
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle="LinkedIn: Oturum Açın veya Üye Olun";

        softAssert.assertEquals(actualTitle,expectedTitle);

        softAssert.assertAll();

        extentTest.pass("Linkedin ikonuna tıklandığında,Linkedin sayfasına başarılı bir sekilde gecildi");
    }

    @Test
    public void verifyFooterSocialMediaPinterestIconsIsVisibleAndClickable_US07_TC04() throws InterruptedException {

        // Footer bolumundeki Pinterest iconunun görünür ve tıklanabilir oldugunu dogrulayın
        softAssert.assertTrue(mainPage.footerPinterestIconElement.isDisplayed());
        softAssert.assertTrue(mainPage.footerPinterestIconElement.isEnabled());
        extentTest.info("Footer'daki Pinterest butonu gorunur ve aktif");


        // Footer bolumundeki Pinterest iconuna tıkladigimda Pinterest sayfasina gidebilmeliyim
        mainPage.footerPinterestIconElement.click();
        ReusableMethods.switchToWindowTarget("Pinterest");
        System.out.println(Driver.getDriver().getTitle());

        Thread.sleep(5000);
        System.out.println(Driver.getDriver().getTitle());
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle="Pinterest";

        softAssert.assertEquals(actualTitle,expectedTitle,"Pinterest iconuna tıklandığında Pinterest sayfasına geçilemedi");

        softAssert.assertAll();

        extentTest.fail("Pinterest ikonuna tıklandığında,Pinterest sayfasına değil twitter sayfasına gecildi");
    }

    @Test
    public void verifyFooterSocialMediaInstagramIconsIsVisibleAndClickable_US07_TC05() throws InterruptedException {


        // Footer bolumundeki Instagram iconunun görünür ve tıklanabilir oldugunu dogrulayın
        softAssert.assertTrue(mainPage.footerInstagramIconElement.isDisplayed());
        softAssert.assertTrue(mainPage.footerInstagramIconElement.isEnabled());
        extentTest.info("Footer'daki Instagram butonu gorunur ve aktif");

        // Footer bolumundeki instagram iconuna tıkladigimda instagram sayfasina gidebilmeliyim
        mainPage.footerInstagramIconElement.click();
        ReusableMethods.switchToWindowTarget("Instagram");
        System.out.println(Driver.getDriver().getTitle());

        Thread.sleep(3000);
        System.out.println(Driver.getDriver().getTitle());
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle="Instagram";

        softAssert.assertEquals(actualTitle,expectedTitle);

        softAssert.assertAll();

        extentTest.pass("Instagram ikonuna tıklandığında,Instagram sayfasına başarılı bir sekilde gecildi");


    }

    @Test
    public void verifyFooterAdressInformationsIsVisible_US_08_TC1() {

        extentTest.info("Kullanıcı uye girisi yaptıktan sonra Footer'da bulunan adres baslıgı ve " +
                "iletisim bilgierinin görüntülenebildigini test eder");
        // Verify the 'Adress' header of Adress section is visible
        softAssert.assertTrue(mainPage.footerAdressHeader.isDisplayed());
        // Verify the 'Company adress' information of Adress section is visible
        softAssert.assertTrue(mainPage.footerCompanyAdress.isDisplayed());
        // Verify the 'Phone number' information of Adress section is visible
        softAssert.assertTrue(mainPage.footerCompanyPhoneNumber.isDisplayed());
        // Verify the 'Email adress' information of Adress section is visible
        softAssert.assertTrue(mainPage.footerCompanyEmailAdress.isDisplayed());

        softAssert.assertAll();
        extentTest.pass("Kullanıcı 'Adress' baslıgını ve iletişim bilgilerini basarıyla goruntuler");
    }

    @Test
    public void verifyThatICanJoinTheNewsletterByEmail() { // haber bultenine email ile kaydolabilmeliyim

        extentTest.info("Kullanici üye girişi yaptıktan sonra Newsletter başlıgını goruntuler");

        softAssert.assertTrue(mainPage.newsletterYaziELementi.isDisplayed());

        // Newsletter email textbox'ina email adresi yazabilmeliyim
        softAssert.assertTrue(mainPage.newsletterEmailKutusuELementi.isEnabled());
        extentTest.info("Kullanıcı Newsletter bölümündeki email textbox'ının ulaşılabilir oldugunu test eder");

        mainPage.newsletterEmailKutusuELementi.sendKeys(faker.internet().emailAddress());
        mainPage.newsletterSubmitButonuELementi.click();
        extentTest.info("Kullanıcı Newsletter bültenine email adresiyle kayıt yapabildigini dogrular");

        softAssert.assertTrue(contactPage.toastmessage.isDisplayed());
        extentTest.info("Kullanıcı Newsletter bültenine kayıt oldugnu bildiren alert'i görebildiğini test eder");

        softAssert.assertAll();

        extentTest.pass("Kullanıcı email adresi ile newsletter bultenine kaydını basarıyla tamamlar");


    }


}

