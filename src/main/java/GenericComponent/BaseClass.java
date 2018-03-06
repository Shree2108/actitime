package GenericComponent;

import org.apache.xpath.SourceTree;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected WebDriver driver;
    Utilityclass util= new Utilityclass();

    @BeforeTest
    public void setup() throws IOException {
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
       // System.out.println(util.readpropfile("URL"));
        //String url=util.readpropfile("URL");
        //System.out.println("String "+url);
        driver.get(util.readpropfile("URL"));
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        System.out.println("basepage driver"+driver);
    }

    @AfterTest
    public void close()
    {
        //driver.quit();
    }

}
