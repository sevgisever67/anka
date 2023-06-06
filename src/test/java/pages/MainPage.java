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


    @FindBy(xpath = "//a[.='Registration']")
    public WebElement registrationButton; // Main Page Registration sekmesi


    @FindBy (xpath = "//input[@name='traveller_name']")
    public WebElement registrationName; // Main Page registration Name button

    @FindBy (xpath = "//button[@tabindex='0']")
    public WebElement registrationCookies;  // Main Page registration cookies

    @FindBy (xpath = "//input[@name='traveller_email']")
    public WebElement registrationEmailAddress;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement registrationPassword;

    @FindBy(xpath = "//button[.='Make Registration']")
    public WebElement makeRegistrationButton;

    @FindBy(xpath = "//a[.='Login']")
    public WebElement loginButton;  // Main Page Login Butonu

    @FindBy(xpath = "//button[@name='form1']")
    public WebElement loginSubmitButton;   // Email adres ve password girildikten sonraki Login buttonu


    @FindBy(xpath = "(//p[text()='202-456-3789'])[1]")
    public WebElement ziyaretciSirketTelefonNo;  //Ziyaretci olarak giriş yapıldığında sol üstteki telefon nosu

    @FindBy(xpath ="//i[@class='fas fa-phone']")
    public WebElement ziyaretciTelefonIcon;    //Ziyaretci olarak giriş yapıldığında sol üstteki telefon ikonu





}
