package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
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

    public WebElement contactElementi;        //Main Page Contact sekm

   // public WebElement contactElementi;        //Main Page Contact sekmesi


    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement SiteLogo;

    @FindBy(xpath = "//*[text()='Terms and Conditions']")
    public WebElement termAndConditionsElementi;
  
    @FindBy(xpath = "//*[@type='button']")
    public WebElement acceptButonu;

    @FindBy(xpath = "//*[text()='Privacy Policy']")
    public WebElement privacyPolicyElementi;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[2]/a")
    public WebElement iconServices;

    @FindBy(xpath = "//h4[text()='International Tour']")
    public WebElement iconInternationalTour;

    @FindBy(xpath = "//h4[text()='Adventure Tour']")
    public WebElement iconAdventureTour;

    @FindBy(xpath = "//h4[text()='Culture Tour']")
    public WebElement iconCultureTour;

    @FindBy(xpath = "//h4[text()='Bussiness Tour']")
    public WebElement iconBussinessTour;

    @FindBy(xpath = "//h4[text()='Health Tour']")
    public WebElement iconHealthTour;

    @FindBy(xpath = "//h4[text()='Religious Tour']")
    public WebElement iconReligiousTour;

    @FindBy(xpath = "//i[@class='fas fa-user-plus']")
    public WebElement registrationIcon;

    @FindBy(xpath = "//i[@class='fas fa-user-plus']")
    public WebElement registrationButton; // Main Page Registration sekmesi


    @FindBy(xpath = "//input[@name='traveller_name']")
    public WebElement registrationName; // Main Page registration Name button

    @FindBy(xpath = "//button[@tabindex='0']")
    public WebElement registrationCookies;  // Main Page registration cookies

    @FindBy(xpath = "//input[@name='traveller_email']")
    public WebElement registrationEmailAddress;  // Registration daki email adress butonu locati

    @FindBy(xpath = "//input[@type='password']")
    public WebElement registrationPassword;   // Registration daki name butonu locati

    @FindBy(xpath = "//button[.='Make Registration']")
    public WebElement makeRegistrationButton;  // Make Regisration butonu

    @FindBy(xpath = "//a[.='Login']")
    public WebElement loginButton;  // Main Page Login Butonu

    @FindBy(xpath = "//i[@class='fas fa-lock']")
    public WebElement loginIcon;

    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement tripandwayLogo;

    @FindBy(xpath = "//button[@name='form1']")
    public WebElement loginSubmitButton;   // Email adres ve password girildikten sonraki Login buttonu


    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement toastmessage2;   // Registration email ve pasword bilgileri başarılı girdikten sonra çıkan mesaj

    @FindBy(xpath = "(//p[text()='202-456-3789'])[1]")
    public WebElement ziyaretciSirketTelefonNo;  //Ziyaretci olarak giriş yapıldığında sol üstteki telefon nosu

    @FindBy(xpath = "//i[@class='fas fa-phone']")
    public WebElement ziyaretciTelefonIcon;    //Ziyaretci olarak giriş yapıldığında sol üstteki telefon ikonu

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div/p[2]/i")
    public WebElement ziyaretciIInfo;   //Ziyaretci olarak giriş yapıldığında sol üstteki info texti

    @FindBy(xpath = "(//i[@class='far fa-envelope'])[1]")
    public WebElement ziyaretciMailIconu;   //Ziyaretci olarak giriş yapıldığında sol üstteki mail ikonu
    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[contains(text(),'3 days in Buenos Aires')]")
    public WebElement featuredPackagestFirstElement;
    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[contains(text(),'10 days in Buenos Aires')]")
    public WebElement featuredPackagesSecondElement;

    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInLeft']//a[contains(text(),'3 days in Bangkok')]")
    public WebElement featuredPackagesThirdElement;
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInLeft']//a[contains(text(),'7 days in Salina Island')]")
    public WebElement featuredPackagesFourthElement;

    @FindBy(xpath ="//a[normalize-space()='3 Days Yorkville']")
    public WebElement latestPackagesFirstElement;
    @FindBy(xpath = "//a[normalize-space()='7 days in Esenyurt']")
    public WebElement latesPackagesSecondElement;
    @FindBy(xpath = "//a[normalize-space()='5 Day California']")
    public WebElement latesPackagesThirdElement;
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeIn']//a[contains(text(),'7 days in Salina Island')]")

    public WebElement latesPackagesFourthElement;
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeIn']//a[contains(text(),'3 days in Bangkok')]")
    public WebElement latesPackagesFifthElement;

    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[normalize-space()='ANKA']")
    public WebElement recentPostFirstElement;

    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[contains(text(),'Discovering Greenville: A Hidden Gem in South Caro')]")
    public WebElement recentPostSecondElement;
    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[normalize-space()='Buenos Aires: The Paris of South America']")
    public WebElement recentPostThirdElement;
    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[normalize-space()='Bangkok: A City of Contrasts']")
    public WebElement recentPostFourthElement;
    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[normalize-space()='Salina Island: A Perfect Family Getaway']")
    public WebElement recentPostFifthElement;

    @FindBy(xpath = "(//img[@alt='Blog Image'])[4]")
    public WebElement LatesBlogIstanbulPhotoElement;   // "LATEST BLOG" alanında "ISTANBUL: A FUSION OF EAST AND WEST" blog fotosu
    //img[@alt='Blog Image'])[4]
    @FindBy(xpath = "(//img[@alt='Blog Image'])[5]")
    public WebElement LatesBlogHittitesPhotoElement;   // "LATEST BLOG" alanında "DISCOVERING THE ANCIENT CAPITAL OF THE HITTITES: BOGAZKALE AND HATTUSAS" blog fotosu

    @FindBy(xpath = "(//img[@alt='Blog Image'])[6]")
    public WebElement LatesBlogSalinaIslandPhotoElement;   // "LATEST BLOG" alanında "SALINA ISLAND: A PERFECT FAMILY GETAWAY" blog fotosu

    @FindBy(xpath = "(//img[@alt='Blog Image'])[7]")
    public WebElement LatesBlogBangkokPhotoElement;  // "LATEST BLOG" alanında "BANGKOK: A CITY OF CONTRASTS" blog fotosu

    @FindBy(xpath = "(//img[@alt='Blog Image'])[8]")
    public WebElement LatesBlogBuenosAiresPhotoElement;  // "LATEST BLOG" alanında "BUENOS AIRES: THE PARIS OF SOUTH AMERICA" blog fotosu

    @FindBy(xpath = "(//img[@alt='Blog Image'])[9]")
    public WebElement LatesBlogGreenvillePhotoElement;  // "LATEST BLOG" alanında "DISCOVERING GREENVILLE: A HIDDEN GEM IN SOUTH CAROLINA" blog fotosu

    @FindBy(xpath = "(//a[@class='b-head'])[4]")
    public WebElement LatesBlogIstanbulTextElement;  // "LATEST BLOG" alanında "ISTANBUL: A FUSION OF EAST AND WEST" blog texti

    @FindBy(xpath = "(//a[@class='b-head'])[5]")
    public WebElement LatesBlogHittitesTextElement;  // "LATEST BLOG" alanında "DISCOVERING THE ANCIENT CAPITAL OF THE HITTITES: BOGAZKALE AND HATTUSAS" blog texti

    @FindBy(xpath = "(//a[@class='b-head'])[6]")
    public WebElement LatesBlogSalinaIslandTextElement; // "LATEST BLOG" alanında "SALINA ISLAND: A PERFECT FAMILY GETAWAY" blog texti

    @FindBy(xpath = "(//a[@class='b-head'])[7]")
    public WebElement LatesBlogBangkokTextElement; // "LATEST BLOG" alanında "BANGKOK: A CITY OF CONTRASTS" blog texti

    @FindBy(xpath = "(//a[@class='b-head'])[8]")
    public WebElement LatesBlogBuenosAiresTextElement; // "LATEST BLOG" alanında "BUENOS AIRES: THE PARIS OF SOUTH AMERICA" blog texti

    @FindBy(xpath = "(//a[@class='b-head'])[9]")
    public WebElement LatesBlogGreenvilleTextElement; // "LATEST BLOG" alanında "DISCOVERING GREENVILLE: A HIDDEN GEM IN SOUTH CAROLINA" blog texti

    @FindBy(xpath = "(//i[@class='fa fa-chevron-circle-right'])[4]")
    public WebElement LatesBlogIstanbulReadMoreButton;
    ////div[@class='button mt_15'])[4]

    @FindBy(xpath = "(//div[@class='button mt_15'])[5]")
    public WebElement LatesBlogHittitesReadMoreButton;

    @FindBy(xpath = "(//div[@class='button mt_15'])[6]")
    public WebElement LatesBlogSalinaIslandReadMoreButton;

    @FindBy(xpath = "(//div[@class='button mt_15'])[7]")
    public WebElement LatesBlogBangkokReadMoreButton;

    @FindBy(xpath = "(//div[@class='button mt_15'])[8]")
    public WebElement LatesBlogBuenosAiresReadMoreButton;

    @FindBy(xpath = "(//div[@class='button mt_15'])[9]")
    public WebElement LatesBlogGreenvilleReadMoreButton;

    @FindBy(xpath = "//div[@class='blog-area pt_80 pb_80']")
    public WebElement LatesBlog;

    @FindBy(xpath = "(//div[@class='brand-item wow fadeIn'])[1]")
    public WebElement OurClientEasyTicketPhotoElement;

    @FindBy(xpath = "(//div[@class='brand-item wow fadeIn'])[2]")
    public WebElement OurClientPassportPhotoElement;

    @FindBy(xpath = "(//div[@class='brand-item wow fadeIn'])[3]")
    public WebElement OurClientIcanActivitiesPhotoElement;

    @FindBy(xpath = "(//div[@class='brand-item wow fadeIn'])[4]")
    public WebElement OurClientParkmapPhotoElement;

    @FindBy(xpath = "(//div[@class='brand-item wow fadeIn'])[5]")
    public WebElement OurClientEasyFlyPhotoElement;

    @FindBy(xpath = "(//div[@class='brand-item wow fadeIn'])[6]")
    public WebElement OurClientBussinesIncreasePhotoElement;

    @FindBy(xpath = "(//div[@class='brand-item wow fadeIn'])[7]")
    public WebElement OurClientYachtseaPhotoElement;

    @FindBy(xpath = "//h2[text()='OUR CLIENT']")
    public WebElement ourclientYazisi;

    @FindBy(xpath = "//h3[text()='Address']")
    public WebElement footerAdressHeader; // >>Homepage >> Footer >>'Adress' section

    @FindBy(xpath = "(//div[@class='text'])[1]") // >>Homepage >> Footer >> Adress >> CompanyAdress
    public WebElement footerCompanyAdress;

    @FindBy(xpath = "(//div[@class='text'])[2]")   // >>Homepage >> Footer >> Adress >> CompanyPhoneNumber
    public WebElement footerCompanyPhoneNumber;

    @FindBy(xpath = "(//div[@class='text'])[3]")   // >>Homepage >> Footer >> Adress >> CompanyEmailAdress
    public WebElement footerCompanyEmailAdress;


    // Homepage >> Footer >> Social media icon's locaters

    @FindBy(xpath = "(//a[@href='http://www.facebook.com'])[1]")
    public WebElement FooterFacebookIconElement;

    @FindBy(xpath = "(//a[@href='http://www.facebook.com'])[2]")
    public WebElement FooterTwitterIconElement;

    @FindBy(xpath = "//a[@href='http://www.linkedin.com']")
    public WebElement FooterLinkedinIconElement;

    @FindBy(xpath = "//a[@href='https://twitter.com']")
    public WebElement FooterPinterestIconElement;

    @FindBy(xpath = "//a[@href='http://www.instagram.com']")
    public WebElement FooterInstagramIconElement;

    @FindBy(xpath = "//img[@alt='Logo']")










    public WebElement iconDestinations;

    @FindBy(xpath = "(//div[@class='slider-item'])[3]")
    public WebElement mainSlider1;

    @FindBy(xpath = "(//a[.='Read More'])[3]")
    public WebElement readMore1;

    @FindBy(xpath = "(//div[@class='owl-next'])[1]")
    public WebElement mainSliderNextButton;

    @FindBy(xpath = "(//div[@class='slider-item'])[4]")
    public WebElement mainSlider2;

}
