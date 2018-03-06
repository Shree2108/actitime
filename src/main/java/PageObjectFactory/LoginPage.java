package PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    WebDriver driver;
    @FindBy(xpath = "//input[@name='username']")
    WebElement username;

    @FindBy(xpath = "//input[@name='pwd']")
    WebElement password;

    @FindBy(xpath = "//a[@id='loginButton']")
    WebElement submit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setusername(String uname)
    {
        username.sendKeys(uname);
        System.out.println("found uname");
    }

    public void setPassword(String pwd)
    {
        password.sendKeys(pwd);
    }
    public void clicklogin()
    {
        submit.click();
    }


}
