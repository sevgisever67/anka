package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_02_Hasan2 {
    MainPage mainPage=new MainPage();


    @BeforeMethod
    public void setUp(){
      //  extentTest = extentReports.createTest("US02");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }
    @Test
    public void sirketNosununGorunurOldugunuTestEt_TC_01 (){
        String expectedTelefonNo="202-456-3789";
        String actualTelefonno=mainPage.ziyaretciSirketTelefonNo.getText();
        Assert.assertEquals(actualTelefonno,expectedTelefonNo);
    }
    @Test
    public void sirketTelefonIconununGorunurOldugunuTestEt_TC_02 (){
        Assert.assertTrue(mainPage.ziyaretciTelefonIcon.isDisplayed());
    }

    @Test
    public void sirkeInfosununDogrulugununTesti_TC_03(){
        Assert.assertTrue(mainPage.ziyaretciIInfo.isDisplayed());

    }
    @Test
    public void mailIkonununGorundugunuDogrula_TC_04(){
        Assert.assertTrue(mainPage.ziyaretciMailIconu.isDisplayed());
    }


}
