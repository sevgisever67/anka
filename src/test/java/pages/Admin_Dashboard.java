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

    // US29 Locate'leri
    //TC01
    @FindBy (xpath = "//div[@class='sidebar-brand-text mx-3']")
    public WebElement adminLoginVerification;

    //TC02
    @FindBy(xpath = "(//a[@class='nav-link collapsed'])[4]")
    public WebElement adminBlogSection;

    @FindBy (xpath = "(//a[@class='collapse-item'])[4]")
    public WebElement adminBlogs;

    @FindBy (xpath = "//h6[@class='m-0 mt-2 font-weight-bold text-primary']")
    public WebElement adminBlogView;

    //TC03
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])")
    public WebElement adminBlogsAddNew;

    @FindBy (xpath = "(//h6[@class='m-0 mt-2 font-weight-bold text-primary'])")
    public WebElement adminAddBlogTitle;

    @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement adminBlogsBlogTitle;

    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement adminBlogsBlogSlug;

    @FindBy (xpath = "//input[@name='blog_photo']")
    public WebElement adminBlogChooseFileButonu;

    @FindBy (xpath = "//button[@class='btn btn-success']")
    public WebElement adminBlogSubmitButonu;


    @FindBy (xpath = "(//select[@class='form-control'])[1]")
    public WebElement adminSelectCategory;

    @FindBy (xpath = "(//select[@class='form-control'])[2]")
    public WebElement adminShowComment;

    @FindBy (xpath = "(//input[@class='form-control'])[3]")
    public WebElement adminSEOInformationTitle;

    @FindBy(xpath = "//div[@class='toast-progress']/..")
    public WebElement toastmessage;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement toastmessage2;

    //TC04

    @FindBy (xpath = "(//a[@class='btn btn-warning btn-sm'])[7]")
    public WebElement adminBlogEditButonu;


    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement adminBlogUpdate;

    //TC05

    @FindBy (xpath = "(//i[@class='fas fa-trash-alt'])[7]")
    public WebElement adminDeleteButonu;

    @FindBy (xpath = "//div[@class='dataTables_info']")
    public WebElement adminSonucSayisi;

    //US30
    //TC01
    //TC02

    @FindBy (xpath = "//span[text()='Destinations']")
    public WebElement adminDestinations;

    @FindBy (xpath = "//h6[@class='m-0 mt-2 font-weight-bold text-primary']")
    public WebElement adminDestinationsView;

    //TC03

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement adminDestinationsAddNew;

    @FindBy (xpath = "//h1[@class='h3 mb-3 text-gray-800']")
    public WebElement adminAddDestinationsTitle;

    @FindBy (xpath = "//input[@name='d_name']")
    public WebElement adminDestinationsName;

    @FindBy(xpath = "//input[@name='d_photo']")
    public WebElement adminDestinationsChooseFileButonu;

    @FindBy (xpath = "(//div[@class='note-editable card-block'])[1]")
    public WebElement adminDestinationsIntroduction;

    @FindBy (xpath = "//button[@class='btn btn-success']")
    public WebElement adminDestinationsSubmitButton;

    //TC04

    @FindBy (xpath = "(//a[@class='btn btn-warning btn-sm'])[8]")
    public WebElement adminDestinationsEditButton;

    //7. Verify that the details of the selected Destinations post are displayed in an editable format.
    @FindBy (xpath = "//h1[@class='h3 mb-3 text-gray-800']")
    public WebElement adminDestinationsEditTitle;


    @FindBy (xpath = "//button[@class='btn btn-success']")
    public WebElement adminDestinationsUpdate;










}
