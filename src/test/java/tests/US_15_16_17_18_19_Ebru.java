package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.ContactPage;
import pages.FAQPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_15_16_17_18_19_Ebru {
    AboutUsPage aboutUsPage = new AboutUsPage();
    FAQPage faqPage = new FAQPage();
    ContactPage contactPage = new ContactPage();
    HomePage homePage = new HomePage();

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }

    @Test
    public void aboutUs_015() {
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
    public void faq_016() {
        //Verify the "FAQ" is display and clickable
        Assert.assertTrue(faqPage.fqaElementi.isDisplayed());
        faqPage.fqaElementi.click();
        //Verify the titletext contains "FAQ"
        String expectedTitle = "FAQ";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Test
    public void conTact17() {
        //Verify the "CONTACT" is display and clickable
        Assert.assertTrue(contactPage.contactElementi.isDisplayed());
        contactPage.contactElementi.click();

        ////Verify the titletext contains "CONTACT"
        String expectedTitle = "Contact Us";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        // Cooikes clickable
        contactPage.contactCookies.click();


        // name box, Phone box, email Addrss box information
        contactPage.visitorNameBox.sendKeys(ConfigReader.getProperty("visitorContactInformationName"));
        contactPage.visitorPhoneBox.sendKeys(ConfigReader.getProperty("visitorContactInformationPhone"));
        contactPage.visitorEmailAdressBox.sendKeys(ConfigReader.getProperty("visitorContactInformationEmailAddress"));
        contactPage.visitorMessageBox.sendKeys(ConfigReader.getProperty("visitorContactInformationMessage"));
        contactPage.visitorSubmitButton.submit();
        ReusableMethods.wait(1);
        Assert.assertTrue(contactPage.toastmessage.isDisplayed());

        //address is visible
        String expectedAddress = "ADDRESS";
        String actualAddress = contactPage.contactInformationAddress.getText();
        Assert.assertEquals(actualAddress, expectedAddress);

        // Email Adress is visible
        String expectedContactInformationEmailAdress = "EMAIL ADDRESS";
        String actualContactInformationEmailAdress = contactPage.contactInformationEmailAddress.getText();
        Assert.assertEquals(actualContactInformationEmailAdress, expectedContactInformationEmailAdress);

        // Phone is visible
        String expectedContactInformationPhone = "PHONE";
        String actualContactInformationPhone = contactPage.contactInformationPhone.getText();

        Assert.assertEquals(actualAddress, expectedAddress);
        System.out.println(actualContactInformationEmailAdress);
        // ebruuuuuuuuu

    }
}
