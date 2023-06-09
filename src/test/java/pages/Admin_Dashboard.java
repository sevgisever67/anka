package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;
import java.util.logging.XMLFormatter;

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
    public WebElement adminViewSubscribersText;   // Admin Panel--> subscriber menüsünden AllSubscribers tıklayınca
                                                  // tüm haber listesi üyelerinin görüntülendiği sayfanın "View Subscribers" texti

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement adminProfileLogout;   // Admin olduktan sonra profil ikonunu tıklayınca "Logout" öğesi


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


    @FindBy(xpath = "//h1[@class='h3 mb-3 text-gray-800']")
    public WebElement adminDashboardTextiElementi;                      //admin girisi yaptıktan sonra  DasboardTezti Elementi

    @FindBy(xpath = "//a[text()='Blogs']")
    public WebElement adminBlogsButton;          //BlogSectionButton Blogs buttonu


    @FindBy(xpath = "//span[.='Destinations']")
    public  WebElement adminDestinatiobButton;    // Yönetici panelinde "Destinations" bağlantısı

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement adminAddNewButton;

    @FindBy(xpath = "//input[@name='d_name']")
    public WebElement adminNameBox;
    @FindBy(xpath = "//input[@name='d_slug']")
    public WebElement adminSlugBox;

    @FindBy(xpath = "//input[@name='d_heading']")
    public WebElement adminHeadingBox;          //heading locate

    @FindBy(xpath = "//textarea[@name='d_short_description']")
    public WebElement adminShortdescriptionLocate;           //short descriptionLocate;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement adminSonenAlert;








    @FindBy(xpath = "//a[@class='dropdown-item'][2]")//admin olarak giriş yaptıktan sonra icona tıklandığında
    public WebElement adminChangePhoto;             //görünen Change Photo linki


    @FindBy(xpath = "//button[@class='rounded-circle border-0']")//admin olarak giriş yaptıktan sonra sayfada
    public WebElement adminOkIsareti;                           //görünen ok işareti


    @FindBy(xpath = "//div[@class='sidebar-brand-text mx-3']")//admin olarak giriş yaptıktan sonra sayfada
    public WebElement adminADMINPANELYazisi;                       //görünen ADMIN PANEL yazısı

    @FindBy (xpath = "//a[@class='btn btn-info btn-sm mt-3']")//admin olarak giriş yaptıktan sonra sayfada
    public WebElement adminVisitWebsiteButonu;               //görünen Visit Website butonu

   @FindBy(xpath = "//h1[@class='h3 mb-3 text-gray-800']")
    public WebElement DashboardYazisi;

   @FindBy(xpath = "//span[.='Blog Section']")
    public WebElement blogSectionButton;

   @FindBy(xpath = "//a[.='Blogs']")
    public WebElement blogButton;





    @FindBy (xpath = "(//a[@class ='btn btn-warning btn-sm'])[5]")   //admin giris yaptıktan sonra "Blog Section" menusunden
    public WebElement adminBlogSectionEditButton;                   // "Category" ekledikten sonra "Edit" butonu


    @FindBy (xpath = "(//i[@class ='fas fa-trash-alt'])[5]")        //admin giris yaptıktan sonra "Blog Section" menusunden
    public  WebElement adminBlogSectionDeleteButton;                // "Category" ekledikten sonra "Delete" butonu

    @FindBy (xpath ="//div[@class ='toast-message']")             //admin giris yaptıktan sonra "Blog Section" menusunden
    public WebElement adminEditToastMessage;                      // "Category" ekledikten sonra "Edit" butonuna tıklayip
                                                                 // upgrade ettikten sonra cikan pop-up yazisi

    @FindBy (xpath = "//button[@class ='btn btn-success']")         //admin giris yaptıktan sonra "Blog Section" menusunden
    public WebElement adminBlogSectionCategoriesEditUpgradeButton;  // "Category" ekledikten sonra "Edit" butonuna tıklayip
                                                                    // güncelleme yaptıktan sonra "Upgrade" butonu
    @FindBy (xpath = "//div[@class = 'toast-message']")
    public WebElement adminDeleteToastMessage;                     //admin giris yaptıktan sonra "Blog Section" menusunden
                                                                  // "Category" ekledikten sonra "Delete" butonuna tıklayip
                                                                 // delete 'den sonra cikan pop up yazisi
}
  ////h6[text()='View Subscribers']