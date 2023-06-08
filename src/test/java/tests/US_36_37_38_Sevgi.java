package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import pages.ContactPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class US_36_37_38_Sevgi extends TestBaseRapor {

    Admin_Dashboard adminDashboard = new Admin_Dashboard();
    ContactPage contactPage=new ContactPage();
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setUp() {
        extentTest = extentReports.createTest("US36_37_38");


        //Go to url as an admin
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));
        //Send keys the name and password
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));
        //Click on the Login
        adminDashboard.adminLoginButton.click();
        extentTest.info("Log in as an admin");

    }

    @Test
    public void verifySendingEmail_36() {

        //Click on the subscriber
        adminDashboard.adminSubscriberButton.click();
        //Click on the "Send Email to Subscriber"
        adminDashboard.adminSendEmailToSubscriber.click();
        //Click on the subject box
        adminDashboard.adminSubjectBox.click();
        //Send keys the subject
        adminDashboard.adminSubjectBox.sendKeys(ConfigReader.getProperty("qaAdminSendEmailSubscriberSubjectBox"));
        //Click on the "Message Box"
        adminDashboard.adminMessageBox.click();
        //Send keys The message
        adminDashboard.adminMessageBox.sendKeys(ConfigReader.getProperty("qaAdminSendEmailSubscriberMessageBox"));
        //Click the "Send Email" button
        adminDashboard.adminSendEmailButton.click();
        //Verify the message is sent to the all subscriber
        softAssert.assertTrue(contactPage.toastmessage.isDisplayed());
        extentTest.pass("Sending email to the all subscriber");

    }


    @Test
    public void verifyTheEditProfileIsAccessible_37() {

        //Click on the admin profile
        adminDashboard.adminAdmin25Profile.click();
        extentTest.info("The profile is clicked");
        //Verify the Edit profile button is accessible
        String expecteIcerik = "Edit Profile";
        String actualIcerik = "";
        List<String> actuaStringlList = ReusableMethods.listiStringDondur(adminDashboard.adminAdmin25ProfileElement);
        System.out.println(actuaStringlList);
        for (String each : actuaStringlList) {
            if (each.equalsIgnoreCase(expecteIcerik)) {
                System.out.println(actuaStringlList.add(each));
            }
        }

        softAssert.assertEquals(actualIcerik, expecteIcerik + "! Verify the Edit profile button is accessible");
        extentTest.pass("Verify the edit profile is accessible");
        softAssert.assertAll();

    }

    @Test
    public void verifyTheChangePasswordIsAccessible_38() {
        //Go to url as an admin
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));
        //Send keys the name and password
        Admin_Dashboard adminDashboard = new Admin_Dashboard();
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));
        //Click on the Login
        adminDashboard.adminLoginButton.click();
        //Click on the admin profile
        adminDashboard.adminAdmin25Profile.click();
        //Click on the Change Password
        adminDashboard.adminChangePassword.click();
        extentTest.info("Change Password is clicked");
        //Verify the page is Change Profile .
        String expectedIcerik = "Change Password";
        String actualIcerik = adminDashboard.adminChangePassword.getText();
        softAssert.assertEquals(actualIcerik, expectedIcerik + " ! Verify the page is Change Password");
        extentTest.pass("Verify the page is Change Password");
        softAssert.assertAll();


    }

    @AfterClass
    public void tearDown(){
        Driver.getDriver().close();
    }
}




