package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {



    @FindBy(xpath = "(//a[text()='Home'])[2]")
    public WebElement homeElementi;    //main page Home sekmesi

    @FindBy(xpath = "(//a[text()='Services'])[2]")
    public WebElement servicesElementi;  //Main Page Services sekmesi

    @FindBy(xpath = "(//a[text()='Destinations'])[2]")
    public WebElement destinationElementi;  //Main Page Destination sekmesi

    @FindBy(xpath = "(//a[text()='Packages'])[2]")
    public WebElement packageElementi;      //Main page Package sekmesi

    @FindBy(xpath = "(//a[text()='About Us'])[2]")
    public WebElement aboutUsElemnti;      //Main Page About Us sekmesi

    @FindBy(xpath = "(//a[text()='FAQ'])[2]")
    public WebElement fqaElementi;    //Main page FQA sekmesi

    @FindBy(xpath = "(//a[text()='Blog'])[2]")
    public WebElement blogElementi;   //MainPage Blog sekmesi

    @FindBy(xpath = "(//a[text()='Contact'])[2]")
    public WebElement contactElementi;        //Main Page Contact sekmesi

    @FindBy(xpath = "//*[text()='Terms and Conditions']")
    public WebElement termAndConditionsElementi;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement acceptButonu;

    @FindBy(xpath = "//*[text()='Privacy Policy']")
    public WebElement privacyPolicyElementi;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[2]/a")
    public WebElement iconServices;

    @FindBy (xpath = "//h4[text()='International Tour']")
    public WebElement iconInternationalTour;

    @FindBy (xpath = "//h4[text()='Adventure Tour']")
    public WebElement iconAdventureTour;

    @FindBy (xpath = "//h4[text()='Culture Tour']")
    public WebElement iconCultureTour;

    @FindBy (xpath = "//h4[text()='Bussiness Tour']")
    public WebElement iconBussinessTour;

    @FindBy (xpath = "//h4[text()='Health Tour']")
    public WebElement iconHealthTour;

    @FindBy (xpath = "//h4[text()='Religious Tour']")
    public WebElement iconReligiousTour;




}
