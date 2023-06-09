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

        //Go to url
        packagePage = new PackagePage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        extentTest=extentReports.createTest("TEST AÇIKLAMASI");
    }

    @Test
    public void test20_profileEdit() throws InterruptedException {

        packagePage = new PackagePage();
        faker = new Faker();


        // Click to "Login" link.
        packagePage.loginButton.click();
        extentTest.info("AÇIKLAMA");

        // Write registered e-mail address and password to related fields.
        packagePage.userEmailAddrsess.sendKeys("emrah@tripandway.com");
        packagePage.userPasswordButton.sendKeys("c.654321");

        // Click to "Login" button.
        packagePage.userLogin2.click();

        // Click to "Update Profile" link.
        packagePage.profileUpdate.click();
        extentTest.info("profili");

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

        ReusableMethods.waitFor(2);

        // Click to "Update" button.
        packagePage.updateButton.click();

        // TEST
        Assert.assertTrue(packagePage.updateSuccessMessage.isDisplayed());

        extentTest.pass("profil güncellendi");

        Driver.closeDriver();
    }

    @Test
    public void test21_viewPaymentHistory(){

        packagePage = new PackagePage();



        // Click to "Login" link.
        packagePage.loginButton.click();

        // Write registered e-mail address and password to related fields.
        packagePage.userEmailAddrsess.sendKeys("emrah@tripandway.com");
        packagePage.userPasswordButton.sendKeys("c.654321");

        // Click to "Login" button.
        packagePage.userLogin2.click();

        // Click to "Payment History" link.
        packagePage.userPaymentHistoryButon.click();

        // TEST
        Assert.assertTrue(packagePage.orderYazisi.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void test22_passwordChange () {

        packagePage = new PackagePage();

        // Click to "Login" link.
        packagePage.loginButton.click();

        // Write registered e-mail address and password to related fields.
        packagePage.userEmailAddrsess.sendKeys("emrah@tripandway.com");
        packagePage.userPasswordButton.sendKeys("c.654321");

        // Click to "Login" button.
        packagePage.userLogin2.click();

        // Click to "Update Password" link.
        packagePage.updatePassword.click();

        // Write the new password to related field. ***********
        packagePage.newPassword.sendKeys("c.654321");

        // Click to "Update" button.
        packagePage.updatePasswordButton.click();

        // TEST
        Assert.assertTrue(packagePage.updateSuccessMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test

    public void test222_forgetPassword () {

        packagePage = new PackagePage();


        // Click to "Login" link.
        packagePage.loginButton.click();

        // Click to "Forget Password" link.
        packagePage.forgetPassword.click();

        // Write registered e-mail address to related field.
        packagePage.forgetEmailField.sendKeys("emrah@tripandway.com");

        // Click to "Submit" button.
        packagePage.forgetSubmitButton.click();

        ReusableMethods.waitFor(2);

        // TEST
        Assert.assertTrue(packagePage.checkEmailMessage.isDisplayed());

        Driver.closeDriver();
    }

}
