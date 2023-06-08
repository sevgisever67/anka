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
    public WebElement visitorEmailAdressBox; // Contact butonu tıklanıldığında Contact From Address locati

    @FindBy (xpath = "//textarea[@name='visitor_message']")
    public WebElement visitorMessageBox;     // Contact butonu tıklanıldığında Contact From Mesaj locati

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement visitorSubmitButton;  //Contact Form doldrulduktan sonraki Submit butonu locati

    @FindBy(xpath = "//button[.='ACCEPT']")
    public WebElement contactCookies;       // contact ta çıkan cookies ın locati

    @FindBy(xpath = "//div[@class='toast-progress']/..")
    public WebElement toastmessage;         // Contact Form daki bilgileri girdikten sonra çıkan mesajın locati

    @FindBy(xpath = "(//h3[.='Address'])[1]")
    public WebElement contactInformationAddress;    // Contact Information da Adres butonu

    @FindBy(xpath = "(//h3[.='Email Address'])[1]")
    public WebElement contactInformationEmailAddress;  // Contact Information da Email Adress  butonu

    @FindBy(xpath = "(//h3[.='Phone'])[1]")
    public WebElement contactInformationPhone;  // Contact Information da Phone  butonu


}
