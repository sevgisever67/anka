package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ContactPage extends MainPage {

    @FindBy(xpath = "//input[@name='visitor_name']")
    public WebElement visitorNameBox;      //Contact butonu tıklandığında Contact Form name locet i

    @FindBy(xpath = "//input[@name='visitor_phone']")
    public WebElement visitorPhoneBox;      //Contact butonu tıklandığında Contact Form telefon locet i

    @FindBy(xpath ="//input[@name='visitor_email']" )
    public WebElement visitorEmailAdressBox;

    @FindBy (xpath = "//textarea[@name='visitor_message']")
    public WebElement visitorMessageBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement visitorSubmitButton;

    @FindBy (xpath = "//h4[.='Contact Information']")
    public WebElement contactInformationTitle;

    @FindBy(xpath = "//div[@class='contact-text']")
    public List<WebElement> contactInformation;
    @FindBy(xpath = "//button[.='ACCEPT']")
    public WebElement contactCookies;

    @FindBy(xpath = "//div[@class='toast-progress']/..")
    public WebElement toastmessage;

    @FindBy(xpath = "(//h3[.='Address'])[1]")
    public WebElement contactInformationAddress;

    @FindBy(xpath = "(//h3[.='Email Address'])[1]")
    public WebElement contactInformationEmailAddress;

    @FindBy(xpath = "(//h3[.='Phone'])[1]")
    public WebElement contactInformationPhone;


}
