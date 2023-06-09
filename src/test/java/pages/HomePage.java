package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MainPage {
    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement SiteLogo;


}