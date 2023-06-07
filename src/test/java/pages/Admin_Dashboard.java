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
    public WebElement adminAdmin25Profile;  // Sayfaya admin olarak giriş yaptıktan sonra
    // sağ üst kösedeki admin 25 yazan profil locate i

    @FindBy(xpath = "//div[@aria-labelledby='userDropdown']")
    public List<WebElement> adminAdmin25ProfileElement;      //admin olarak giriş yapıldıktan sonra
    // admin25 profilindeki drop down list

    @FindBy(xpath = "(//ul[@class='sf-menu sf-js-enabled sf-arrows'])/li")
    public List<WebElement> mainPageList;

    @FindBy(xpath = "//a[@class='dropdown-item'][2]")//admin olarak giriş yaptıktan sonra icona tıklandığında
    public WebElement adminChangePhoto;             //görünen Change Photo linki

    @FindBy(xpath = "//button[@class='rounded-circle border-0']")//admin olarak giriş yaptıktan sonra sayfada
    public WebElement adminOkIsareti;                           //görünen ok işareti


    @FindBy(xpath = "//div[@class='sidebar-brand-text mx-3']")//admin olarak giriş yaptıktan sonra sayfada
    public WebElement adminADMINPANELYazisi;                       //görünen ADMIN PANEL yazısı

    @FindBy (xpath = "//a[@class='btn btn-info btn-sm mt-3']")//admin olarak giriş yaptıktan sonra sayfada
    public WebElement adminVisitWebsiteButonu;               //görünen Visit Website butonu






}
