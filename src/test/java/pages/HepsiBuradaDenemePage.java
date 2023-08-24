package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;
import utils.Driver;

public class HepsiBuradaDenemePage {

    public HepsiBuradaDenemePage(){
       PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement hepsiBuradaAramaKutusu;
}
