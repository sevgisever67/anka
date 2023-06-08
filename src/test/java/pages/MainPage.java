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

    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement SiteLogo;


}
