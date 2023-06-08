package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_33_34_35_41_Sumeyra extends TestBaseRapor{

    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setup(){

        extentTest= extentReports.createTest("US33_34_35_41");

        //Go to url as an admin
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //Send key the Email Address
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));

        //Send key the Password
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        //Click on the Login
        adminDashboard.adminLoginButton.click();

    }

    @Test(priority = 1)
    public void orderDetailDisplayTest_us33(){

        // click the order menu from the admin panel
        adminDashboard.adminOrderButton.click();
        extentTest.info("Kullanıcı admin olarak giriş yaptıktan sonra Admin Panel'den 'Order' menüsünü tıklar.");

        // click the detail button of the first order
        adminDashboard.adminOrderDetailButton.click();
        extentTest.info("Acılan Orders sayfasında, detayını görüntülemek için ilk siparişin 'Detail' butonunu tıklar.");

        // verify order detail is displayed
        softAssert.assertTrue(adminDashboard.adminOrderDetailPageText.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("Siparişin 'Detail' butonu tıklandığında sipariş detaylarının görüntülendiği dogrulandı.");

        //Driver.closeDriver();


    }

    @Test(priority = 2)
    public void orderInvoiceDisplayTest_us34(){

        // click the order menu from the admin panel
        adminDashboard.adminOrderButton.click();
        extentTest.info("Kullanıcı admin olarak giriş yaptıktan sonra Admin Panel'den 'Order' menüsünü tıklar.");

        // click the invoice button of the first order
        adminDashboard.adminOrderInvoiceButton.click();
        extentTest.info("Acılan Orders sayfasında, faturayı görüntülemek için ilk siparişin 'Invoice' butonunu tıklar.");


        // verify that the order invoice is displayed
        softAssert.assertTrue(adminDashboard.adminOrderInvoicePageText.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("Siparişin 'Invoice' butonu tıklandığında sipariş fatura detaylarının görüntülendiği dogrulandı.");


    }


    @Test(priority = 3)
    public void whereAllNewsListMembersAreDisplayed_us35() {

        // click on subscribe menu from admin panel
        adminDashboard.adminSubscriberButton.click();
        extentTest.info("Kullanıcı admin olarak giriş yaptıktan sonra Admin Panel'den 'Subscriber' menüsünü tıklar.");

        // click on the All Subscribers
        adminDashboard.adminAllSubscribersButton.click();
        extentTest.info("Acılan menüden 'AllSubscribers' kategorisini tıklar.");


        // verify that all news list members are displayed
        softAssert.assertTrue(adminDashboard.adminViewSubscribersText.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("Tüm haber listesi üyelerinin görüntülendiği dogrulandı.");




    }

    @Test(priority = 4)
    public void returnHomeScreenTest_us41(){


        adminDashboard.adminAdmin25Profile.click();
        adminDashboard.adminProfileLogout.click();
        extentTest.info("Admin hesabından cıkıs yapar.");

        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        String expectedTitle=Driver.getDriver().getTitle();
        System.out.println(expectedTitle);

        softAssert.assertEquals(actualTitle,expectedTitle,"site ekranına dönüs yapamadı.");
        extentTest.fail("Site ekranına dönüş yapabildigi test edildi.");
        softAssert.assertAll();




    }

/*
    @AfterMethod
    public void taerDown(){

        Driver.closeDriver();

    }

 */











}
