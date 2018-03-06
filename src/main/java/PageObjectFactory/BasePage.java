package PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;
    @FindBy(xpath = "//table/tbody/tr/td[2]/nobr/a[contains(text(),'Actimind Inc.')]")
    WebElement copyright;

    @FindBy(xpath = "//table/tbody/tr/td[1]/nobr[contains(text(),'v. 3.0 MA')]")
    WebElement version;

    @FindBy(xpath = "//table/tbody/tr/td[1]/div[1]/img")
    WebElement logo;

    public BasePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getcopyright()
    {
        return  copyright.getText();
    }
    public String getversion()
    {
        return version.getText();
    }
    public String getlogo()
    {
        return logo.getAttribute("src");
    }
}
