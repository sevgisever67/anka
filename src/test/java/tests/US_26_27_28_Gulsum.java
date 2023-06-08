package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public  class US_26_27_28_Gulsum extends TestBaseRapor {

    Admin_Dashboard adminDashboard = new Admin_Dashboard();
    ContactPage  contantPage = new ContactPage();
    SoftAssert softAssert = new SoftAssert();



    @BeforeMethod
    public void setup () {
        extentTest = extentReports.createTest("US_26_27_28_Gulsum");

        //Go to url as an admin
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));



    }

    @Test
    public void displayAdminPanel_U26 (){

        //Send keys the name and password
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        extentTest.info("Login with admin information");

        // Click the login
        adminDashboard.adminLoginButton.click();

        extentTest.pass("Verified that admin panel is displayed");


    }


    @Test
    public void verifyAdminPanelMenusButton_US27() {



        //Send keys the name and password
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));
        // Click the login
        adminDashboard.adminLoginButton.click();


        //verify that in admin dashboard menu "General Settings"
        String expectedTitle= "General Settings";
        String actualTitle= adminDashboard.adminGeneralSettingsButton.getText();
        Assert.assertEquals(actualTitle,expectedTitle);
        adminDashboard.adminGeneralSettingsButton.click();
        //Verify the sections of "General Settings" is display
        Assert.assertTrue(adminDashboard.adminGeneralSettingsButton.isDisplayed());
        ReusableMethods.waitFor(3);

        extentTest.info("Displayed General Settings menu");

        //verify that in admin dashboard menu "Page Settings"
        String expectedPageSettingsTitle= "Page Settings";
        String actualPageSettingsTitle= adminDashboard.adminPageSettingsButton.getText();
        Assert.assertEquals(actualPageSettingsTitle,expectedPageSettingsTitle);
        adminDashboard.adminPageSettingsButton.click();
        //Verify the sections of "Page Settings" is display
        Assert.assertTrue(adminDashboard.adminPageSettingsButton.isDisplayed());
        ReusableMethods.waitFor(3);

        extentTest.info("Displayed Page Settings menu");

        //verify that in admin dashboard menu "Payment Settings"
        String expectedPaymentSettingsTitle= "Payment Settings";
        String actualPaymentSettingsTitle= adminDashboard.adminPaymentSettingsButton.getText();
        Assert.assertEquals(actualPaymentSettingsTitle,expectedPaymentSettingsTitle);
        adminDashboard.adminPaymentSettingsButton.click();
        //Verify the sections of "General Settings" is display
        Assert.assertTrue(adminDashboard.adminPaymentSettingsButton.isDisplayed());
        ReusableMethods.waitFor(3);

        extentTest.info("Displayed Payment Settings menu");

        //verify that in admin dashboard menu "Dynamic Pages"
        String expectedDynamicPagesTitle= "Dynamic Pages";
        String actualDynamicPageTitle= adminDashboard.adminDynamicPagesButton.getText();
        Assert.assertEquals(actualDynamicPageTitle,expectedDynamicPagesTitle);
        adminDashboard.adminDynamicPagesButton.click();
        //Verify the sections of "Dynamic Pages" is display
        Assert.assertTrue(adminDashboard.adminDynamicPagesButton.isDisplayed());
        ReusableMethods.waitFor(3);

        extentTest.info("Displayed Dynamic Settings menu");

        //verify that in admin dashboard menu "Language"
        String expectedTitleLanguage= "Language";
        String actualTitleLanguage= adminDashboard.adminLanguageButton.getText();
        Assert.assertEquals(actualTitleLanguage,expectedTitleLanguage);
        adminDashboard.adminLanguageButton.click();
        //Verify the sections of "Language" is display
        Assert.assertTrue(adminDashboard.adminLanguageButton.isDisplayed());
        ReusableMethods.waitFor(3);

        extentTest.info("Displayed Language menu");

        //verify that in admin dashboard menu "Website Section"
        String expectedWebSiteTitle= "Website Section";
        String actualWebsiteTitle= adminDashboard.adminWebsiteSectionButton.getText();
        Assert.assertEquals(actualWebsiteTitle,expectedWebSiteTitle);
        adminDashboard.adminWebsiteSectionButton.click();
        //Verify the sections of "Website Section" is display
        Assert.assertTrue(adminDashboard.adminWebsiteSectionButton.isDisplayed());
        ReusableMethods.waitFor(3);

        extentTest.info("Displayed Website Section menu");

        //verify that in admin dashboard menu "Email Template"
        String expectedEmailTemplateTitle= "Email Template";
        String actualEmailTemplateTitle= adminDashboard.adminEmailTemplateButton.getText();
        Assert.assertEquals(actualEmailTemplateTitle,expectedEmailTemplateTitle);
        adminDashboard.adminEmailTemplateButton.click();
        //Verify the sections of "Email Template" is display
        Assert.assertTrue(adminDashboard.adminEmailTemplateButton.isDisplayed());
        ReusableMethods.waitFor(3);

        extentTest.info("Displayed Email Template menu");
        extentTest.pass("Verified that it displays the General Settings, Page Settings, " +
                "Payment Settings, Dynamic Pages, Language, Website Section and Email Template pages respectively");





    }

    @Test
    public void adminPanelBlogSectionMenusButton_US28() {


        //Send keys the name and password
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));
        // Click the login
        adminDashboard.adminLoginButton.click();

        //verify that in admin dashboard menu "Blog Section"
        String expectedBlogSectionTitle= "Blog Section";
        String actualBlogSectionTitle= adminDashboard.adminBlogSectionButton.getText();
        Assert.assertEquals(expectedBlogSectionTitle,actualBlogSectionTitle);
        adminDashboard.adminBlogSectionButton.click();
        //Verify the sections of "Blog Section" is display
        Assert.assertTrue(adminDashboard.adminBlogSectionButton.isDisplayed());
        ReusableMethods.waitFor(3);

        extentTest.info("Displayed Blog Section menu");

        // verify that in admin dashboard menu "Categories"
        String expectedBlogSectionCategoriesTitle= "Categories";
        String actualBlogSectionCategoriesTitle= adminDashboard.adminBlogSectionCategoriesButton.getText();
        Assert.assertEquals(expectedBlogSectionCategoriesTitle,actualBlogSectionCategoriesTitle);
        adminDashboard.adminBlogSectionCategoriesButton.click();
        //verify the section "Categories" in "Blog Section" menu
        Assert.assertTrue(adminDashboard.adminBlogSectionCategoriesButton.isDisplayed());
        ReusableMethods.waitFor(3);

        extentTest.info("Displayed Categories in Blog Section menu");

        //Click on the  "+Add New"  button
        adminDashboard.blogSectionAddNewButton.click();
        // Click on the  "Category Name" box
        adminDashboard.blogSectionCategoryNameBox.click();
        //Send keys the "Category Name"
        adminDashboard.blogSectionCategoryNameBox.sendKeys(ConfigReader.getProperty("qaAdminBlogSectionCategoryNameBox"));
        //Click on the "Category Slug" box
        adminDashboard.blogSectionCategorySlugBox.click();
        //Send keys on the "Category Slug"
        adminDashboard.blogSectionCategorySlugBox.sendKeys(ConfigReader.getProperty("qaAdminBlogSectionCategorySlugBox"));
        //Click on the "Title" box
        adminDashboard.blogSectionTitleBox.click();
        //Send keys on the "Title"
        adminDashboard.blogSectionTitleBox.sendKeys(ConfigReader.getProperty("qaAdminBlogSectionTitleBox"));
        //Click on the "Meta Description" box
        adminDashboard.blogSectionMetaDescriptionBox.sendKeys(ConfigReader.getProperty("qaAdminBlogSectionMetaDescriptionBox"));
        // Click on the "Submit" button
        adminDashboard.adminBlogSectionSubmitButton.submit();
        ReusableMethods.waitFor(3);

        extentTest.info("verified that categories can be added " +
                "to the categories section of the blog section menu.");


         //verify on the toast message
        Assert.assertTrue(contantPage.toastmessage.isDisplayed());



        //Verify the value "Traveller Guide" in "Categories" menu
        Assert.assertTrue(adminDashboard.adminBlogSectionCategoriesButton.isDisplayed());
        ReusableMethods.waitFor(3);
        //Verify the value "traveller-guide" in "Categories" menu
        Assert.assertTrue(adminDashboard.adminBlogSectionCategoriesButton.isDisplayed());
        ReusableMethods.waitFor(3);

        //Verify on the "Edit" button
        Assert.assertTrue(adminDashboard.adminBlogSectionEditButton.isDisplayed());
        //Click on the "Edit" button
       adminDashboard.adminBlogSectionEditButton.click();
        ReusableMethods.waitFor(3);

        extentTest.info("verified that categories can be edit " +
                "to the categories section of the blog section menu.");

        //Click on the "Title" box
        adminDashboard.blogSectionTitleBox.click();
        //Send keys on the "Title"
        adminDashboard.blogSectionTitleBox.sendKeys(ConfigReader.getProperty("qaAdminBlogSectionTitleChangeBox"));
        //Click on the "Meta Description" box
         adminDashboard.blogSectionMetaDescriptionBox.sendKeys(ConfigReader.getProperty("qaAdminBlogSectionMetaDescriptionChangeBox"));
        // Click on the "Upgrade" button
        adminDashboard.adminBlogSectionCategoriesEditUpgradeButton.click();

        //Verify edit toast message

        Assert.assertTrue(adminDashboard.adminEditToastMessage.isDisplayed());

        //Verify on the "Delete" button
        Assert.assertTrue(adminDashboard.adminBlogSectionDeleteButton.isDisplayed());
        //Click on the "Delete" button
        adminDashboard.adminBlogSectionDeleteButton.click();

        Driver.getDriver().switchTo().alert().accept();

        ReusableMethods.waitFor(3);
        //Verify delete toast message
        Assert.assertTrue(adminDashboard.adminDeleteToastMessage.isDisplayed());

        extentTest.info("verified that categories can be delete " +
                "to the categories section of the blog section menu.");

        ReusableMethods.waitFor(3);

        extentTest.pass("Confirmed that the category can be edited and deleted by adding " +
                "a new category to the Categories section in the Blog Section.");



    }




   // @AfterMethod
   // public void setup_finish (){

      //  Driver.closeDriver();
   // }
}
