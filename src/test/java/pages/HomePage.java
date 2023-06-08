package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage extends MainPage {
    @FindBy (xpath = "//img[@alt='Logo']")
    public WebElement SiteLogo;

}