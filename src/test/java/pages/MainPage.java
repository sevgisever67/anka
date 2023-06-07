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

    @FindBy(xpath = "//h3[normalize-space()='Featured Packages']")
    public WebElement featuredPackagesElement;
    @FindBy(xpath = "(//*[text()='3 days in Buenos Aires'])[2]")
    public WebElement featuredPackagesthreeDaysInBuenosAiresElement;
    @FindBy(xpath = "(//a[text()='10 days in Buenos Aires'])[2]")
    public WebElement featuredPackagestenDaysInBuenosAiresElement;
    @FindBy(xpath = "(//a[text()='3 days in Bangkok'])[2]")
    public WebElement featuredPackagesthreeDaysInBangkokElement;
    @FindBy(xpath = "(//a[text()='7 days in Salina Island'])[2]")
    public WebElement featuredPackagessevenDaysInSalinaIslandElement;
    @FindBy(xpath = "/html/body/div[1]/div/button")
    public WebElement cookie;

    @FindBy(xpath = "//*[text()='Test Deneme']")
    public WebElement latestPackagesTestDenemeElement;
    @FindBy(xpath = "(//*[text()='5 Day California'])[3]")
    public WebElement latesPackagesFiveDayCaliforniaElement;
    @FindBy(xpath = "(//*[text()='7 days in Salina Island'])[3]")
    public WebElement latesPackagesSevenDaysInSalinaIslandElement;
    @FindBy(xpath = "(//*[text()='3 days in Bangkok'])[3]")
    public WebElement latesPackagesThreeDaysInBangkokElement;
    @FindBy(xpath = "//*[text()='7 days in Istanbul']")
    public WebElement latesPackagesSevenDaysInIstanbulElement;

    @FindBy(xpath = "(//*[text()='Discovering Greenville: A Hidden Gem in South Carolina'])[2]")
    public WebElement recentPostDiscoveringGreenvilleAHiddenGemInSouthCarolinaElement;

    @FindBy(xpath = "(//*[text()='Buenos Aires: The Paris of South America'])[2]")
    public WebElement recentPostBuenosAiresTheParisOfSouthAmerica;
    


}
