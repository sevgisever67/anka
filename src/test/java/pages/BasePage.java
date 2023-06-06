package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {


    // Pagelerimiz bu class'a extend olduğu için
    // bu classın child  classlarında (Locate aldığımız page ler) constructor oluşturmuyoruz;
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //*********** ADMİN GİRİŞ LOCATE LERİ ***********//
    @FindBy(id = "email")
    public WebElement adminEmailButton; //Admin Log in sayfasındaki email kutusu

    @FindBy(id = "password")
    public WebElement adminPasswordButton; //Admin Log in sayfasındaki password kutusu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminLoginButton;  // Admin  Log in sayfasındaki log in button


    //************ USER GİRİŞ LOCATE LERİ ***************///
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement userLogInButton;   //Main Page log in button BANNER

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement userEmailAddrsess;     //Main Page Email Address box


    @FindBy(xpath = "//input[@type='password']")
    public WebElement userPasswordButton;  //Main Page user girişi Password box

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement userLogin2;      //Main pagede giriş bilgilerinin altındaki log in

    @FindBy(xpath = "//i[@class='fas fa-sign-out-alt']")
    public WebElement userLogoutButton;   //User olarak giriş yaptıktan sonra log out butonu


}