package tests;

import com.github.javafaker.Faker;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_15_16_17_18_19_Ebru extends TestBaseRapor {
    AboutUsPage aboutUsPage;
    FAQPage faqPage;
    ContactPage contactPage;
    Faker faker;

    @BeforeMethod
    public void setUp() {

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        faker=new Faker();
        extentTest = extentReports.createTest("US_015_016_017_018_019");
    }


    @Test(priority =1)
    public void aboutUS_015_TC01() {
        aboutUsPage = new AboutUsPage();
        //Verify the "About Us" is display and clickable
        Assert.assertTrue(aboutUsPage.aboutUsElemnti.isDisplayed());
        extentTest.info("ABOUT US button appear");
        aboutUsPage.aboutUsElemnti.click();

        //Handle the  cookies
        aboutUsPage.cookies.click();

        //Verify the titletext contains "About Us"
        String expectedTitle = "About Us";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("ABOUT US page appear");

        //Verify the sections of "About Us" is display
        Assert.assertTrue(aboutUsPage.OurMissiontitle.isDisplayed());
        Assert.assertTrue(aboutUsPage.OurVision.isDisplayed());
        extentTest.pass("Items on the About Us page appear");

//       Verify the text of "About Us" is display
        String expectedAboutUsText = "ABOUT US";
        String actualAboutUsText = aboutUsPage.aboutBunner.getText();
        Assert.assertEquals(actualAboutUsText, expectedAboutUsText);
        extentTest.pass("ABOUT US sayfası test edildi");

        ;

    }

    @Test(priority = 2)
    public void faqUS_016_TC02() {
        faqPage = new FAQPage();
        //Verify the "FAQ" is display and clickable
        Assert.assertTrue(faqPage.fqaElementi.isDisplayed());
        extentTest.info("FAQ button appear");
        faqPage.fqaElementi.click();

        //Handle the  cookies
        //  faqPage.faqCookies.click();

        //Verify the titletext contains "FAQ"
        String expectedTitle = "FAQ";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("FAQ page appear");


    }

    @Test(priority = 3)
    public void conTactUS_17_TC03() {
        contactPage = new ContactPage();

        //Verify the "CONTACT" is display and clickable
        Assert.assertTrue(contactPage.contactElementi.isDisplayed());
        extentTest.info("CONTACT button appear");
        contactPage.contactElementi.click();

        // Cooikes clickable
        contactPage.contactCookies.click();

        ////Verify the title text contains "CONTACT"
        String expectedTitle = "Contact Us";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("CONTACT page appear");


        // write  information of  name, Phone, email Address to the related box


        contactPage.visitorNameBox.sendKeys(faker.name().firstName());
        contactPage.visitorPhoneBox.sendKeys(faker.number().digits(12));
        contactPage.visitorEmailAdressBox.sendKeys(faker.internet().emailAddress());
        contactPage.visitorMessageBox.sendKeys(faker.lorem().paragraph());
        contactPage.visitorSubmitButton.submit();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(2);
        extentTest.info("The visitor enters the information in the Contact Form");

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
        extentTest.pass("The visitor appear to have sent his message successfully");


    }

    @Test(priority = 4)
    public void travellerRegistrationUS_18_TC04() {
        aboutUsPage = new AboutUsPage();
        contactPage = new ContactPage();
        // Verify the  registraion button is clickable
        aboutUsPage.registrationButton.click();


        //Handle the  cookies
        aboutUsPage.registrationCookies.click();

        //Send the Name, Email address and  password
        aboutUsPage.registrationName.sendKeys(faker.name().firstName());
        aboutUsPage.registrationEmailAddress.sendKeys((faker.internet().emailAddress()));
        aboutUsPage.registrationPassword.sendKeys(faker.internet().password());
        aboutUsPage.makeRegistrationButton.submit();
        extentTest.info("The visitor enters valid registration information in the registration form in Registration.");

        //Test the registration is succesfull

        Assert.assertTrue(contactPage.toastmessage2.isDisplayed());
        extentTest.pass("It is seen that the visitor has successfully registered on the site");

    }

    @Test(priority = 5)
    public void travellerLoginUS_19_TC05() {
        aboutUsPage = new AboutUsPage();
        contactPage = new ContactPage();
        //  Verify Login butonu clickable
        aboutUsPage.loginButton.click();
         contactPage.contactCookies.click();
        // Send  the Email addres and password
        aboutUsPage.registrationEmailAddress.sendKeys(ConfigReader.getProperty("userUsername"));
        aboutUsPage.registrationPassword.sendKeys(ConfigReader.getProperty("userPassword"));
        extentTest.info("User enters registration information in the system");
        aboutUsPage.loginSubmitButton.click();

        // Test login is succesfull
        String expectedTitle = "Traveller Panel";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("It appear that the user has been successfully registered");

    }


}

