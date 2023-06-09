package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DestinationsPage;
import pages.MainPage;
import pages.ServicesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_10_11_12_13_14_Ali extends TestBaseRapor {
    MainPage mainPage = new MainPage();
    DestinationsPage destinationsPage = new DestinationsPage();
    Actions actions = new Actions(Driver.getDriver());
    ServicesPage servicesPage = new ServicesPage();
    String expectedIcerik;
    String actualSonuc;
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void verifyTermAndConditions_10_01() {

        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com in the URL field and press Enter
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();


        //3. Go to the "Footer" field of the page (the superconduct of the homepage)
        actions.sendKeys(Keys.END).perform();

        //4. Click on the "Term and Conditions" tab
        mainPage.termAndConditionsElementi.click();

        //5. Verify that the site's title text contains "Term and Conditions".
        expectedIcerik = "Terms and Conditions";
        actualSonuc = Driver.getDriver().getTitle();
        Assert.assertTrue(actualSonuc.contains(expectedIcerik));

        Driver.closeDriver();
    }

    @Test
    public void verifyPrivacyPolicy_11_01() {
        //1. Open the Chrome browser
        //2. Write https://qa.tripandway.com  in the URL field and press ENTER
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3. Go to the "FOOTER" field of the page(the superconduct of the home page)
        actions.sendKeys(Keys.END).perform();

        //4. Click "Privacy Policy"
        mainPage.privacyPolicyElementi.click();

        //5.Verify that the site's title text contains "Privacy policy
        expectedIcerik = "Privacy Policy";
        actualSonuc = Driver.getDriver().getTitle();
        Assert.assertTrue(actualSonuc.contains(expectedIcerik));

        Driver.closeDriver();

    }

    @Test
    public void verifyServices_12_01() {
        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();

        //4.Açılan sayfada title'ın "Services" text'i içerdiği test edilmelidir
        expectedIcerik = "Services";
        actualSonuc = Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc, expectedIcerik);


        Driver.closeDriver();
    }

    @Test
    public void verifyInternationalTour_12_02() {

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();

        //4. Açılan sayfada "International Tour" resminin görünür olduğunu doğrulayınız
        softAssert.assertTrue(mainPage.iconInternationalTour.isDisplayed());

        //5. Açılan sayfada "International Tour" sekmesine tıklayınız
        mainPage.iconInternationalTour.click();

        //6. Açılan sayfanın title textinin "International Tour" yazısı içerdiğini doğrulayınız.
        expectedIcerik = "International Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }

    @Test
    public void verifyAdventureTour_12_03() {

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();

        //4. Açılan sayfada "Adventure Tour" resminin görünür olduğunu doğrulayınız
        softAssert.assertTrue(mainPage.iconAdventureTour.isDisplayed());

        //5. Açılan sayfada "Adventure Tour" sekmesine tıklayınız
        mainPage.iconAdventureTour.click();

        //6. Açılan sayfanın title textinin "Adventure Tour" yazısı içerdiğini doğrulayınız.
        expectedIcerik = "Adventure Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();


        Driver.closeDriver();

    }

    @Test
    public void verifyCultureTour_12_04() {

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();

        //4. Açılan sayfada "Culture Tour" resminin görünür olduğunu doğrulayınız
        softAssert.assertTrue(mainPage.iconCultureTour.isDisplayed());

        //5. Açılan sayfada "Culture Tour" sekmesine tıklayınız
        mainPage.iconCultureTour.click();

        //6. Açılan sayfanın title textinin "Culture Tour" yazısı içerdiğini doğrulayınız.
        expectedIcerik = "Culture Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }

    @Test
    public void verifyBussinessTou_12_05() {

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Açılan sayfada "Bussiness Tour" resminin görünür olduğunu doğrulayınız
        softAssert.assertTrue(mainPage.iconBussinessTour.isDisplayed());

        //5. Açılan sayfada "Bussiness Tour" sekmesine tıklayınız
        mainPage.iconBussinessTour.click();

        //6. Açılan sayfanın title textinin "Bussiness Tour" yazısı içerdiğini doğrulayınız.
        expectedIcerik = "Bussiness Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();
    }

    @Test
    public void verifyHealthTour_12_06() {

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Açılan sayfada "Health Tour" resminin görünür olduğunu doğrulayınız
        softAssert.assertTrue(mainPage.iconHealthTour.isDisplayed());

        //5. Açılan sayfada "Health Tour" sekmesine tıklayınız
        mainPage.iconHealthTour.click();

        //6. Açılan sayfanın title textinin "Health Tour" yazısı içerdiğini doğrulayınız.
        expectedIcerik = "Health Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }


    @Test
    public void verifyReligiousTour_12_07() {

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Açılan sayfada "Religious Tour" resminin görünür olduğunu doğrulayınız
        softAssert.assertTrue(mainPage.iconReligiousTour.isDisplayed());

        //5. Açılan sayfada "Religious Tour" sekmesine tıklayınız
        mainPage.iconReligiousTour.click();

        //6. Açılan sayfanın title textinin "Religious Tour" yazısı içerdiğini doğrulayınız.
        expectedIcerik = "Religious Tour";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }

    @Test
    public void verifyDestinations_13_01() {
        //1. Chrome tarayıcısını açınız
        //2. URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3. Header alanın'da "DESTINATIONS" butonuna tıklayınız
        mainPage.DestinationsElementi.click();

        //4. Açılan sayfada title'ın "DESTINATIONS" text'i içerdiği test edilmelidir
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc, expectedIcerik);

        Driver.closeDriver();

    }

    @Test
    public void verifyBangkokThailand_13_02() {
        //1. Chrome tarayıcısını açınız
        //2. URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3. Header alanın'da "DESTINATIONS" butonuna tıklayınız
        mainPage.destinationElementi.click();

        //4. Destinations alanında "Bangkok, Thailand"  reminin görüntülendiğini doğrulayınız
        softAssert.assertTrue(destinationsPage.visitorBangkokThailandElementi.isDisplayed());

        //5. "Bangkok, Thailand"  resminin üzerine geliniz ve "Büyüteç" ikonuna tıklayınız

        actions.moveToElement(destinationsPage.visitorBangkokThailandBuyutecElementi).perform();

        destinationsPage.visitorBangkokThailandBuyutecElementi.click();

        //6. Sağa vo sol ok tuşlarına tıklayınız
        destinationsPage.visitorBangkokThailandSagOkElementi.click();

        //7. Resimlerin değiştini doğrulayınız.
        destinationsPage.visitorBangkokThailandSolOkElementi.click();

        //8. Resmin sağ üst köşesindeki "X" ikonuna tıklayınız
        destinationsPage.visitorBangkokThailandKapatmaElementi.click();

        //9. "DESTINATIONS" sayfasına dönüldüğünü doğrulayınız
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        //10. "Bangkok, Thailand"  resmine tıklayınız ve aktif olduğu doğrulayınız
        destinationsPage.visitorBangkokThailandElementi.click();
        expectedIcerik = "Bangkok, Thailand";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }

    @Test
    public void verifyGreenvilleSouthCarolina_13_03() {
        //1. Chrome tarayıcısını açınız
        //2. URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3. Header alanın'da "DESTINATIONS" butonuna tıklayınız
        mainPage.destinationElementi.click();

        //4. Destinations alanında "Greenville, South Carolina"  resminin görüntülendiğini doğrulayınız
        softAssert.assertTrue(destinationsPage.visitorGreenvilleSouthCarolinaElementi.isDisplayed());

        //5. "Greenville, South Carolina"  resminin üzerine geliniz ve "Büyüteç" ikonuna tıklayınız

        actions.moveToElement(destinationsPage.visitorIstanbulTurkeyBuyutecElementi).perform();

        destinationsPage.visitorGreenvilleSouthCarolinaBuyutecElementi.click();

        //6. Sağa vo sol ok tuşlarına tıklayınız
        destinationsPage.visitorGreenvilleSouthCarolinaSagOkElementi.click();

        //7. Resimlerin değiştini doğrulayınız.
        destinationsPage.visitorGreenvilleSouthCarolinaSolOkElementi.click();

        //8. Resmin sağ üst köşesindeki "X" ikonuna tıklayınız
        destinationsPage.visitorGreenvilleSouthCarolinaKapatmaElementi.click();

        //9. "DESTINATIONS" sayfasına dönüldüğünü doğrulayınız
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        //10. "Greenville, South Carolina"  resmine tıklayınız ve aktif olduğu doğrulayınız
        destinationsPage.visitorGreenvilleSouthCarolinaElementi.click();
        expectedIcerik = "Greenville, South Carolina";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }

    @Test
    public void verifyBuenosAiresArgentina_13_04() {
        //1. Chrome tarayıcısını açınız
        //2. URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3. Header alanın'da "DESTINATIONS" butonuna tıklayınız
        mainPage.destinationElementi.click();

        //4. Destinations alanında "Buenos Aires, Argentina"  resminin görüntülendiğini doğrulayınız
        softAssert.assertTrue(destinationsPage.visitorBuenosAiresArgentinaElementi.isDisplayed());

        //5. "Buenos Aires, Argentina"  resminin üzerine geliniz ve "Büyüteç" ikonuna tıklayınız

        actions.moveToElement(destinationsPage.visitorBuenosAiresArgentinaBuyutecElementi).perform();

        destinationsPage.visitorBuenosAiresArgentinaBuyutecElementi.click();

        //6. Sağa vo sol ok tuşlarına tıklayınız
        destinationsPage.visitorBuenosAiresArgentinaSagOkElementi.click();

        //7. Resimlerin değiştini doğrulayınız.
        destinationsPage.visitorBuenosAiresArgentinaSolOkElementi.click();

        //8. Resmin sağ üst köşesindeki "X" ikonuna tıklayınız
        destinationsPage.visitorBuenosAiresArgentinaKapatmaElementi.click();

        //9. "DESTINATIONS" sayfasına dönüldüğünü doğrulayınız
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        //10. "Buenos Aires, Argentina"  resmine tıklayınız ve aktif olduğu doğrulayınız
        destinationsPage.visitorBuenosAiresArgentinaElementi.click();
        expectedIcerik = "Buenos Aires, Argentina";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }

    @Test
    public void verifyMarrakeshMorocco_13_05() {
        //1. Chrome tarayıcısını açınız
        //2. URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3. Header alanın'da "DESTINATIONS" butonuna tıklayınız
        mainPage.destinationElementi.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Destinations alanında "Marrakesh, Morocco"  resminin görüntülendiğini doğrulayınız
        softAssert.assertTrue(destinationsPage.visitorMarrakeshMoroccoElementi.isDisplayed());

        //5. "Marrakesh, Morocco"  resminin üzerine geliniz ve "Büyüteç" ikonuna tıklayınız

        actions.moveToElement(destinationsPage.visitorMarrakeshMoroccoBuyutecElementi).perform();

        destinationsPage.visitorMarrakeshMoroccoBuyutecElementi.click();

        //6. Sağa vo sol ok tuşlarına tıklayınız
        destinationsPage.visitorMarrakeshMoroccoSagOkElementi.click();

        //7. Resimlerin değiştini doğrulayınız.
        destinationsPage.visitorMarrakeshMoroccoSolOkElementi.click();

        //8. Resmin sağ üst köşesindeki "X" ikonuna tıklayınız
        destinationsPage.visitorMarrakeshMoroccoKapatmaElementi.click();

        //9. "DESTINATIONS" sayfasına dönüldüğünü doğrulayınız
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        //10. "Marrakesh, Morocco"  resmine tıklayınız ve aktif olduğu doğrulayınız
        destinationsPage.visitorMarrakeshMoroccoElementi.click();
        expectedIcerik = "Marrakesh, Morocco";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }

    @Test
    public void verifySalinaIslandItaly_13_06() {
        //1. Chrome tarayıcısını açınız
        //2. URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3. Header alanın'da "DESTINATIONS" butonuna tıklayınız
        mainPage.destinationElementi.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Destinations alanında "Salina Island, Italy""  resminin görüntülendiğini doğrulayınız
        softAssert.assertTrue(destinationsPage.visitorSalinaIslandItalyElementi.isDisplayed());

        //5. "Salina Island, Italy""  resminin üzerine geliniz ve "Büyüteç" ikonuna tıklayınız

        actions.moveToElement(destinationsPage.visitorSalinaIslandItalyBuyutecElementi).perform();

        destinationsPage.visitorSalinaIslandItalyBuyutecElementi.click();

        //6. Sağa vo sol ok tuşlarına tıklayınız
        destinationsPage.visitorSalinaIslandItalySagOkElementi.click();

        //7. Resimlerin değiştini doğrulayınız.
        destinationsPage.visitorSalinaIslandItalySolOkElementi.click();

        //8. Resmin sağ üst köşesindeki "X" ikonuna tıklayınız
        destinationsPage.visitorSalinaIslandItalyKapatmaElementi.click();

        //9. "DESTINATIONS" sayfasına dönüldüğünü doğrulayınız
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        //10. "Salina Island, Italy""  resmine tıklayınız ve aktif olduğu doğrulayınız
        destinationsPage.visitorSalinaIslandItalyElementi.click();
        expectedIcerik = "Salina Island, Italy";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }

    @Test
    public void verifyIstanbulTurkey_13_07() {
        //1. Chrome tarayıcısını açınız
        //2. URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3. Header alanın'da "DESTINATIONS" butonuna tıklayınız
        mainPage.destinationElementi.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Destinations alanında "Istanbul, Turkey"  resminin görüntülendiğini doğrulayınız
        softAssert.assertTrue(destinationsPage.visitorIstanbulTurkeyElementi.isDisplayed());

        //5. "Istanbul, Turkey"  resminin üzerine geliniz ve "Büyüteç" ikonuna tıklayınız

        actions.moveToElement(destinationsPage.visitorIstanbulTurkeyBuyutecElementi).perform();

        destinationsPage.visitorIstanbulTurkeyBuyutecElementi.click();

        //6. Sağa vo sol ok tuşlarına tıklayınız
        destinationsPage.visitorIstanbulTurkeySagOkElementi.click();

        //7. Resimlerin değiştini doğrulayınız.
        destinationsPage.visitorIstanbulTurkeySolOkElementi.click();

        //8. Resmin sağ üst köşesindeki "X" ikonuna tıklayınız
        destinationsPage.visitorIstanbulTurkeyKapatmaElementi.click();

        //9. "DESTINATIONS" sayfasına dönüldüğünü doğrulayınız
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        //10. "Istanbul, Turkey"  resmine tıklayınız ve aktif olduğu doğrulayınız
        destinationsPage.visitorIstanbulTurkeyElementi.click();
        expectedIcerik = "Istanbul, Turkey";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }

    @Test
    public void verifyCaliforniaUsa_13_08() {
        //1. Chrome tarayıcısını açınız
        //2. URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3. Header alanın'da "DESTINATIONS" butonuna tıklayınız
        mainPage.destinationElementi.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Destinations alanında "California, Usa"  resminin görüntülendiğini doğrulayınız
        softAssert.assertTrue(destinationsPage.visitorCaliforniaUsaElementi.isDisplayed());

        //5. "California, Usa"  resminin üzerine geliniz ve "Büyüteç" ikonuna tıklayınız

        actions.moveToElement(destinationsPage.visitorCaliforniaUsaBuyutecElementi).perform();

        destinationsPage.visitorCaliforniaUsaBuyutecElementi.click();

        //6. Sağa vo sol ok tuşlarına tıklayınız
        destinationsPage.visitorCaliforniaUsaSagOkElementi.click();

        //7. Resimlerin değiştini doğrulayınız.
        destinationsPage.visitorCaliforniaUsaSolOkElementi.click();

        //8. Resmin sağ üst köşesindeki "X" ikonuna tıklayınız
        destinationsPage.visitorCaliforniaUsaKapatmaElementi.click();

        //9. "DESTINATIONS" sayfasına dönüldüğünü doğrulayınız
        expectedIcerik = "Destinations";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        //10. "California, Usa"  resmine tıklayınız ve aktif olduğu doğrulayınız
        destinationsPage.visitorCaliforniaUsaElementi.click();
        expectedIcerik = "california-usa";
        actualSonuc = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualSonuc, expectedIcerik);

        softAssert.assertAll();

        Driver.closeDriver();

    }
    @Test
    public void verify14_01(){

    }
}
