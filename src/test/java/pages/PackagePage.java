package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class PackagePage extends MainPage{

    @FindBy (xpath = "(//div[@class='photo-title'])[3]")
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


}
