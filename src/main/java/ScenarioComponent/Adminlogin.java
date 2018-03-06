package ScenarioComponent;

import GenericComponent.BaseClass;
import GenericComponent.Utilityclass;
import PageObjectFactory.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.xml.ws.handler.LogicalHandler;
import java.io.IOException;

public class Adminlogin extends BaseClass {

    Utilityclass utility= new Utilityclass();
    String version;

   @Test(priority = 0)
    public void verifyversion() throws IOException {
       System.out.println("Admindriver"+driver);
        LoginPage loginpage= new LoginPage(driver);
       System.out.println("driver"+driver);
        version=loginpage.getversion();
       System.out.println(version);
       String expetedverison=utility.readpropfile("Version");
       System.out.println("exp ver"+expetedverison);
        Assert.assertEquals(version,expetedverison);

    }

    @Parameters({"uname", "pwd"})
    @Test(priority =1)
    public void login(String uname,String pwd)
    {
        System.out.println("driver"+driver);
        LoginPage lp= new LoginPage(driver);
        System.out.println("driver"+driver);
        lp.setusername(uname);
        lp.setPassword(pwd);
        lp.clicklogin();
    }



}
