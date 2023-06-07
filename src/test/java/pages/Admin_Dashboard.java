package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Admin_Dashboard extends BasePage {


    @FindBy(xpath = "//span[text()='Subscriber']")       //dashboard sayfası subscriber buttonu
    public WebElement adminSubscriberButton;

    @FindBy(xpath = "//a[text()='Send Email to Subscribers']") //dashboard sayfası Send email to subscriber buttonu
    public WebElement adminSendEmailToSubscriber;

    @FindBy(xpath = "//input[@name='subject']") //Send Email to Subscribers sayfası mail konu balığı kutusu
    public WebElement adminSubjectBox;

    @FindBy(xpath = "//div[@role='textbox']") //Send Email to Subscribers sayfası mesaj gönderme kutusu
    public WebElement adminMessageBox;

    @FindBy(xpath = "//button[text()='Send Email']")
    public WebElement adminSendEmailButton;      //Send Emeil To Subscriber Sayfası send email buttonu

    @FindBy(xpath = "//img[@class='img-profile rounded-circle']")
    public WebElement adminAdmin25Profile;   // Sayfaya admin olarak giriş yaptıktan sonra
                                             // sağ üst kösedeki admin 25 yazan profil locate i

    @FindBy(xpath = "//div[@aria-labelledby='userDropdown']")
    public List<WebElement> adminAdmin25ProfileElement;      //admin olarak giriş yapıldıktan sonra
                                                             // admin25 profilindeki drop down list


    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement adminChangePassword;    //admin olarak giriş yaptıktan sonra profile tıklandığında görünen Change Password linki


    @FindBy(xpath = "//span[text()='Order']")   // Admin Panel'den "Order" menüsünün butonu
    public WebElement adminOrderButton;

    @FindBy(xpath = "(//a[@class='btn btn-success btn-sm btn-block'])[1]")
    public WebElement adminOrderDetailButton;   // Admin Panel'inden Order menüsünü tıkladıktan sonra
                                                // ilk siparişin "Detail" butonu

    @FindBy(xpath = "//h1[@class='h3 mb-3 text-gray-800']")
    public WebElement adminOrderDetailPageText;   // admin panel--> Order menüsünden ilk siparişin
                                                  // detayının görüntülendiği sayfanın "Order Detail" texti

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm btn-block'])[1]")
    public WebElement adminOrderInvoiceButton;  // Admin Panel'inden Order menüsünü tıkladıktan sonra
                                                // ilk siparişin "Invoice" butonu


    @FindBy(xpath = "//div[@class='card-header py-3']")
    public WebElement adminOrderInvoicePageText;   // admin panel--> Order menüsünden ilk siparişin
                                                  // faturasının görüntülendiği sayfanın "Order Invoice" texti

    @FindBy(xpath = "//a[text()='All Subscribers']") // Admin Panel--> subscriber menüsünden AllSubscribers butonu
    public WebElement adminAllSubscribersButton;

    @FindBy(xpath = "//h6[text()='View Subscribers']")
    public WebElement adminViewSubscribersText;


    @FindBy (xpath = "//span[text()='General Settings']")     //admin panelindeki "General Settings" menu butonu
    public WebElement adminGeneralSettingsButton;

    @FindBy (xpath = "//span[text()='Page Settings']")       // admin panelindeki "Page Settings" menu butonu
    public WebElement adminPageSettingsButton;

    @FindBy (xpath = "//span[text()='Payment Settings']")
    public WebElement adminPaymentSettingsButton;            // admin panelindeki "Payment Settings" menu butonu

    @FindBy (xpath = "(//li[@class = 'nav-item '])[7]")
    public WebElement adminDynamicPagesButton;              // admin panelindeki "Dynamic Pages" menu butonu

   @FindBy (xpath = "//span[text()='Language']")
    public WebElement adminLanguageButton;                 //admin panelindeki "Language" butonu

    @FindBy (xpath="//span[text()='Website Section']")
    public  WebElement adminWebsiteSectionButton;          // admin panelindeki "Website Section" menu butonu

    @FindBy (xpath="//span[text()='Email Template']")
    public  WebElement adminEmailTemplateButton;          // admin panelindeki "Email Template" butonu

    @FindBy (xpath = "//span[text()='Blog Section']")
    public  WebElement adminBlogSectionButton;       // admin panelindeki "Blog Section" menu butonu

    @FindBy (xpath = "(//a[@class ='collapse-item'])[3]")
    public WebElement adminBlogSectionCategoriesButton;     // admin panelindeki "Blog Section" bolumundaki
                                                            // "Categories" butonu


    @FindBy (xpath = "//div[@class = 'float-right d-inline']")
    public  WebElement blogSectionAddNewButton;                 // admin panelindeki "Blog Section" bolumundeki
                                                                // "+Add New" butonu

    @FindBy (xpath = "//input[@name ='category_name']")
    public WebElement blogSectionCategoryNameBox;         //admin giris yaptıktan sonra "Blog Section" menusunden
                                                          //"+Add New" butonuna tıkladiktan sonra "Category Name" kutusu
    @FindBy (xpath = "//input[@name ='category_slug']")
    public WebElement blogSectionCategorySlugBox;         //admin giris yaptıktan sonra "Blog Section" menusunden
                                                          // "+Add New" butonuna tıkladiktan sonra "Category Slug" kutusu


    @FindBy (xpath = "//input[@name ='seo_title']")
    public WebElement blogSectionTitleBox;               //admin giris yaptıktan sonra "Blog Section" menusunden
                                                         // "+Add New" butonuna tıkladiktan sonra "Title" kutusu

    @FindBy (xpath = "//textarea[@name ='seo_meta_description']")
    public WebElement blogSectionMetaDescriptionBox;               //admin giris yaptıktan sonra "Blog Section" menusunden
                                                                   // "+Add New" butonuna tıkladiktan sonra
                                                                   // "Meta Description" kutusu

    @FindBy (xpath = "//button[@type= 'submit']")                  //admin giris yaptıktan sonra "Blog Section" menusunden
    public WebElement adminBlogSectionSubmitButton;                // "+Add New" butonuna tıkladiktan sonra
                                                                   // "Submit" butonu



    @FindBy (xpath = "(//a[@class ='btn btn-warning btn-sm'])[5]")             //admin giris yaptıktan sonra "Blog Section" menusunden
    public WebElement adminBlogSectionEditButton;                   // "Category" ekledikten sonra "Edit" butonu


    @FindBy (xpath = "((//i[@class ='fas fa-trash-alt'])[5]")        //admin giris yaptıktan sonra "Blog Section" menusunden
    public  WebElement adminBlogSectionDeleteButton;                // "Category" ekledikten sonra "Delete" butonu


}
