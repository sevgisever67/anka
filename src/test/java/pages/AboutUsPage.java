package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AboutUsPage extends MainPage {


    @FindBy(xpath = "//div[@class='banner-text']")
    public WebElement aboutBunner;   //About us sekmesine tıklandığında çıkan Resmin locate'i

    @FindBy(xpath = "//button[.='ACCEPT']")
    public WebElement cookies;            // About Us sayafasındaki cooikes

    @FindBy(xpath = "//h3[.='OUR MISSION']")
    public WebElement OurMissiontitle;     //About Us tıklandığındaOur Mission ögesinin locati

    @FindBy(xpath = "//h3[.='OUR VISION']")
    public WebElement OurVision;       //About Us tıklandığındaOur Vision ögesinin locati

}



