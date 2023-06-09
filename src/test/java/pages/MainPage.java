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

    @FindBy(xpath = "//*[@id=\"menu\"]/li[3]/a")
    public WebElement iconDestinations;

    @FindBy (xpath = "//h4[text()='International Tour']")
    public WebElement iconInternationalTour;

    @FindBy (xpath = "//h4[text()='Adventure Tour']")
    public WebElement iconAdventureTour;

    @FindBy (xpath = "//h4[text()='Culture Tour']")
    public WebElement iconCultureTour;

    @FindBy (xpath = "(//*[@class='col-md-4 col-xs-6 clear-three wow fadeIn'])[4]")
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

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div/p[2]/i")
    public WebElement ziyaretciIInfo;   //Ziyaretci olarak giriş yapıldığında sol üstteki info texti

    @FindBy(xpath = "(//i[@class='far fa-envelope'])[1]")
    public WebElement ziyaretciMailIconu;   //Ziyaretci olarak giriş yapıldığında sol üstteki mail ikonu
    @FindBy(xpath="//div[@class='footer-item mt_30']//a[contains(text(),'3 days in Buenos Aires')]")
    public WebElement featuredPackagestFirstElement;
    @FindBy(xpath="//div[@class='footer-item mt_30']//a[contains(text(),'10 days in Buenos Aires')]")
    public WebElement featuredPackagesSecondElement;

    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInLeft']//a[contains(text(),'3 days in Bangkok')]")
    public WebElement featuredPackagesThirdElement;
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInLeft']//a[contains(text(),'7 days in Salina Island')]")
    public WebElement featuredPackagesFourthElement;

    @FindBy(xpath ="//div[@class='col-md-3 col-sm-6 wow fadeIn']//a[contains(text(),'New Test Packages')]")
    public WebElement latestPackagesFirstElement;
    @FindBy(xpath="//a[normalize-space()='test04']" )
    public WebElement latesPackagesSecondElement;
    @FindBy(xpath ="//a[normalize-space()='5 Day California']")
    public WebElement latesPackagesThirdElement;
    @FindBy(xpath="//div[@class='col-md-3 col-sm-6 wow fadeIn']//a[contains(text(),'7 days in Salina Island')]")

    public WebElement latesPackagesFourthElement;
    @FindBy(xpath="//div[@class='col-md-3 col-sm-6 wow fadeIn']//a[contains(text(),'3 days in Bangkok')]")
    public WebElement latesPackagesFifthElement;

    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[normalize-space()='Amazing Place'])")
    public WebElement recentPostFirstElement;

     @FindBy(xpath = "//div[@class='footer-item mt_30']//a[contains(text(),'Discovering Greenville: A Hidden Gem in South Caro')]")
    public WebElement recentPostSecondElement;
    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[normalize-space()='Buenos Aires: The Paris of South America']")
    public WebElement recentPostThirdElement;
    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[normalize-space()='Bangkok: A City of Contrasts']")
    public WebElement recentPostFourthElement;
    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[normalize-space()='Salina Island: A Perfect Family Getaway']")
    public WebElement recentPostFifthElement;






}
