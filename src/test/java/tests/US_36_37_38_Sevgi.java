package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class US_36_37_38_Sevgi extends TestBaseRapor {

    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @BeforeMethod
    public void setUp() {
         extentTest= extentReports.createTest("US36_37_38");


        //Go to url as an admin
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));
        //Send keys the name and password
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));
        //Click on the Login
        adminDashboard.adminLoginButton.click();
        // extentTest.info("Log in as an admin");

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
        extentTest.pass("Sending email to the all subscriber");

    }

    @Test
    public void verifyTheEditProfileIsAccessible_37() {

        //Click on the admin profile
        adminDashboard.adminAdmin25Profile.click();
        //Verify the Edit profile button is accessible
        String expecteIcerik = "Edit Profile";
        String actualIcerik = "";
        List<String> actuaStringlList = ReusableMethods.listiStringDondur(adminDashboard.adminAdmin25ProfileElement);
        System.out.println(actuaStringlList);
        for (String each : actuaStringlList) {
            if (each.equalsIgnoreCase(expecteIcerik)) {
                actuaStringlList.add(expecteIcerik);
            }
        }

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualIcerik , expecteIcerik);
        softAssert.assertAll();
        extentTest.pass("Verify the edit profile is accessible");

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


    }

}



