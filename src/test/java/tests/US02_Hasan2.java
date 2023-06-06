package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US02_Hasan2 extends TestBaseRapor {
    MainPage mainPage=new MainPage();
    SoftAssert softAssert=new SoftAssert();



    @BeforeMethod
    public void setUp(){
      //  extentTest = extentReports.createTest("US02");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }
    @Test
    public void sirketNosununGorunurOldugunuTestEt_TC_01 (){
        String expectedTelefonNo="202-456-3789";
        String actualTelefonno=mainPage.ziyaretciSirketTelefonNo.getText();
        softAssert.assertEquals(actualTelefonno,expectedTelefonNo);
    }
    @Test
    public void sirketTelefonIconununGorunurOldugunuTestEt_TC_02 (){
        softAssert.assertTrue(mainPage.ziyaretciTelefonIcon.isDisplayed());
    }
    @Test
    public void sirketMailininDogrulugununTesti(){

    }


}
