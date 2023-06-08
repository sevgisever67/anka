package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PackagePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_01_02_03_hasancan extends TestBaseRapor {
    PackagePage packagePage = new PackagePage();

    @BeforeMethod
    public void setup() {


        extentTest = extentReports.createTest("US_01_02_03");
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

    }

    @Test
    public void us01OpenHomePage() {

        String expectedTitle = "Tripandway";
        String actualTitle = Driver.getDriver().getTitle();

        //System.out.println(Driver.getDriver().getTitle());

        Assert.assertEquals(actualTitle, expectedTitle);
    }


}
