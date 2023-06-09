package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainPage;
import pages.PackagePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import javax.swing.*;

public class US_20_21_22_Emrah extends TestBaseRapor {


    PackagePage packagePage;

    Faker faker;

    @BeforeMethod
    public void setUp() {

        //Go to URL
        packagePage = new PackagePage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

    }

    @Test
    public void t20_profileEdit() throws InterruptedException {

        packagePage = new PackagePage();
        faker = new Faker();

        extentTest=extentReports.createTest("Profile Edit Test (US-20)");

        // Click to "Login" link.
        packagePage.loginButton.click();

        // Write registered e-mail address and password to related fields.
        packagePage.userEmailAddrsess.sendKeys("emrah@tripandway.com");
        packagePage.userPasswordButton.sendKeys("c.654321");

        // Click to "Login" button.
        packagePage.userLogin2.click();
        extentTest.info("The user performs login operations.");

        // Click to "Update Profile" link.
        packagePage.profileUpdate.click();
        extentTest.info("The user clicks on the 'Update Profile' link to update their profile.");

        // Write new informations to some fields.
        packagePage.profileName.clear();
        packagePage.profileName.sendKeys(faker.name().fullName());
        packagePage.profilePhone.clear();
        packagePage.profilePhone.sendKeys(faker.phoneNumber().cellPhone());
        packagePage.profileCountry.clear();
        packagePage.profileCountry.sendKeys(faker.address().country());
        packagePage.profileAddress.clear();
        packagePage.profileAddress.sendKeys(faker.address().fullAddress());
        packagePage.profileCity.clear();
        packagePage.profileCity.sendKeys(faker.address().city());
        extentTest.info("The user enters the information they want to update in the relevant fields.");

        ReusableMethods.waitFor(2);

        // Click to "Update" button.
        packagePage.updateButton.click();
        extentTest.info("The user clicks the 'Update' button.");

        // TEST
        Assert.assertTrue(packagePage.updateSuccessMessage.isDisplayed());

        extentTest.pass("Verified that the profile has been successfully updated.");

        Driver.closeDriver();
    }

    @Test
    public void t21_viewPaymentHistory(){

        packagePage = new PackagePage();

        extentTest=extentReports.createTest("Payment History View Test (US-21)");

        // Click to "Login" link.
        packagePage.loginButton.click();

        // Write registered e-mail address and password to related fields.
        packagePage.userEmailAddrsess.sendKeys("emrah@tripandway.com");
        packagePage.userPasswordButton.sendKeys("c.654321");

        // Click to "Login" button.
        packagePage.userLogin2.click();
        extentTest.info("The user performs login operations.");

        // Click to "Payment History" link.
        packagePage.userPaymentHistoryButon.click();
        extentTest.info("The user clicks on the 'Payment History' link to view the purchase history.");

        // TEST
        Assert.assertTrue(packagePage.orderYazisi.isDisplayed());
        extentTest.pass("Verified that the payment history has been displayed successfully.");

        Driver.closeDriver();
    }

    @Test
    public void t22_1_passwordChange () {

        packagePage = new PackagePage();

        extentTest=extentReports.createTest("Password Change Test (US-22)");

        // Click to "Login" link.
        packagePage.loginButton.click();

        // Write registered e-mail address and password to related fields.
        packagePage.userEmailAddrsess.sendKeys("emrah@tripandway.com");
        packagePage.userPasswordButton.sendKeys("c.654321");

        // Click to "Login" button.
        packagePage.userLogin2.click();
        extentTest.info("The user performs login operations.");

        // Click to "Update Password" link.
        packagePage.updatePassword.click();
        extentTest.info("The user clicks on the 'Update Password' link to change his password.");

        // Write the new password to related field.
        packagePage.newPassword.sendKeys("c.654321");

        extentTest.info("The user enters the new password they have determined in the relevant field.");

        // Click to "Update" button.
        packagePage.updatePasswordButton.click();
        extentTest.info("The user clicks the 'Update' button.");

        // TEST
        Assert.assertTrue(packagePage.updateSuccessMessage.isDisplayed());
        extentTest.pass("Verified that the password has been successfully changed.");

        Driver.closeDriver();
    }

    @Test
    public void t22_2_forgetPassword () {

        packagePage = new PackagePage();

        extentTest=extentReports.createTest("Password Reset Test (US-22)");

        // Click to "Login" link.
        packagePage.loginButton.click();

        // Click to "Forget Password" link.
        packagePage.forgetPassword.click();
        extentTest.info("The user who forgot his password clicks on the 'Forget Password' link to get a new password.");

        // Write registered e-mail address to related field.
        packagePage.forgetEmailField.sendKeys("emrah@tripandway.com");
        extentTest.info("The user enters the registered e-mail address in the relevant field.");

        // Click to "Submit" button.
        packagePage.forgetSubmitButton.click();
        extentTest.info("The user clicks the 'Submit' button.");

        ReusableMethods.waitFor(2);

        // TEST
        Assert.assertTrue(packagePage.checkEmailMessage.isDisplayed());
        extentTest.pass("Confirmed that the email was sent successfully to receive the new password.");

        Driver.closeDriver();
    }

}
