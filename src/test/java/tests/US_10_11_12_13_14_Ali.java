package tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DestinationsPage;
import pages.MainPage;
import pages.PackagePage;
import pages.ServicesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_10_11_12_13_14_Ali extends TestBaseRapor {
    MainPage mainPage;
    DestinationsPage destinationsPage;
    Actions actions;
    PackagePage packagePage;
    String expectedIcerik;
    String actualSonuc;
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1)
    public void verifyTermAndConditions_10_01() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_10_01");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Go to the "Footer" field of the page (the superconduct of the homepage)
        actions.sendKeys(Keys.END).perform();

        //4. Click on the "Term and Conditions" tab
        mainPage.termAndConditionsElementi.click();
        extentTest.info("Term and conditions elements clicked");


        //5. Verify that the site's title text contains "Term and Conditions".
        expectedIcerik = "Terms and Conditions";
        actualSonuc = Driver.getDriver().getTitle();
        Assert.assertTrue(actualSonuc.contains(expectedIcerik));

        extentTest.pass("Verified that Term and conditions elements is visible and working");

        Driver.closeDriver();
    }

    @Test(priority = 2)
    public void verifyPrivacyPolicy_11_01() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_11_01");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Go to the "FOOTER" field of the page(the superconduct of the home page)
        actions.sendKeys(Keys.END).perform();

        //4. Click "Privacy Policy"
        mainPage.privacyPolicyElementi.click();
        extentTest.info("Privacy Policy element clicked");

        //5.Verify that the site's title text contains "Privacy policy
        expectedIcerik = "Privacy Policy";
        actualSonuc = Driver.getDriver().getTitle();
        Assert.assertTrue(actualSonuc.contains(expectedIcerik));

        extentTest.pass("Verified that the privacy policy element is visible and working");

        Driver.closeDriver();

    }

    @Test(priority = 3)
    public void verifyServices_12_01() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_12_01");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "SERVICES" button in the title area
        mainPage.iconServices.click();
        extentTest.info("Services element clicked");

        //4. In the opened page, it should be tested that the title contains "Services" text.
        expectedIcerik = "Services";
        actualSonuc = Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc, expectedIcerik);

        extentTest.pass("Verified that Services element is visible and working ");

        Driver.closeDriver();
    }

    @Test(priority = 4)
    public void verifyInternationalTour_12_02() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_12_02");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "SERVICES" tab in the Header field
        mainPage.iconServices.click();
        extentTest.info("Services element clicked");

        //4. Verify that the "International Tour" image is visible on the page that opens
        softAssert.assertTrue(mainPage.iconInternationalTour.isDisplayed());
        extentTest.info("International Tour element displayed");

        //5. Click on the "International Tour" tab on the page that opens
        mainPage.iconInternationalTour.click();
        extentTest.info("International Tour element clicked");

        //6. Verify that the title text of the page that opens includes the text "International Tour".
        expectedIcerik = "International Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that International element on the Services page is visible and working");

        Driver.closeDriver();

    }

    @Test(priority = 5)
    public void verifyAdventureTour_12_03() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_12_03");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "SERVICES" tab in the Header field
        mainPage.iconServices.click();
        extentTest.info("Services element clicked");

        //4. Verify that the "Adventure Tour" image is visible on the page that opens
        softAssert.assertTrue(mainPage.iconAdventureTour.isDisplayed());
        extentTest.info("Adventure Tour element displayed");

        //5. Click on the "Adventure Tour" tab on the page that opens
        mainPage.iconAdventureTour.click();
        extentTest.info("Adventure tour element clicked");

        //6. Verify that the title text of the site contains the text "Adventure Tour".
        expectedIcerik = "Adventure Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Adventure tour element on the services page is visible and working ");

        Driver.closeDriver();
    }

    @Test(priority = 6)
    public void verifyCultureTour_12_04() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_12_04");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "SERVICES" tab in the Header field
        mainPage.iconServices.click();
        extentTest.info("Services element clicked");
        ReusableMethods.wait(3);

        //4. Verify that the "Culture Tour" image is visible on the page that opens
        softAssert.assertTrue(mainPage.iconCultureTour.isDisplayed());
        extentTest.info("Culture tour element displayed");

        //5. Click on the "Culture Tour" tab on the page that opens
        mainPage.iconCultureTour.click();
        extentTest.info("Adventure tour element clicked");
        //6. Verify that the title text of the site contains the text "Culture Tour".
        expectedIcerik = "Culture Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Culture tour element on the services page is visible and working ");

        Driver.closeDriver();
    }

    @Test(priority = 7)
    public void verifyBussinessTou_12_05() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_12_05");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "SERVICES" tab in the Header field
        mainPage.iconServices.click();
        extentTest.info("Services element clicked");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);

        //4. Verify that the "Business Tour" image is visible on the page that opens
        softAssert.assertTrue(mainPage.iconBussinessTour.isDisplayed());
        extentTest.info("Business tour element displayed");

        //5. Click on the "Business Tour" tab on the page that opens
        mainPage.iconBussinessTour.click();
        extentTest.info("Business tour element clicked");

        //6. Verify that the title text of the site contains the text "Business Tour".
        expectedIcerik = "Bussiness Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Business tour element on the services page is visible and working");

        Driver.closeDriver();
    }

    @Test(priority = 8)
    public void verifyHealthTour_12_06() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_12_06");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "SERVICES" tab in the Header field
        mainPage.iconServices.click();
        extentTest.info("Services element clicked");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);

        //4. Verify that the "Healt Tour" image is visible on the page that opens
        softAssert.assertTrue(mainPage.iconHealthTour.isDisplayed(), "1");
        extentTest.info("Health tour element displayed");

        //5. Click on the "Healt Tour" tab on the page that opens
        mainPage.iconHealthTour.click();
        extentTest.info("Health tour element clicked");

        //6. Verify that the title text of the site contains the text "Healt Tour".
        expectedIcerik = "Health Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik, "2");

        softAssert.assertAll();
        extentTest.pass("Verified that Health tour element on the services page is visible and working");

        Driver.closeDriver();
    }


    @Test(priority = 9)
    public void verifyReligiousTour_12_07() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_12_07");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "SERVICES" tab in the Header field
        mainPage.iconServices.click();
        extentTest.info("Services button clicked");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Verify that the "Religious Tour" image is visible on the page that opens
        softAssert.assertTrue(mainPage.iconReligiousTour.isDisplayed());
        extentTest.info("Religious tour element displayed");

        //5. Click on the "Religious Tour" tab on the page that opens
        mainPage.iconReligiousTour.click();
        extentTest.info("Religious tour element clicked");

        //6. Verify that the title text of the site contains the text "Religious Tour".
        expectedIcerik = "Religious Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Religious tour element on the services page is visible and working");

        Driver.closeDriver();
    }

    @Test(priority = 10)
    public void verifyDestinations_13_01() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_13_01");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "DESTINATIONS" button in the Header field
        mainPage.iconDestinations.click();
        extentTest.info("Destinations button clicked");

        //4. On the page that opens, it should be tested that the title contains "DESTINATIONS" text.
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc, expectedIcerik);

        extentTest.pass("Verified that Services element is visible and working");

        Driver.closeDriver();
    }

    @Test(priority = 11)
    public void verifyBangkokThailand_13_02() {
        mainPage = new MainPage();
        destinationsPage = new DestinationsPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        extentTest = extentReports.createTest("US_13_02");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "DESTINATIONS" button in the Header field
        mainPage.destinationElementi.click();
        extentTest.info("Destinations element clicked");

        //4. Verify that the image "Bangkok, Thailand" is displayed in the Destinations area
        ReusableMethods.wait(3);
        expectedIcerik = "Bangkok, Thailand";
        actualSonuc = destinationsPage.visitorBangkokThailandElementi.getText();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the image Bangkok, Thailand is displayed in the Destinations area");

        //5. Hover over the "Bangkok, Thailand" image and click the "Magnifying Glass" icon
        actions.moveToElement(destinationsPage.visitorBangkokThailandBuyutecElementi).perform();
        destinationsPage.visitorBangkokThailandBuyutecElementi.click();
        extentTest.info("Enlarged image of Bangkok, Thailand confirmed");

        //6. Click the right and left arrow keys
        destinationsPage.visitorBangkokThailandSagOkElementi.click();
        destinationsPage.visitorBangkokThailandSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        destinationsPage.visitorBangkokThailandSagOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        destinationsPage.visitorBangkokThailandKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "DESTINATIONS" page is returned
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "Greenville, South Carolina" image and verify it is active
        destinationsPage.visitorBangkokThailandElementi.click();
        expectedIcerik = "Bangkok, Thailand";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Bangkok, Thailand element on the Destinations page is visible and working");
        Driver.closeDriver();
    }

    @Test(priority = 12)
    public void verifyGreenvilleSouthCarolina_13_03() {
        mainPage = new MainPage();
        destinationsPage = new DestinationsPage();
        actions = new Actions(Driver.getDriver());

        //1. Chrome tarayıcısını açınız
        //2. URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        extentTest = extentReports.createTest("US_13_03");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "DESTINATIONS" button in the Header field
        mainPage.destinationElementi.click();
        extentTest.info("Destinations element clicked");

        //4. Verify that the "Greenville, South Carolina" image is displayed in the Destinations area
        ReusableMethods.wait(3);
        expectedIcerik = "Greenville, South Carolina";
        actualSonuc = destinationsPage.visitorGreenvilleSouthCarolinaElementi.getText();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Greenville, South Carolina image clicked");

        //5. Hover over the "Greenville, South Carolina" image and click the "Magnifying Glass" icon
        actions.moveToElement(destinationsPage.visitorGreenvilleSouthCarolinaElementi).perform();
        destinationsPage.visitorGreenvilleSouthCarolinaBuyutecElementi.click();
        extentTest.info("Enlarged image of Greenville, South Carolina confirmed.");

        //6. Click the right and left arrow keys
        destinationsPage.visitorGreenvilleSouthCarolinaSagOkElementi.click();
        destinationsPage.visitorGreenvilleSouthCarolinaSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        destinationsPage.visitorGreenvilleSouthCarolinaSagOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        destinationsPage.visitorGreenvilleSouthCarolinaKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "DESTINATIONS" page is returned
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "Greenville, South Carolina" image and verify it is active
        destinationsPage.visitorGreenvilleSouthCarolinaElementi.click();
        expectedIcerik = "Greenville, South Carolina";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Greenville, South Carolina element on the Destinations page is visible and working");

        Driver.closeDriver();
    }

    @Test(priority = 13)
    public void verifyBuenosAiresArgentina_13_04() {
        mainPage = new MainPage();
        destinationsPage = new DestinationsPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_13_04");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "DESTINATIONS" button in the Header field
        mainPage.destinationElementi.click();
        extentTest.info("Destinations element clicked");

        //4. Verify that the "Buenos Aires, Argentina" rem is displayed in the Destinations area
        ReusableMethods.wait(3);
        expectedIcerik = "Buenos Aires, Argentina";
        actualSonuc = destinationsPage.visitorBuenosAiresArgentinaElementi.getText();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Buenos Aires, Argentina image clicked");

        //5. Hover over the "Buenos Aires, Argentina" image and click the "Magnifying Glass" icon
        actions.moveToElement(destinationsPage.visitorBuenosAiresArgentinaBuyutecElementi).perform();
        destinationsPage.visitorBuenosAiresArgentinaBuyutecElementi.click();
        extentTest.info("Enlarged image of Buenos Aires, Argentina confirmed");

        //6. Click the right and left arrow keys
        destinationsPage.visitorBuenosAiresArgentinaSagOkElementi.click();
        destinationsPage.visitorBuenosAiresArgentinaSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        destinationsPage.visitorBuenosAiresArgentinaSolOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        destinationsPage.visitorBuenosAiresArgentinaKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "DESTINATIONS" page is returned
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "Buenos Aires, Argentina" image and verify it is active
        destinationsPage.visitorBuenosAiresArgentinaElementi.click();
        expectedIcerik = "Buenos Aires, Argentina";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Buenos Aires, Argentina element on the Destinations page is visible and working");

        Driver.closeDriver();
    }

    @Test(priority = 14)
    public void verifyMarrakeshMorocco_13_05() {
        mainPage = new MainPage();
        destinationsPage = new DestinationsPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_13_05");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "DESTINATIONS" button in the Header field
        mainPage.destinationElementi.click();
        extentTest.info("Destinations element clicked");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Verify that the "Marrakesh, Morocco" image is displayed in the Destinations area
        ReusableMethods.wait(3);
        expectedIcerik = "Marrakesh, Morocco";
        actualSonuc = destinationsPage.visitorMarrakeshMoroccoElementi.getText();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the image Marrakech, Morocco is displayed in the Destinations area");

        //5. Hover over the "Marrakesh, Morocco" image and click on the "Magnifying Glass" icon
        actions.moveToElement(destinationsPage.visitorMarrakeshMoroccoBuyutecElementi).perform();
        destinationsPage.visitorMarrakeshMoroccoBuyutecElementi.click();
        extentTest.info("Enlarged image of Marrakesh, Morocco confirmed");

        //6. Click the right and left arrow keys
        destinationsPage.visitorMarrakeshMoroccoSagOkElementi.click();
        destinationsPage.visitorMarrakeshMoroccoSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        destinationsPage.visitorMarrakeshMoroccoSolOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        destinationsPage.visitorMarrakeshMoroccoKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "DESTINATIONS" page is returned
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "Marrakesh, Morocco" image and verify it is active
        destinationsPage.visitorMarrakeshMoroccoElementi.click();
        expectedIcerik = "Marrakesh, Morocco";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Marrakesh, Morocco element on the Destinations page is visible and working");

        Driver.closeDriver();
    }

    @Test(priority = 15)
    public void verifySalinaIslandItaly_13_06() {
        mainPage = new MainPage();
        destinationsPage = new DestinationsPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_13_06");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "DESTINATIONS" button in the Header field
        mainPage.destinationElementi.click();
        extentTest.info("Destinations element clicked");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Verify that the "Salina Island, Italy" image is displayed in the Destinations area
        ReusableMethods.wait(3);
        expectedIcerik = "Salina Island, Italy";
        actualSonuc = destinationsPage.visitorSalinaIslandItalyElementi.getText();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the image Salina Island, Italy is displayed in the Destinations area");


        //5. Hover over the "Salina Island, Italy" image and click the "Magnifying Glass" icon
        actions.moveToElement(destinationsPage.visitorSalinaIslandItalyBuyutecElementi).perform();
        destinationsPage.visitorSalinaIslandItalyBuyutecElementi.click();
        extentTest.info("Enlarged image of Salina Island, Italy confirmed");

        //6. Click the right and left arrow keys
        destinationsPage.visitorSalinaIslandItalySagOkElementi.click();
        destinationsPage.visitorSalinaIslandItalySolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        destinationsPage.visitorSalinaIslandItalySagOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        destinationsPage.visitorSalinaIslandItalyKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "DESTINATIONS" page is returned
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "Salina Island, Italy" image and verify it is active
        destinationsPage.visitorSalinaIslandItalyElementi.click();
        expectedIcerik = "Salina Island, Italy";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Salina Island, Italy on the Destinations page is visible and working");

        Driver.closeDriver();
    }

    @Test(priority = 16)
    public void verifyIstanbulTurkey_13_07() {
        mainPage = new MainPage();
        destinationsPage = new DestinationsPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_13_07");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "DESTINATIONS" button in the Header field
        mainPage.destinationElementi.click();
        extentTest.info("Destinations element clicked");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Verify that the image "Istanbul, Turkey" is displayed in the Destinations area
        ReusableMethods.wait(3);
        expectedIcerik = "Istanbul, Turkey";
        actualSonuc = destinationsPage.visitorIstanbulTurkeyElementi.getText();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the image Istanbul, Turkey is displayed in the Destinations area");

        //5. Hover over the "Istanbul, Turkey" image and click the "magnifying glass" icon
        actions.moveToElement(destinationsPage.visitorIstanbulTurkeyBuyutecElementi).perform();
        destinationsPage.visitorIstanbulTurkeyBuyutecElementi.click();
        extentTest.info("Enlarged image of Istanbul, Turkey confirmed");

        //6. Click the right and left arrow keys
        destinationsPage.visitorIstanbulTurkeySagOkElementi.click();
        destinationsPage.visitorIstanbulTurkeySolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        destinationsPage.visitorIstanbulTurkeySolOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        destinationsPage.visitorIstanbulTurkeyKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "DESTINATIONS" page is returned
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "Istanbul, Turkey" image and verify that it is active
        destinationsPage.visitorIstanbulTurkeyElementi.click();
        expectedIcerik = "Istanbul, Turkey";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that Istanbul, Turkey on the Destinations page is visible and working");

        Driver.closeDriver();
    }

    @Test(priority = 17)
    public void verifyCaliforniaUsa_13_08() {
        mainPage = new MainPage();
        destinationsPage = new DestinationsPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_13_08");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "DESTINATIONS" button in the Header field
        mainPage.destinationElementi.click();
        extentTest.info("Destinations element clicked");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);

        //4. Verify that the image "California, USA" is displayed in the Destinations area
        expectedIcerik = "California, USA";
        actualSonuc = destinationsPage.visitorCaliforniaUsaElementi.getText();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the image California, USA is displayed in the Destinations area");

        //5. Hover over the "California, USA" image and click the "Magnifying Glass" icon
        actions.moveToElement(destinationsPage.visitorCaliforniaUsaBuyutecElementi).perform();
        destinationsPage.visitorCaliforniaUsaBuyutecElementi.click();
        extentTest.info("Enlarged image of California, USA confirmed");

        //6. Click the right and left arrow keys
        destinationsPage.visitorCaliforniaUsaSagOkElementi.click();
        destinationsPage.visitorCaliforniaUsaSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        destinationsPage.visitorCaliforniaUsaSolOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        destinationsPage.visitorCaliforniaUsaKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "DESTINATIONS" page is returned
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "California, USA" image and verify it is active
        destinationsPage.visitorCaliforniaUsaElementi.click();
        expectedIcerik = "california-usa";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that the image California, USA is displayed in the Destinations area");

        Driver.closeDriver();
    }

    @Test(priority = 18)
    public void verifyPackages_14_01() {
        mainPage = new MainPage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_14_01");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "PACKAGES" button in the Header field
        mainPage.packageElementi.click();
        extentTest.info("Packages element clicked");

        //4. On the page that opens, it should be tested that the title contains "PACKAGES" text
        expectedIcerik = "Packages";
        actualSonuc = Driver.getDriver().getTitle();

        Assert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.pass("It has been verified that the title on the page that opens contains the text PACKAGES");

        Driver.closeDriver();
    }

    @Test(priority = 19)
    public void verify3daysinBuenosAires_14_02() {
        mainPage = new MainPage();
        packagePage = new PackagePage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_14_02");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "PACKAGES" button in the Header field
        mainPage.packageElementi.click();
        extentTest.info("Packages element clicked");

        //4. Verify that the "3 days in Buenos Aires" image is visible on the page that opens
        softAssert.assertTrue(packagePage.visitor3daysinBuenosAiresElementi.isDisplayed());
        extentTest.info("Verified that the image 3 days in Buenos Aires is displayed in the Destinations area");

        //5. Hover over the "3 days in Buenos Aires" image and click the "Magnifying Glass" icon
        actions.moveToElement(packagePage.visitor3daysinBuenosAiresBuyutecElementi).perform();
        packagePage.visitor3daysinBuenosAiresBuyutecElementi.click();
        extentTest.info("Enlarged image of 3 days in Buenos Aires confirmed");

        //6. Click the right and left arrow keys
        packagePage.visitorSagOkElementi.click();
        packagePage.visitorSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        packagePage.visitorSolOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        packagePage.visitorKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "PACKAGES" page is returned
        expectedIcerik = "Packages";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "3 days in Buenos Aires" image and verify it is active
        packagePage.visitor3daysinBuenosAiresElementi.click();
        expectedIcerik = "3 days in Buenos Aires";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that the image 3 days in Buenos Aires is displayed in the Destinations area");

        Driver.closeDriver();
    }

    @Test(priority = 20)
    public void verify10daysinBuenosAires_14_03() {
        mainPage = new MainPage();
        packagePage = new PackagePage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_14_03");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "PACKAGES" button in the Header field
        mainPage.packageElementi.click();
        extentTest.info("Packages element clicked");

        //4. Açılan sayfada  "10 days in Buenos Aires" resminin görünür olduğunu doğrulayınız
        softAssert.assertTrue(packagePage.visitor10daysinBuenosAiresElementi.isDisplayed());
        extentTest.info("Verified that the image 10 days in Buenos Aires is displayed in the Destinations area");

        //5. "10 days in Buenos Aires" resminin üzerine geliniz ve "Büyüteç" ikonuna tıklayınız
        actions.moveToElement(packagePage.visitor10daysinBuenosAiresBuyutecElementi).perform();
        packagePage.visitor10daysinBuenosAiresBuyutecElementi.click();
        extentTest.info("Enlarged image of 10 days in Buenos Aires confirmed");

        //6. Click the right and left arrow keys
        packagePage.visitorSagOkElementi.click();
        packagePage.visitorSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        packagePage.visitorSagOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        packagePage.visitorKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. "PACKAGES" sayfasına dönüldüğünü doğrulayınız
        expectedIcerik = "Packages";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10.  "10 days in Buenos Aires"  resmine tıklayınız ve aktif olduğu doğrulayınız
        packagePage.visitor10daysinBuenosAiresElementi.click();
        expectedIcerik = "10 days in Buenos Aires";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that the image 10 days in Buenos Aires is displayed in the Destinations area");

        Driver.closeDriver();
    }

    @Test(priority = 21)
    public void verify7daysinIstanbul_14_04() {
        mainPage = new MainPage();
        packagePage = new PackagePage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_14_04");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "PACKAGES" button in the Header field
        mainPage.packageElementi.click();
        extentTest.info("Packages element clicked");

        //4. Verify that the "7 days in Istanbul" image is visible on the page that opens
        softAssert.assertTrue(packagePage.visitor7daysinIstanbulElementi.isDisplayed());
        extentTest.info("Verified that the image 7 days in Istanbul is displayed in the Destinations area");

        //5. Hover over the "7 days in Istanbul" image and click the "magnifying glass" icon
        actions.moveToElement(packagePage.visitor7daysinIstanbulBuyutecElementi).perform();
        packagePage.visitor7daysinIstanbulBuyutecElementi.click();
        extentTest.info("Enlarged image of 7 days in Istanbul confirmed");

        //6. Click the right and left arrow keys
        packagePage.visitorSagOkElementi.click();
        packagePage.visitorSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        packagePage.visitorSagOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        packagePage.visitorKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "PACKAGES" page is returned
        expectedIcerik = "Packages";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "7 days in Istanbul" image and verify it is active
        packagePage.visitor7daysinIstanbulElementi.click();
        expectedIcerik = "7 days in Istanbul";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that the image 7 days in Istanbul is displayed in the Destinations area");

        Driver.closeDriver();
    }

    @Test(priority = 22)
    public void verify3daysinBangkok_14_05() {
        mainPage = new MainPage();
        packagePage = new PackagePage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_14_05");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(2);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "PACKAGES" button in the Header field
        mainPage.packageElementi.click();
        extentTest.info("Packages element clicked");

        //4. Verify that the "3 days in Bangkok" image is visible on the page that opens
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        softAssert.assertTrue(packagePage.visitor3daysinBangkokElementi.isDisplayed());
        extentTest.info("Verified that the image 3 days in Bangkok is displayed in the Destinations area");

        //5. Hover over the "3 days in Bangkok" image and click the "magnifying glass" icon
        actions.moveToElement(packagePage.visitor3daysinBangkokBuyutecElementi).perform();
        packagePage.visitor3daysinBangkokBuyutecElementi.click();
        extentTest.info("Enlarged image of 3 days in Bangkok confirmed");

        //6. Click the right and left arrow keys
        packagePage.visitorSagOkElementi.click();
        packagePage.visitorSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        packagePage.visitorSagOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        packagePage.visitorKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "PACKAGES" page is returned
        expectedIcerik = "Packages";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "3 days in Bangkok" image and verify it is active
        packagePage.visitor3daysinBangkokElementi.click();
        expectedIcerik = "3 days in Bangkok";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that the image 7 days in Istanbul is displayed in the Destinations area");

        Driver.closeDriver();
    }

    @Test(priority = 23)
    public void verify7daysinSalinaIsland_14_06() {
        mainPage = new MainPage();
        packagePage = new PackagePage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_14_06");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(2);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "PACKAGES" button in the Header field
        mainPage.packageElementi.click();
        extentTest.info("Packages element clicked");

        //4. Verify that the "7 days in Salina Island" image is visible on the page that opens
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        softAssert.assertTrue(packagePage.visitor7daysinSalinaIslandElementi.isDisplayed());
        extentTest.info("Verified that the image 7 days in Salina Island is displayed in the Destinations area");

        //5. Hover over the "7 days in Salina Island" image and click the "Magnifying Glass" icon
        actions.moveToElement(packagePage.visitor7daysinSalinaIslandBuyutecElementi).perform();
        packagePage.visitor7daysinSalinaIslandBuyutecElementi.click();
        extentTest.info("Enlarged image of 7 days in Salina Island confirmed");

        //6. Click the right and left arrow keys
        packagePage.visitorSagOkElementi.click();
        packagePage.visitorSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        packagePage.visitorSagOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        packagePage.visitorKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "PACKAGES" page is returned
        expectedIcerik = "Packages";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "7 days in Salina Island" image and verify it is active
        packagePage.visitor7daysinSalinaIslandElementi.click();
        expectedIcerik = "7 days in Salina Island";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that the image 7 days in Salina Island is displayed in the Destinations area");

        Driver.closeDriver();
    }

    @Test(priority = 24)
    public void verify5dayCalifornia_14_07() {
        mainPage = new MainPage();
        packagePage = new PackagePage();
        actions = new Actions(Driver.getDriver());

        //1. Open the Chrome browser
        //2. Type https://qa.tripandway.com in the URL field and press enter
        extentTest = extentReports.createTest("US_14_07");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(2);
        mainPage.acceptButonu.click();
        extentTest.info("Accept button clicked");

        //3. Click the "PACKAGES" button in the Header field
        mainPage.packageElementi.click();
        extentTest.info("Packages element clicked");

        //4. Verify that the "5 day California" image is visible on the page that opens
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        softAssert.assertTrue(packagePage.visitor5dayCaliforniaElementi.isDisplayed());
        extentTest.info("Verified that the image 5 Day California is displayed in the Destinations area");

        //5. Hover over the "5 day California" image and click the "magnifying glass" icon
        actions.moveToElement(packagePage.visitor5dayCaliforniaBuyutecElementi).perform();
        packagePage.visitor5dayCaliforniaBuyutecElementi.click();
        extentTest.info("Enlarged image of5 Day California confirmed");

        //6. Click the right and left arrow keys
        packagePage.visitorSagOkElementi.click();
        packagePage.visitorSolOkElementi.click();
        extentTest.info("Clicked the right and left arrow keys");

        //7. Verify that the images have changed.
        packagePage.visitorSagOkElementi.isEnabled();
        extentTest.info("Verified that the images have changed");

        //8. Click on the "X" icon in the upper right corner of the picture
        packagePage.visitorKapatmaElementi.click();
        extentTest.info("Clicked on the X icon in the upper right corner of the picture");

        //9. Verify that the "PACKAGES" page is returned
        expectedIcerik = "Packages";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);
        extentTest.info("Verified that the DESTINATIONS page is returned");

        //10. Click on the "5 day California" image and verify it is active
        packagePage.visitor5dayCaliforniaElementi.click();
        expectedIcerik = "5 Day California";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();
        extentTest.pass("Verified that the image 5 Day California is displayed in the Destinations area");

        Driver.closeDriver();
    }
}