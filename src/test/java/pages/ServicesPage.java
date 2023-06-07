package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ServicesPage extends MainPage {
    @FindBy(xpath = "//*[text()='International Tour']")
    public WebElement tabInternationalTour;

    @FindBy(xpath = "//*[text()='Adventure Tour']")
    public WebElement tabAdventureTour;

    @FindBy(xpath = "//*[text()='Culture Tour']")
    public WebElement tabCultureTour;

    @FindBy(xpath = "//*[text()='Bussiness Tour']")
    public WebElement tabBussinessTour;
    @FindBy(xpath = "//*[text()='Health Tour']")
    public WebElement tabHealthTour;
    @FindBy(xpath = "//*[text()='Religious Tour']")
    public WebElement tabReligiousTour;


}
