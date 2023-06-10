package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_39_40_Nursen extends TestBaseRapor {

    Admin_Dashboard adminDashboard;
    SoftAssert softAssert = new SoftAssert();


    @BeforeMethod
    public void setUp() {

        adminDashboard= new Admin_Dashboard();
        extentTest= extentReports.createTest("US39_40");

        //1. Yönetici olarak herhangi bir browser'a "https://qa.tripandway.com/admin/login URL'sini yazınız
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //2. "Email Address" alanına geçerli bir email adresi yazınız
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));

        //3. "Password" alanına geçerli bir parola yazınız
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        //4. "Login" butonuna tıklayınız
        adminDashboard.adminLoginButton.click();
        extentTest.info("Yönetici olarak giriş yapılır");

    }

    @Test
    public void adminFotografDegistirmeEkraniTesti_39(){

        //5. Hesap ikonuna tıklayınız
        adminDashboard.adminAdmin25Profile.click();
        extentTest.info("Yönetici admin hesabı iconuna click yapar");

        //6. "Change Photo" menüsüne tıklayınız
        adminDashboard.adminChangePhoto.click();
        extentTest.info("Yönetici Change Photo menüsüne click yapar ve Change Photo sayfasına gider");

        //7. "Change Photo" sayfasının görünür olduğunu doğrulayınız
        String expectedURL="https://qa.tripandway.com/admin/photo-change";
        String actualURL=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualURL,expectedURL," Change Photo sayfası görünür");
        extentTest.info("Soft assert ile Change Photo görünürlüğü test edilir ");
        extentTest.pass("Change Photo sayfasının görünür olduğu test edildi");
        Driver.closeDriver();
        softAssert.assertAll();

    }

    @Test
    public  void daraltmaOkIsaretiTesti_40_01(){

        //5. Admin sayfasının altındaki ok işaretine basınız
        adminDashboard.adminOkIsareti.click();
        extentTest.info("Yönetici ok işaretine click yapar");

        //6. Daraltma ok işaretinin çalıştığını doğrulayınız
        softAssert.assertFalse(adminDashboard.adminADMINPANELYazisi.isDisplayed());
        extentTest.info("Soft assert ile ADMIN PANEL yazısının görünmediği test edilir");
        extentTest.pass("Daraltma ok işaretinin çalıştığı test edildi");
        Driver.closeDriver();
        softAssert.assertAll();

    }

    @Test
    public void visitWebsiteButonuTesti_40_02(){

        //5. Sayfasının üst kısmında bulunan "Visit Website" butonuna tıklayınız
        adminDashboard.adminVisitWebsiteButonu.click();
        extentTest.info("Yönetici Visit Website butonuna click yapar ve yeni bir sayfaya gider");

        //6. Açılan yeni pencerenin title textinin “Tripandway” yazısı içerdiğini dogrulayınız
        ReusableMethods.switchToWindow("Tripandway");

        String expectedTitle = "Tripandway";
        String actualTitle = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle, "2. sayfanın title texti Tripandway içerir");
        extentTest.info("Soft assert ile sayfanın title textinin Tripandway içerdiğini test eder");
        extentTest.pass(" Visit Website butonu test edildi");
        Driver.closeDriver();
        softAssert.assertAll();

    }

}
