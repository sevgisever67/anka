package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.ContactPage;
import pages.FAQPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_15_16_17_18_19_Ebru {

    AboutUsPage aboutUsPage = new AboutUsPage();
    FAQPage faqPage = new FAQPage();
    ContactPage contactPage = new ContactPage();

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }


    @Test
    public void aboutUs_015() {
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
        //Verify the text of "About Us" is display
        String expectedAboutUsText = "ABOUT US";
        String actualAboutUsText = aboutUsPage.aboutBunner.getText();
        Assert.assertEquals(actualAboutUsText, expectedAboutUsText);

    }



    @Test
    public void denem(){
        int sayi=5;
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}
