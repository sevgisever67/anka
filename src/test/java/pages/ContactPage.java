package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage extends MainPage {

    @FindBy(xpath = "//input[@name='visitor_name']")
    public WebElement nameBox;      //Contact butonu tıklandığında Contact Form name locet i

    @FindBy(xpath = "//input[@name='visitor_phone']")
    public WebElement phoneBox;      //Contact butonu tıklandığında Contact Form telefon locet i
}
