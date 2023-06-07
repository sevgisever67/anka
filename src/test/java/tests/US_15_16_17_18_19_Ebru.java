package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_15_16_17_18_19_Ebru {
    AboutUsPage aboutUsPage = new AboutUsPage();
    FAQPage faqPage = new FAQPage();
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();

    @BeforeMethod
    public void setUp() {

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }

    @Test
    public void aboutUs_015_TC01() {
        // Cookies clickable
        aboutUsPage.cookies.click();
        //Verify the "About Us" is display and clickable
        Assert.assertTrue(aboutUsPage.aboutUsElemnti.isDisplayed());
        aboutUsPage.aboutUsElemnti.click();
        //Verify the titletext contains "About Us"
        String expectedTitle = "About Us";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        //Verify the sections of "About Us" is display
        Assert.assertTrue(aboutUsPage.OurMissiontitle.isDisplayed());
        Assert.assertTrue(aboutUsPage.OurVision.isDisplayed());
//        Verify the text of "About Us" is display
//        String expectedAboutUsText = "ABOUT US";
//        String actualAboutUsText = aboutUsPage.aboutBunner.getText();
//        Assert.assertEquals(actualAboutUsText, expectedAboutUsText);

    }

    @Test
    public void faqUS_016_TC01() {
        //Verify the "FAQ" is display and clickable
        Assert.assertTrue(faqPage.fqaElementi.isDisplayed());
        faqPage.fqaElementi.click();

        // Cookies clickable
        faqPage.faqCookies.click();

        //Verify the titletext contains "FAQ"
        String expectedTitle = "FAQ";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void conTactUS_17_TC01() {
        //Verify the "CONTACT" is display and clickable
        Assert.assertTrue(contactPage.contactElementi.isDisplayed());
        contactPage.contactElementi.click();

        ////Verify the title text contains "CONTACT"
        String expectedTitle = "Contact Us";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        // Cooikes clickable
        contactPage.contactCookies.click();


        // write  information of  name, Phone, email Address to the related box


        contactPage.visitorNameBox.sendKeys(faker.name().firstName());
        contactPage.visitorPhoneBox.sendKeys(faker.number().digits(12));
        contactPage.visitorEmailAdressBox.sendKeys(faker.internet().emailAddress());
        contactPage.visitorMessageBox.sendKeys(faker.lorem().paragraph());
        contactPage.visitorSubmitButton.submit();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(2);

        Assert.assertTrue(contactPage.toastmessage.isDisplayed());

        // Verify the address is visible
        String expectedAddress = "ADDRESS";
        String actualAddress = contactPage.contactInformationAddress.getText();
        Assert.assertEquals(actualAddress, expectedAddress);

        // Verify the Email Adress is visible
        String expectedContactInformationEmailAdress = "EMAIL ADDRESS";
        String actualContactInformationEmailAdress = contactPage.contactInformationEmailAddress.getText();
        Assert.assertEquals(actualContactInformationEmailAdress, expectedContactInformationEmailAdress);

        // Verify the Phone is visible
        String expectedContactInformationPhone = "PHONE";
        String actualContactInformationPhone = contactPage.contactInformationPhone.getText();

        Assert.assertEquals(actualAddress, expectedAddress);
        System.out.println(actualContactInformationEmailAdress);

    }

    @Test
    public void travellerRegistrationUS_18_TC01() {
        // Verify the  registraion button is clickable
        aboutUsPage.registrationButton.click();


        //Handle the  cookies
        aboutUsPage.registrationCookies.click();


        //Send the Name, Email address and  password
        aboutUsPage.registrationName.sendKeys(faker.name().firstName());
        aboutUsPage.registrationEmailAddress.sendKeys((faker.internet().emailAddress()));
        aboutUsPage.registrationPassword.sendKeys(faker.internet().password());
        aboutUsPage.makeRegistrationButton.submit();

        //Test the registration is succesfull

        Assert.assertTrue(contactPage.toastmessage2.isDisplayed());

    }

    @Test
    public void travellerLoginUS_19_TC01() {

        //  Verify Login butonu clickable
        aboutUsPage.loginButton.click();
        contactPage.contactCookies.click();
        // Send  the Email adrres and password
        aboutUsPage.registrationEmailAddress.sendKeys(ConfigReader.getProperty("visitorRegistrationEmailAddress"));
        aboutUsPage.registrationPassword.sendKeys(ConfigReader.getProperty("visitorRegistrationPassword"));
        aboutUsPage.loginSubmitButton.click();
        // Test login is succesfull
        String expectedTitle = "Traveller Panel";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);



    }


}

