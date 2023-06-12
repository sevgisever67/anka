package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

;

public class US_31_32 extends TestBaseRapor {

    Admin_Dashboard adminDashboard;


    @BeforeMethod
    public void setup() {
        adminDashboard = new Admin_Dashboard();
        extentTest = extentReports.createTest("US_31_32");
        extentTest.info("Login with admin information");
        //Go to url as an admin
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

    }

    //US31 test case
    @Test
    public void verifyAdminPanelPackageUS31() {


        //Send keys the name and password
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));
        // Click the login
        adminDashboard.adminLoginButton.click();

        //Verify that in admindashboard menu "Package"
        String expectedTitle = "Packages";
        String actualTitle = adminDashboard.adminPackagesButton.getText();
        Assert.assertEquals(actualTitle, expectedTitle);

        //Display the section Package
        adminDashboard.adminPackagesButton.isDisplayed();
        extentTest.info("Packages generic is working.");


        //Click on the Packages

        adminDashboard.adminPackagesButton.click();
        extentTest.info("Packages page is opened");

        ReusableMethods.waitFor(2);
        //Click on the  "+Add New"  button
        adminDashboard.blogSectionAddNewButton.click();


        // Click on the  "Name" box
        adminDashboard.packagesAddNameBox.click();
        //Send keys the "Name" box
        adminDashboard.packagesAddNameBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesAddNameBox"));
        //Click on the " Slug" box
        adminDashboard.packagesAddSlugBox.click();
        //Send keys on the "Slug" box
        adminDashboard.packagesAddSlugBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesAddSlugBox"));


        // Click on the  "Last Booking Date" box
        adminDashboard.adminPackageslastBookingDateBox.click();
        //Send keys the "Last Booking Date" box
        adminDashboard.adminPackageslastBookingDateBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesLastBookingDateBox"));


        String herkesteFarkliOlan = System.getProperty("user.dir");
        String herkesteAyniOlan = "/raporlar/Screenshots/canakkale.png";
        String dosyaYolu = herkesteFarkliOlan + herkesteAyniOlan;
        adminDashboard.packagesDosyaSecButton.sendKeys(dosyaYolu);


        // Click on the  "Start Date" box
        adminDashboard.packagesStartDateBox.click();
        //Send keys the "Start Date" box
        adminDashboard.packagesStartDateBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesStartDateBox"));
        //Click on the " End Date" box
        adminDashboard.packagesEndDateBox.click();
        //Send keys on the "End Date" box
        adminDashboard.packagesEndDateBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesEndDateBox"));


        ReusableMethods.wait(2);

        //Send keys the "Price" box
        adminDashboard.adminPackagesPriceBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesPriceBox"));


        // Click on the "Submit" button
        adminDashboard.adminBlogSectionSubmitButton.submit();


        //New package is added
        adminDashboard.packageIsAddedSuccessfully.isDisplayed();

        extentTest.info("New package is added");


        //Second page in package list
        // adminDashboard.adminPackageSecondPage.click();


        //Editing of the added package
        adminDashboard.editButton.click();

        // Click on the  "Name" box
        adminDashboard.packagesAddNameBox.click();
        //Send keys the "Name" box
        adminDashboard.packagesAddNameBox.clear();
        adminDashboard.packagesAddNameBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesEditNameBox"));
        //Click on the " Slug" box
        adminDashboard.packagesAddSlugBox.click();
        adminDashboard.packagesAddSlugBox.clear();
        //Send keys on the "Slug" box
        adminDashboard.packagesAddSlugBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesEditSlugBox"));

        ReusableMethods.wait(2);

        // Click on the  "Last Booking Date" box
        adminDashboard.adminPackageslastBookingDateBox.click();
        adminDashboard.adminPackageslastBookingDateBox.clear();
        //Send keys the "Last Booking Date" box
        adminDashboard.adminPackageslastBookingDateBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesEditLastBookingDateBox"));
        // Click on the  "Start Date" box
        adminDashboard.packagesStartDateBox.click();
        adminDashboard.packagesStartDateBox.clear();
        //Send keys the "Start Date" box
        adminDashboard.packagesStartDateBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesEditStartDateBox"));
        //Click on the " End Date" box
        adminDashboard.packagesEndDateBox.click();
        adminDashboard.packagesEndDateBox.clear();
        //Send keys on the "End Date" box
        adminDashboard.packagesEndDateBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesEditEndDateBox"));


        //Send keys the "Price" box
        adminDashboard.adminPackagesPriceBox.clear();
        adminDashboard.adminPackagesPriceBox.sendKeys(ConfigReader.getProperty("qaAdminPackagesEditPriceBox"));


        // Click on the "Submit" button
        adminDashboard.adminPackagesUpdateButton.submit();


        ReusableMethods.wait(2);

        //To delete the package
        adminDashboard.deleteButton.click();
        Driver.getDriver().switchTo().alert().accept();
        adminDashboard.packageIsDeletedSuccessfully.isDisplayed();


        extentTest.pass("The package is successfully updated and deleted.");


    }


    @Test
    public void verifyAdminPanelOrder_US32() {

        //Send keys the name and password
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));
        // Click the login
        adminDashboard.adminLoginButton.click();

        //verify that in admin dashboard menu "Order"
        String expectedTitle = "Order";
        String actualTitle = adminDashboard.adminOrderButton.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        //Display the section "Order"
        adminDashboard.adminPackagesButton.isDisplayed();

        ReusableMethods.waitFor(2);

        //click on the "Order"
        adminDashboard.adminOrderButton.click();

        ReusableMethods.waitFor(2);


        extentTest.pass("verified that orders can be viewed by entering the Order section.");


    }

}


    /*

            add new= //*[@class="btn btn-primary btn-sm"]

            Sonraki sayfada istnen bilgilerin locateleri;

            name=//*[@name="p_name"]
            slug=//*[@name="p_slug"]
            Description=(//*[@class="note-editable card-block"])[1]
            Itinenary=(//*[@class="note-editable card-block"])[2]


            Short Description=//*[@name="p_description_short"]
            Location=//*[@name="p_location"]
            Start Date=//*[@name="p_start_date"]
            End Date=//*[@name="p_end_date"]
            Last Booking Date=//*[@name="p_last_booking_date"]

            Price=//*[@name="p_price"]
            Is Featured=//*[@name="p_is_featured"]
            Destination=//*[@id="select2-destination_id-65-container"]
            Meta Description=//*[@name="seo_meta_description"]

            Submit Button=//*[@class="btn btn-success"]
            Order=  //*[@class="fas fa-bookmark"]
            Order list= //*[@id="dataTable_info"]



 */

