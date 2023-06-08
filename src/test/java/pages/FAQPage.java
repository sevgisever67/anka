package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FAQPage extends MainPage {
  @FindBy(xpath = "//div[@class='wpcc-compliance']")
    public WebElement faqCookies;    // FAQ daki cıkan cookies


}
