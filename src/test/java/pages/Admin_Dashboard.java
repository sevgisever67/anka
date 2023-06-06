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


}
