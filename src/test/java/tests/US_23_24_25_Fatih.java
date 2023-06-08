package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PackagePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Arrays;
import java.util.Random;



public class US_23_24_25_Fatih extends TestBaseRapor {

    PackagePage packagePage = new PackagePage();
    Random random= new Random();

    SoftAssert softAssert= new SoftAssert();



    @BeforeMethod
    public void setup(){

        extentTest= extentReports.createTest("US_23_24_25");

        // Go to user url
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        // Click Login button
        packagePage.userLogInButton.click();
        // Enter email and password
        packagePage.userEmailAddrsess.sendKeys("ebru@gmail.com");
        packagePage.userPasswordButton.sendKeys("Ebru.1234");
        // Accept cookies
        packagePage.cookiesAcceptButton.click();
        // Click Login button
        packagePage.userLogin2.click();
        extentTest.info("Log in as an user");




    }
    @Test
    public void us23Logout(){

        // Click Logout button
        packagePage.userLogoutButton.click();
        extentTest.info("User has been Logout");
        // Verify the page is Login
        String expectTitle= "Login";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectTitle);
        extentTest.pass("Logout in as an user");


    }

    @Test
    public  void us24_25PackageAndPaysandPaymentHistory_TC_01() throws InterruptedException {

        // Click Packages
        packagePage.userPackages.click();
        // Click 7 Days In Istanbul
        packagePage.user7daysInIstanbul.click();
        extentTest.info("User was able to choose tour package");
        // Click Total Person Dropdown menu
        packagePage.userNumberPersonBox.click();
        // Choose number of person
        Select select= new Select(packagePage.userNumberPersonBox);
        int randomKisiSayisi = random.nextInt(20);
        select.selectByIndex(randomKisiSayisi);
        packagePage.userNumberPersonBox.click();

        // Verify the amount payable
        int expectedTotalPrice = Integer.parseInt(packagePage.userTotalPrice.getText());
        int actualTotalPrice= tutarHesaplama(randomKisiSayisi+1);
        System.out.println(randomKisiSayisi);
        Assert.assertEquals(actualTotalPrice,expectedTotalPrice);

        // Click Book Your Seat button
        packagePage.userBookYourSeatButton.submit();

        // Click Pay with Card button
        packagePage.userPatwithCardButton.submit();

        // Verify the amount payable
        Driver.getDriver().switchTo().frame(packagePage.iFrameBox);


        // Enter credit card information

        String cardNum= "4242424242424242";
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[1].value = arguments[0]; ", cardNum, packagePage.userCardNumberBox );
        Thread.sleep(2000);

        packagePage.userCardDateBox.submit();
        String cardDate= "01/25";
        JavascriptExecutor date= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[1].value = arguments[0]; ", cardDate, packagePage.userCardDateBox );
        Thread.sleep(2000);

        packagePage.userCardCvcBox.submit();
        String cardCvc= "123";
        JavascriptExecutor cvc= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[1].value = arguments[0]; ", cardCvc, packagePage.userCardCvcBox );

        // Click Pay Button
        packagePage.userPayButton.submit();
        Driver.getDriver().switchTo().defaultContent();
        Thread.sleep(2000);
        extentTest.info("The user has paid for the tour package she has chosen.");

        // Confirmation of payment transaction
        softAssert.assertTrue(packagePage.alert.isDisplayed());
        System.out.println(packagePage.alert.getText());
        Thread.sleep(5000);
        extentTest.pass("The user has made the purchase");

        packagePage.dashBoardElementi.click();

        // Click Payment History Button
        packagePage.userPaymentHistoryButon.click();
        extentTest.info("User was able to view payment history");

        // Verify View All Payments
        String expectIcerik= "View All Payments";
        String actualSayfaIcerigi= packagePage.orderYazisi.getText();
        Assert.assertTrue(actualSayfaIcerigi.contains(expectIcerik));;

        // Click Action (Eye icon) Button
        packagePage.userPaymentHistoryActionButton.click();
        extentTest.info("User was able to view the last payment details");

        // Verify Order Detail
        String expectOrder= "Order Detail";
        String actualOrder= packagePage.orderDetailText.getText();
        Assert.assertTrue(actualOrder.contains(expectOrder));

        String actualPayAmount= packagePage.payAmountText.getText();
        System.out.println(packagePage.payAmountText.getText());


        extentTest.pass("User can view purchase history");
        String []tutar= actualPayAmount.split(" ");

        System.out.println(Arrays.toString(tutar));


        String tutarSdr= tutar[1];
        System.out.println(tutarSdr);

        tutarSdr= tutarSdr.replaceAll(",", "");
        System.out.println(tutarSdr);

        int noktaIndex= tutarSdr.indexOf(".");
        if (noktaIndex !=-1){
            tutarSdr= tutarSdr.substring(0,noktaIndex);

        }

        int tutarint= Integer.parseInt(tutarSdr);
        System.out.println(tutarint);
        System.out.println(actualTotalPrice);

        Assert.assertEquals(actualTotalPrice,tutarint);
        extentTest.fail("Odenen ücret farklı");




    }


    @Test
    public static int tutarHesaplama(int kisiSayisi){

    return kisiSayisi*7000;
    }



}
