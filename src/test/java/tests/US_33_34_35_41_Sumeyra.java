package tests;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_33_34_35_41_Sumeyra extends TestBaseRapor{

    Admin_Dashboard adminDashboard;

    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setup(){

        adminDashboard=new Admin_Dashboard();

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

        adminDashboard=new Admin_Dashboard();
        extentTest= extentReports.createTest("orderDetailDisplayTest_us33");

        // click the order menu from the admin panel
        adminDashboard.adminOrderButton.click();
        extentTest.info("After logging in as admin, the user clicks on the 'Order' menu from the Admin Panel.");

        // click the detail button of the first order
        adminDashboard.adminOrderDetailButton.click();
        extentTest.info("On the opened Orders page, click the 'Detail' button of the first order to view its detail.");

        // verify order detail is displayed
        softAssert.assertTrue(adminDashboard.adminOrderDetailPageText.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("It has been verified that the order details are displayed when the 'Detail' button of the order is clicked.");



    }

    @Test(priority = 2)
    public void orderInvoiceDisplayTest_us34(){

        adminDashboard=new Admin_Dashboard();
        extentTest= extentReports.createTest("orderInvoiceDisplayTest_us34");

        // click the order menu from the admin panel
        adminDashboard.adminOrderButton.click();
        extentTest.info("After logging in as admin, the user clicks on the 'Order' menu from the Admin Panel.");

        // click the invoice button of the first order
        adminDashboard.adminOrderInvoiceButton.click();
        extentTest.info("On the Opened Orders page, click the 'Invoice' button of the first order to view the invoice.");


        // verify that the order invoice is displayed
        softAssert.assertTrue(adminDashboard.adminOrderInvoicePageText.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("It has been verified that the order invoice details are displayed when the 'Invoice' button of the order is clicked.");


    }


    @Test(priority = 3)
    public void whereAllNewsListMembersAreDisplayed_us35() {

        adminDashboard=new Admin_Dashboard();
        extentTest= extentReports.createTest("whereAllNewsListMembersAreDisplayed_us35");

        // click on subscribe menu from admin panel
        adminDashboard.adminSubscriberButton.click();
        extentTest.info("After logging in as admin, the user clicks on the 'Subscriber' menu from the Admin Panel.");

        // click on the All Subscribers
        adminDashboard.adminAllSubscribersButton.click();
        extentTest.info("Click on the 'All Subscribers' category from the drop-down menu.");


        // verify that all news list members are displayed
        softAssert.assertTrue(adminDashboard.adminViewSubscribersText.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("Verified that all newslist members are viewed.");




    }

    @Test(priority = 4)
    public void returnHomeScreenTest_us41(){


        adminDashboard=new Admin_Dashboard();
        extentTest= extentReports.createTest("returnHomeScreenTest_us41");

        adminDashboard.adminAdmin25Profile.click();
        adminDashboard.adminProfileLogout.click();
        extentTest.info("Logs out of the admin account.");

        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        String expectedTitle=Driver.getDriver().getTitle();
        System.out.println(expectedTitle);

        softAssert.assertEquals(actualTitle,expectedTitle,"could not return to the site screen.");
        extentTest.fail("It has been tested that it can return to the site screen.");
        softAssert.assertAll();


    }


}
