package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PackagePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Random;

public class US_23_24_25_Fatih{

    PackagePage packagePage = new PackagePage();
    Random random =new Random();



    @BeforeMethod
    public void setup(){

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        packagePage.userLogInButton.click();
        packagePage.userEmailAddrsess.sendKeys("ebru@gmail.com");
        packagePage.userPasswordButton.sendKeys("Ebru.1234");

        packagePage.cookiesAcceptButton.click();
        packagePage.userLogin2.click();




    }
    @Test
    public void us23Logout(){

        packagePage.userLogoutButton.click();
        String expectTitle= "Login";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectTitle);


    }

    @Test
    public  void us24PackageAndPays() throws InterruptedException {

        packagePage.userPackages.click();
        packagePage.user7daysInIstanbul.click();
        packagePage.userNumberPersonBox.click();
        Select select= new Select(packagePage.userNumberPersonBox);
        int randomKisiSayisi = random.nextInt(20)+1;

        select.selectByIndex(randomKisiSayisi);
        packagePage.userNumberPersonBox.click();
        //Thread.sleep(2000);

        String expectedTotalPrice= "14000";
        String actualTotalPrice= packagePage.userTotalPrice.getText();
        Assert.assertTrue(actualTotalPrice.contains(expectedTotalPrice));

        packagePage.userBookYourSeatButton.submit();



        packagePage.userPatwithCardButton.submit();
        //Thread.sleep(2000);
        //WebElement iFrameBox= Driver.getDriver().findElement(By.xpath("//iframe[@class='stripe_checkout_app']"));

        Driver.getDriver().switchTo().frame(packagePage.iFrameBox);
        String expectedPayPrice= "$14,000.00";
        String actualPayPrice= packagePage.userPayButton.getText();
        Assert.assertTrue(actualTotalPrice.contains(expectedTotalPrice));


        packagePage.userCardNumberBox.sendKeys(ConfigReader.getProperty("qaCardNumber"));
        //Driver.getDriver().switchTo().defaultContent();
        //packagePage.userCardNumberBox.submit();
        //packagePage.userCardNumberBox.sendKeys("4242424242424242");

        Thread.sleep(5000);
        packagePage.userCardDateBox.submit();
        packagePage.userCardDateBox.sendKeys(ConfigReader.getProperty("qaCardDate"));
        packagePage.userCardCvcBox.submit();
        packagePage.userCardCvcBox.sendKeys(ConfigReader.getProperty("qaCardCvc"));







    }

    @Test
    public void us25PaymentHistory(){

        packagePage.userPaymentHistoryButon.click();
        String expectIcerik= "View All Payments";
        String actualSayfaIcerigi= packagePage.orderYazisi.getText();
        Assert.assertTrue(actualSayfaIcerigi.contains(expectIcerik));;




    }

}
