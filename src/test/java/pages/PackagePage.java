package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class PackagePage extends MainPage{

    @FindBy (xpath = "(//div[@class='col-md-4 col-xs-6 clear-three wow fadeIn'])[3]")
    public WebElement user7daysInIstanbul;


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

    @FindBy (xpath= "//div[@class='col-md-9 col-sm-12 wow fadeIn']")
    public WebElement orderYazisi;

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









}
