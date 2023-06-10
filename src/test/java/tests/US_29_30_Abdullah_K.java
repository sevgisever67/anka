package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class US_29_30_Abdullah_K  extends TestBaseRapor{

    Admin_Dashboard adminDashboard;
    Actions actions;


    //US_029 : After logging in as an admin, I should be able to verify that the blog post
    // I added to the "Blog Section" section can be edited and deleted, by adding a new blog post to the Blog section.


    //TC_01. Verify accessibility of admin panel, successful login with valid credentials
    // and presence of specific item in admin panel.
    @Test
    public void us29_test01() {
        adminDashboard=new Admin_Dashboard();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US29 - TC_01. Successful login of the admin panel should be possible.");


        //1. Start the browser.
        //2. As an administrator, type the URL "https://qa.tripandway.com/admin/login" into the browser and press enter.
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //3. Enter the e-mail and password with administrator authority in the corresponding fields.
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        //4. Click the "Login" button.
        adminDashboard.adminLoginButton.click();
        extentTest.info("Signed In.");
        ReusableMethods.wait(3);

        //5. Verify that the admin user has successfully logged in by checking
        // the existence of a specific item on the admin panel page.
        Assert.assertTrue(adminDashboard.adminLoginVerification.isEnabled());
        extentTest.pass("Successful login of admin panel.");

        Driver.closeDriver();

    }
    //TC_02. Verify that you have navigated to the "Blog Section" and the Blog Section of the admin panel.
    @Test
    public void us29_test02() {
        adminDashboard=new Admin_Dashboard();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US29 - TC_02. You should be able to go to the -Blog Section- and the Blog Section of the admin panel.");
        //1. Start the browser.
        //2. As an administrator, type the URL "https://qa.tripandway.com/admin/login" into the browser and press enter.
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //3. Enter the e-mail and password with administrator authority in the corresponding fields.
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        //4. Click the "Login" button.
        adminDashboard.adminLoginButton.click();
        ReusableMethods.wait(3);

        //5. Click the "Blog Section" link in the admin panel.
        adminDashboard.adminBlogSection.click();
        ReusableMethods.wait(3);

        //6. Click on the "Blogs" link.
        adminDashboard.adminBlogs.click();

        //7. Verify that you are on the Blogs page.
        Assert.assertTrue(adminDashboard.adminBlogView.isDisplayed());
        extentTest.pass("We went to the -Blog Section- and the Blog Section of the admin panel..");
        ReusableMethods.wait(3);

        Driver.closeDriver();

    }

    //TC_03. Verify that the "Add New Blog Post" button is accessible, that the blog form page exists and is fillable,
    // that the newly added blog post appears in the list of available blog posts.
    @Test
    public void us29_test03() {
        adminDashboard=new Admin_Dashboard();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US29 - TC_03. A -New Blog Post- should be able to be created and saved.");
        //1. Start the browser.
        //2. As an administrator, type the URL "https://qa.tripandway.com/admin/login" into the browser and press enter.
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //3. Enter the e-mail and password with administrator authority in the corresponding fields.
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));
        //4. Click the "Login" button.
        adminDashboard.adminLoginButton.click();

        //5. Click the "Blog Section" link in the admin panel.
        adminDashboard.adminBlogSection.click();

        //6. Click on the "Blogs" link.
        adminDashboard.adminBlogs.click();

        //7. Find the "+Add New" icon/button and click on it.
        adminDashboard.adminBlogsAddNew.click();
        extentTest.info("Add New Blog icon is working.");

        //8. Verify that the "Add Blog" form or page is displayed.
        Assert.assertTrue(adminDashboard.adminAddBlogTitle.isDisplayed());
        extentTest.pass("Add Blog Form is opened for creating");


        //9. Fill in the following form fields:
        //A. Enter the Blog Title.
        actions.click(adminDashboard.adminBlogsBlogTitle)
                .sendKeys(ConfigReader.getProperty("blogTitle"))
                .sendKeys(Keys.TAB)
                //B. Enter the Blog Slug.
                .sendKeys(ConfigReader.getProperty("blogSlug"))
                .sendKeys(Keys.TAB)
                //C. Enter the Blog Content.
                .sendKeys(ConfigReader.getProperty("blogContent"))
                .sendKeys(Keys.TAB)
                //D. Enter the Blog Brief Content.
                .sendKeys(ConfigReader.getProperty("blogBriefContent"))
                .perform();
        //E. Upload the Blog Photo.

        String herkesteFarkliOlan=System.getProperty("user.dir");
        String herkesteAyniOlan="/raporlar/Screenshots/ankakusu.png";
        String dosyaYolu= herkesteFarkliOlan+herkesteAyniOlan;
        adminDashboard.adminBlogChooseFileButonu.sendKeys(dosyaYolu);
        ReusableMethods.wait(3);
        extentTest.info("Blog Photo added.");

                //F. Select a Category from the available options.
                Select select=new Select(adminDashboard.adminSelectCategory);
                select.selectByValue("4");
                ReusableMethods.wait(3);

                //G. Choose whether to show the comment or not.(Show Comment)
                 select=new Select(adminDashboard.adminShowComment);
                 select.selectByValue("No");
                 ReusableMethods.wait(3);

                //H. Decide whether to email subscribers.KAPATILMIŞ...
                //I. Enter the SEO Information Title.
                actions.click(adminDashboard.adminSEOInformationTitle)
                .sendKeys(ConfigReader.getProperty("SEOInformationTitle"))
                .sendKeys(Keys.TAB)
                 //J. Enter the Meta Description.
                .sendKeys(ConfigReader.getProperty("metaDescription"))
                .sendKeys(Keys.TAB)
                .perform();



        //adminDashboard.adminBlogChooseFileButonu.sendKeys(ConfigReader.getProperty("dosyaYolu"));
        //chooseFileButonu.sendKeys(dosyaYolu);

        //10. Click the Submit button.
        adminDashboard.adminBlogSubmitButonu.click();
        ReusableMethods.wait(3);

        //11. Verify that the new Blog post has been successfully created and saved.
        Assert.assertTrue(adminDashboard.toastmessage.isDisplayed());
        extentTest.pass("-New Blog Post- created and saved.");

        Driver.closeDriver();

    }

    //TC_04. Verify that a blog post has been edited.
    @Test
    public void us29_test04() {
        adminDashboard=new Admin_Dashboard();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US29 - TC_04. The existing blog post must be editable.");

        //1. Start the browser.
        //2. As an administrator, type the URL "https://qa.tripandway.com/admin/login" into the browser and press enter.
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));
        //3. Enter the e-mail and password with administrator authority in the corresponding fields.
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));
        //4. Click the "Login" button.
        adminDashboard.adminLoginButton.click();
        //5. Click the "Blog Section" link in the admin panel.
        adminDashboard.adminBlogSection.click();
        //6. Click on the "Blogs" link.
        adminDashboard.adminBlogs.click();
        //7. Identify a specific blog post that needs to be edited from the list and click the "Edit"
        // button corresponding to the selected blog post.
        adminDashboard.adminBlogEditButonu.click();
        extentTest.info("Edit Blog icon is working.");
        ReusableMethods.wait(3);
        //8. Make changes to the following form fields:
        //A. Change the Blog Title.
        actions.click(adminDashboard.adminBlogsBlogTitle)
                .sendKeys(ConfigReader.getProperty("blogTitleEdit"))
                .sendKeys(Keys.TAB)
        //B. Change the Blog Slug.
                .sendKeys(ConfigReader.getProperty("blogSlugEdit"))
                .sendKeys(Keys.TAB)
        //C. Modify the Blog Content.
                .sendKeys(ConfigReader.getProperty("blogContentEdit"))
                .sendKeys(Keys.TAB)
        //D. Change the Blog Short Content.
                .sendKeys(ConfigReader.getProperty("blogBriefContentEdit"))
                .perform();

        //E. Reload the Blog Photo as a different.
        String herkesteFarkliOlan=System.getProperty("user.dir");
        String herkesteAyniOlan="/raporlar/Screenshots/ankaHotel.png";
        String dosyaYolu= herkesteFarkliOlan+herkesteAyniOlan;
        adminDashboard.adminBlogChooseFileButonu.sendKeys(dosyaYolu);
        extentTest.info("Blog Edit Photo changed.");
        ReusableMethods.wait(3);

        //F. Change Existing Category.
        Select select=new Select(adminDashboard.adminSelectCategory);
        select.selectByValue("5");
        ReusableMethods.wait(3);
        //G. Change whether to show the comment.
        select=new Select(adminDashboard.adminShowComment);
        select.selectByValue("Yes");
        ReusableMethods.wait(3);

        //H. Change the current state of whether to send emails to subscribers.KAPATILMIŞ...
        //I. Change the SEO Information Title.
        actions.click(adminDashboard.adminSEOInformationTitle)
                .sendKeys(ConfigReader.getProperty("SEOInformationTitleEdit"))
                .sendKeys(Keys.TAB)
        //J. Change the Meta Description.
                .sendKeys(ConfigReader.getProperty("metaDescriptionEdit"))
                .sendKeys(Keys.TAB)
                .perform();
        //9.Click the "Update" button to save the changes.
        adminDashboard.adminBlogUpdate.click();

        //10. Verify that the edited Blog post has been successfully created and saved.
        Assert.assertTrue(adminDashboard.toastmessage.isDisplayed());
        extentTest.pass("Edited existing blog post.");

        Driver.closeDriver();
    }

    //TC_05. Verify that a blog post has been deleted and any changes made are reflected in the list of blog posts.
    @Test
    public void us29_test05() {
        adminDashboard=new Admin_Dashboard();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US29 - TC_05. The current blog post should be able to be deleted.");
        //1. Start the browser.
        //2. As an administrator, type the URL "https://qa.tripandway.com/admin/login" into the browser and press enter.
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //3. Enter the e-mail and password with administrator authority in the corresponding fields.
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        //4. Click the "Login" button.
        adminDashboard.adminLoginButton.click();

        //5. Click the "Blog Section" link in the admin panel.
        adminDashboard.adminBlogSection.click();

        //6. Click on the "Blogs" link.
        adminDashboard.adminBlogs.click();

        //silinen blog yazisinin listeden silindiğini görmek için
        //Blog sayılarını içeren SONUC YAZISINI kullandık. 9. madde ile tamamlayıcı işlem.
        String expectedSonucYazisi=adminDashboard.adminSonucSayisi.getText();

        //7. Identify a specific blog post that needs to be deleted from the list of blog posts and
        // click the "Delete" button corresponding to the selected blog post.
        adminDashboard.adminDeleteButonu.click();
        extentTest.info("Delete Blog icon is working.");

        //8. To continue the deletion process; Click the "Confirm" or "Delete" button in the delete confirmation dialog.
        //driver.switchTo().alert().accept();
        Driver.getDriver().switchTo().alert().accept();

        //9. Verify that the deleted blog post no longer appears in the list of available blog posts.
        String actualSonucYazisi=adminDashboard.adminSonucSayisi.getText();
        Assert.assertNotEquals(expectedSonucYazisi,actualSonucYazisi);
        extentTest.pass("The current blog post has been deleted.");
        Driver.closeDriver();
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //US_030 : After logging in as an admin, I should be able to verify that the destination
    // I added can be edited by adding a new destination to the Destinations section

    //TC_01. Verify accessibility of admin panel, successful login with valid
    // credentials and presence of specific item in admin panel.
    @Test
    public void us30_test01() {
        adminDashboard=new Admin_Dashboard();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US30 - TC_01. Successful login of the admin panel should be possible.");

        //1. Start the browser.
        //2. As an administrator, type the URL "https://qa.tripandway.com/admin/login" into the browser and press enter.
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //3. Enter the e-mail and password with administrator authority in the corresponding fields.
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        //4. Click the "Login" button.
        adminDashboard.adminLoginButton.click();
        extentTest.info("Signed In.");
        ReusableMethods.wait(3);

        //5. Verify that the admin user has successfully logged in by checking
        // the existence of a specific item on the admin panel page.
        Assert.assertTrue(adminDashboard.adminLoginVerification.isEnabled());
        extentTest.pass("Successful login of admin panel.");

        Driver.closeDriver();
    }

     //TC_02. Verify that you have navigated to "Destinations" of the admin panel
    @Test
    public void us30_test02(){
        adminDashboard=new Admin_Dashboard();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US30 - TC_02. It should be possible to go to the -Destinations Section- of the admin panel.");
        //1. Start the browser.
        //2. As an administrator, type the URL "https://qa.tripandway.com/admin/login" into the browser and press enter.
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //3. Enter the e-mail and password with administrator authority in the corresponding fields.
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        //4. Click the "Login" button.
        adminDashboard.adminLoginButton.click();
        ReusableMethods.wait(3);

        //5. Click the "Destinations" link in the admin panel.
        adminDashboard.adminDestinations.click();

        //6. Verify that you are on the Destinations page.
        Assert.assertTrue(adminDashboard.adminDestinationsView.isDisplayed());
        extentTest.pass("We went to the -Blog Section- and the Blog Section of the admin panel.");
        ReusableMethods.wait(3);

        Driver.closeDriver();

    }
        //TC_03. Verify the "Add New Destinations Post" button is accessible,
    // the Destinations form page exists and is fillable,
    // verify that the newly added Destinations post appears in the list of available Destinations posts.
    @Test
    public void us30_test03() {
        adminDashboard=new Admin_Dashboard();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US30 - TC_03. A New Destinations Post should be able to be created and saved.");
        //1. Start the browser.
        //2. As an administrator, type the URL "https://qa.tripandway.com/admin/login" into the browser and press enter.
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //3. Enter the e-mail and password with administrator authority in the corresponding fields.
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        //4. Click the "Login" button.
        adminDashboard.adminLoginButton.click();
        ReusableMethods.wait(3);

        //5. Click the "Destinations" link in the admin panel.
        adminDashboard.adminDestinations.click();

        //6. Find the "+Add New" icon/button and click on it.
        adminDashboard.adminDestinationsAddNew.click();

        //7. Verify that the "Add Destinations" form or page is displayed.
        Assert.assertTrue(adminDashboard.adminAddDestinationsTitle.isDisplayed());
        extentTest.pass("Add Destinations Form is opened for creating");

        //8. Fill in the following form fields:
        //A. Enter the Name.
        actions.click(adminDashboard.adminDestinationsName)
                .sendKeys(ConfigReader.getProperty("destinationsName"))
                .sendKeys(Keys.TAB)
                //B. Enter Slug.
                .sendKeys(ConfigReader.getProperty("destinationsSlug"))
                .sendKeys(Keys.TAB)
                //C. Enter Heading.
                .sendKeys(ConfigReader.getProperty("destinationsHeading"))
                .sendKeys(Keys.TAB)
                //D. Enter Short Description.
                .sendKeys(ConfigReader.getProperty("destinationsShortDescription"))
                .sendKeys(Keys.TAB)
                //E. Enter Package Heading.
                .sendKeys(ConfigReader.getProperty("destinationsPackageHeading"))
                .sendKeys(Keys.TAB)
                //F. Enter Package Subheading.
                .sendKeys(ConfigReader.getProperty("destinationsPackageSubheading"))
                .sendKeys(Keys.TAB)
                //G. Enter Detail Heading.
                .sendKeys(ConfigReader.getProperty("destinationsDetailHeading"))
                .sendKeys(Keys.TAB)
                //H. Enter Detail Subheading.
                .sendKeys(ConfigReader.getProperty("destinationsDetailSubheading"))
                .sendKeys(Keys.TAB)

                .perform();


                   //I. Upload photo.
        String herkesteFarkliOlan=System.getProperty("user.dir");
        String herkesteAyniOlan="/raporlar/Screenshots/ankakusu.png";
        String dosyaYolu= herkesteFarkliOlan+herkesteAyniOlan;
        adminDashboard.adminDestinationsChooseFileButonu.sendKeys(dosyaYolu);
        extentTest.info("Destinations Photo added.");
        ReusableMethods.wait(3);

        //J. Enter Introduction.
        actions.click(adminDashboard.adminDestinationsIntroduction)
                .sendKeys(ConfigReader.getProperty("destinationsIntroduction"))
                .sendKeys(Keys.TAB)
        //Enter K. Experience.
                .sendKeys(ConfigReader.getProperty("destinationsExperience"))
                .sendKeys(Keys.TAB)
        //Enter L. Weather.
                .sendKeys(ConfigReader.getProperty("destinationsWeather"))
                .sendKeys(Keys.TAB)
        //Enter M. Hotel.
                .sendKeys(ConfigReader.getProperty("destinationsHotel"))
                .sendKeys(Keys.TAB)
        //Enter N. Transportation.
                .sendKeys(ConfigReader.getProperty("destinationsTransportation"))
                .sendKeys(Keys.TAB)
        //Enter O.Culture.
                .sendKeys(ConfigReader.getProperty("destinationsCulture"))
                .sendKeys(Keys.TAB)
        //P. Enter Title.
                .sendKeys(ConfigReader.getProperty("destinationsSEOInformationTitle"))
                .sendKeys(Keys.TAB)
        //J. Enter the Meta Description.
                .sendKeys(ConfigReader.getProperty("destinationsMetaDescription"))
                .sendKeys(Keys.TAB)
                .perform();
        ReusableMethods.wait(3);
        //9. Click the Submit button.
        adminDashboard.adminDestinationsSubmitButton.click();

        //10. Verify that the new Destinations post has been successfully created and saved.
        Assert.assertTrue(adminDashboard.toastmessage.isDisplayed());
        extentTest.pass("New Destinations Post created and saved.");

        Driver.closeDriver();

    }

    //TC_04. Verify that a Destinations post has been edited.
    @Test
    public void us30_test04() {
        adminDashboard=new Admin_Dashboard();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US30 - TC_04. Existing Destinations post must be editable.");

        //1. Start the browser.
        //2. As an administrator, type the URL "https://qa.tripandway.com/admin/login" into the browser and press enter.
        Driver.getDriver().get(ConfigReader.getProperty("qaAdminUrl"));

        //3. Enter the e-mail and password with administrator authority in the corresponding fields.
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("qaAdminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("qaAdminPassword"));

        //4. Click the "Login" button.
        adminDashboard.adminLoginButton.click();
        ReusableMethods.wait(3);

        //5. Click the "Destinations" link in the admin panel.
        adminDashboard.adminDestinations.click();

        //6. Identify a specific Destinations post that needs to be edited from the list
        // and click the "Edit" button corresponding to the Selected Destinations post.
        adminDashboard.adminDestinationsEditButton.click();
        extentTest.info("Edit Destinations icon is working.");

        //7. Make changes to the following form fields:
        //A. Change the name.
        adminDashboard.adminDestinationsName.clear();
        actions.click(adminDashboard.adminDestinationsName)
                .sendKeys(ConfigReader.getProperty("destinationsNameEdit"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.CLEAR)
                //B. Replace the slug.
                .sendKeys(ConfigReader.getProperty("destinationsSlugEdit"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.CLEAR)
                //C. Change the Heading.
                .sendKeys(ConfigReader.getProperty("destinationsHeadingEdit"))
                //D. Change the Short Description.
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.CLEAR)
                .sendKeys(ConfigReader.getProperty("destinationsShortDescriptionEdit"))
                //E. Change Package Heading.
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.CLEAR)
                .sendKeys(ConfigReader.getProperty("destinationsPackageHeadingEdit"))
                //F. Change Package Subheading.
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.CLEAR)
                .sendKeys(ConfigReader.getProperty("destinationsPackageSubheadingEdit"))
                //G. Change the Detail Heading.
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.CLEAR)
                .sendKeys(ConfigReader.getProperty("destinationsDetailHeadingEdit"))
                //Replace H. Detail Subheading.
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.CLEAR)
                .sendKeys(ConfigReader.getProperty("destinationsDetailSubheadingEdit"))

                .perform();
        //I. Replace the current photo.
        String herkesteFarkliOlan=System.getProperty("user.dir");
        String herkesteAyniOlan="/raporlar/Screenshots/ankaHotel.png";
        String dosyaYolu= herkesteFarkliOlan+herkesteAyniOlan;
        adminDashboard.adminDestinationsChooseFileButonu.sendKeys(dosyaYolu);
        extentTest.info("Destinations Edit Photo changed.");
        ReusableMethods.wait(3);

        //J. Modify Introduction.
        adminDashboard.adminDestinationsIntroduction.clear();
        actions.click(adminDashboard.adminDestinationsIntroduction)
                .sendKeys(ConfigReader.getProperty("destinationsIntroductionEdit"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.CLEAR)
        //Change K. Experience.
                .sendKeys(ConfigReader.getProperty("destinationsExperienceEdit"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.CLEAR)
        //Change L. Weather.
                .sendKeys(ConfigReader.getProperty("destinationsWeatherEdit"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.CLEAR)
        //Change M. Hotel.
                .sendKeys(ConfigReader.getProperty("destinationsHotelEdit"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.CLEAR)

        //N. Change Transportation.
                .sendKeys(ConfigReader.getProperty("destinationsTransportationEdit"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.CLEAR)

        //Change O. Culture.
                .sendKeys(ConfigReader.getProperty("destinationsCultureEdit"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.CLEAR)

        //P. Change the title.
                .sendKeys(ConfigReader.getProperty("destinationsSEOInformationTitleEdit"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.CLEAR)

        //J. Change the Meta Description.
                .sendKeys(ConfigReader.getProperty("destinationsMetaDescriptionEdit"))
                .perform();
        ReusableMethods.wait(3);


        //8. Click the "Update" button to save the changes.
        adminDashboard.adminDestinationsUpdate.click();

        //9. Verify that the edited Destinations post has been successfully created and saved.
        Assert.assertTrue(adminDashboard.toastmessage.isDisplayed());
        extentTest.pass("Edited existing Destinations post.");

        Driver.closeDriver();

    }



}
