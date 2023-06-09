package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class PackagePage extends MainPage{

    @FindBy (xpath = "(//div[@class='col-md-4 col-xs-6 clear-three wow fadeIn'])[3]")
    public WebElement user7daysInIstanbul;

    @FindBy (xpath = "(//div[@class='photo-title'])[3]")
    public WebElement userIstanbul;


    @FindBy (xpath = "//select[@id='numberPerson']")
    public WebElement userNumberPersonBox;

    @FindBy (xpath = "//span[@id='totalPrice']")
    public WebElement userTotalPrice;

    @FindBy (xpath = "//button[@class='btn btn-info btn-lg']")
    public WebElement userBookYourSeatButton;

    @FindBy (xpath = "//iframe[@class='stripe_checkout_app']")
    public WebElement iFrameBox;

    @FindBy (xpath = "//button[@class='stripe-button-el']") //
    public WebElement userPatwithCardButton;

    @FindBy (xpath = "(//input[@class='control'])[1]") //input[@placeholder='Card number'] //div[@class='cardNumberInput input top invalid']
    public WebElement userCardNumberBox;

    @FindBy (xpath = "//input[@id='cc-exp']")
    public  WebElement userCardDateBox;

    @FindBy (xpath = "//input[@id='cc-csc']")
    public WebElement userCardCvcBox;

    @FindBy (xpath = "//button[@id='submitButton']")
    public WebElement userPayButton;

    @FindBy (xpath = "(//input[@class='control'])[1]")
    public WebElement inputCardNum;

    @FindBy (xpath = "//input[@id='cc-exp']")
    public WebElement inputCartDate;

    @FindBy (xpath = "//input[@id='cc-csc']")
    public WebElement inputCartCvc;

    @FindBy (xpath= "//div[@class='col-md-9 col-sm-12 wow fadeIn']")
    public WebElement orderYazisi;

    @FindBy(xpath = "//*[@title='Next (Right arrow key)']")
    public WebElement visitorSagOkElementi;

    @FindBy(xpath = "//*[@title='Previous (Left arrow key)']")
    public WebElement visitorSolOkElementi;

    @FindBy(xpath = "//*[@title='Close (Esc)']")
    public WebElement visitorKapatmaElementi;
    @FindBy(xpath = "(//*[@class='photo-title'])[1]")
    public WebElement visitor3daysinBuenosAiresElementi;
    @FindBy(xpath = "(//*[@class='magnific'])[1]")
    public WebElement visitor3daysinBuenosAiresBuyutecElementi;
    @FindBy(xpath = "(//*[@class='photo-title'])[2]")
    public WebElement visitor10daysinBuenosAiresElementi;
    @FindBy(xpath = "(//*[@class='magnific'])[2]")
    public WebElement visitor10daysinBuenosAiresBuyutecElementi;
    @FindBy(xpath = "(//*[@class='photo-title'])[3]")
    public WebElement visitor7daysinIstanbulElementi;
    @FindBy(xpath = "(//*[@class='magnific'])[3]")
    public WebElement visitor7daysinIstanbulBuyutecElementi;
    @FindBy(xpath = "(//*[@class='photo-title'])[4]")
    public WebElement visitor3daysinBangkokElementi;
    @FindBy(xpath = "(//*[@class='magnific'])[4]")
    public WebElement visitor3daysinBangkokBuyutecElementi;
    @FindBy(xpath = "(//*[@class='photo-title'])[5]")
    public WebElement visitor7daysinSalinaIslandElementi;
    @FindBy(xpath = "(//*[@class='magnific'])[5]")
    public WebElement visitor7daysinSalinaIslandBuyutecElementi;
    @FindBy(xpath = "(//*[@class='photo-title'])[6]")
    public WebElement visitor5dayCaliforniaElementi;
    @FindBy(xpath = "(//*[@class='magnific'])[6]")
    public WebElement visitor5dayCaliforniaBuyutecElementi;


    // Profile edit
    @FindBy (xpath= "//a[text()='Update Profile']")
    public WebElement profileUpdate;

    @FindBy (xpath= "//input[@name='traveller_name']")
    public WebElement profileName;

    @FindBy (xpath= "//input[@name='traveller_phone']")
    public WebElement profilePhone;

    @FindBy (xpath= "//input[@name='traveller_country']")
    public WebElement profileCountry;

    @FindBy (xpath= "//input[@name='traveller_address']")
    public WebElement profileAddress;

    @FindBy (xpath= "//input[@name='traveller_city']")
    public WebElement profileCity;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement updateButton;

    @FindBy (xpath = "//div[@class='toast-message']")
    public WebElement updateSuccessMessage;

    // Update password

    @FindBy (xpath= "//a[text()='Update Password']")
    public WebElement updatePassword;

    @FindBy (xpath= "//input[@type='password']")
    public WebElement newPassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement updatePasswordButton;

    // Forget password

    @FindBy (xpath= "//a[@class='forget-password-link']")
    public WebElement forgetPassword;

    @FindBy (xpath= "//input[@name='traveller_email']")
    public WebElement forgetEmailField;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement forgetSubmitButton;

    @FindBy (xpath = "//div[@class='toast-message']")
    public WebElement checkEmailMessage;






    @FindBy (xpath = "(//div[.='Payment is successful!'])[3]")
    public WebElement alert;


}
