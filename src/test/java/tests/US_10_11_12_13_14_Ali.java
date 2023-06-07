package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_10_11_12_13_14_Ali extends TestBaseRapor {
    MainPage mainPage = new MainPage();
    Actions actions = new Actions(Driver.getDriver());

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
        String expectedIcerik = "Terms and Conditions";
        String actualSonuc = Driver.getDriver().getTitle();
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
        String expectedIcerik = "Privacy Policy";
        String actualSonuc = Driver.getDriver().getTitle();
        Assert.assertTrue(actualSonuc.contains(expectedIcerik));

        Driver.closeDriver();

    }
    @Test
    public void verifyServices_12_01(){
        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();

        //4.Açılan sayfada title'ın "Services" text'i içerdiği test edilmelidir
        String expectedIcerik="Services";
        String actualSonuc=Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc,expectedIcerik);


        Driver.closeDriver();
    }
    @Test
    public void verifyInternationalTour_12_02(){

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();

        //4. Açılan sayfada "International Tour" sekmesine tıklayını
        mainPage.iconInternationalTour.click();

        //5. Sitenin title textinin "International Tour" yazısı içerdiğini doğrulayınız.
        String expectedIcerik="International Tour";
        String actualSonuc=Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc,expectedIcerik);

        Driver.closeDriver();

    }

    @Test
    public void verifyAdventureTour_12_03(){

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();

        //4. Açılan sayfada "Adventure Tour" sekmesine tıklayınız
        mainPage.iconAdventureTour.click();

        //5. Sitenin title textinin "Adventure Tour" yazısı içerdiğini doğrulayınız.
        String expectedIcerik="Adventure Tour";
        String actualSonuc=Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc,expectedIcerik);

        Driver.closeDriver();

    }
    @Test
    public void verifyCultureTour_12_04(){

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();

        //4. Açılan sayfada "Culture Tour" sekmesine tıklayınız
        mainPage.iconCultureTour.click();

        //5. Sitenin title textinin "Culture Tour" yazısı içerdiğini doğrulayınız.
        String expectedIcerik="Culture Tour";
        String actualSonuc=Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc,expectedIcerik);

        Driver.closeDriver();

    }

    @Test
    public void verifyBussinessTou_12_05(){

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Açılan sayfada "Business Tour" sekmesine tıklayınız
        mainPage.iconBussinessTour.click();

        //5. Sitenin title textinin "Business Tour" yazısı içerdiğini doğrulayınız.
        String expectedIcerik="Bussiness Tour";
        String actualSonuc=Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc,expectedIcerik);

        Driver.closeDriver();

    }
    @Test
    public void verifyHealthTour_12_06(){

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Açılan sayfada "Healt Tour" sekmesine tıklayınız
        mainPage.iconHealthTour.click();

        //5. Sitenin title textinin "Healt Tour" yazısı içerdiğini doğrulayınız.
        String expectedIcerik="Health Tour";
        String actualSonuc=Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc,expectedIcerik);

        Driver.closeDriver();

    }


    @Test
    public void verifyReligiousTour_12_07(){

        //1.Chrome tarayıcısını açınız
        //2.URL alanına https://qa.tripandway.com adresini yazınız ve enter tuşuna basınız
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(3);
        mainPage.acceptButonu.click();

        //3.Header alanın'da "SERVİCES" butonuna tıklayınız
        mainPage.iconServices.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4. Açılan sayfada "Religious Tour" sekmesine tıklayınız
        mainPage.iconReligiousTour.click();

        //5. Sitenin title textinin "Religious Tour" yazısı içerdiğini doğrulayınız.
        String expectedIcerik="Religious Tour";
        String actualSonuc=Driver.getDriver().getTitle();
        Assert.assertEquals(actualSonuc,expectedIcerik);

        Driver.closeDriver();

    }

}
