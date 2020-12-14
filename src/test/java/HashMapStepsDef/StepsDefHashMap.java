package HashMapStepsDef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import runner.Credentials_Orange;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class StepsDefHashMap {

    public String URL="https://opensource-demo.orangehrmlive.com/";
    public String DashboardURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    public String driver_path="C:\\Users\\ss26370\\IdeaProjects\\TestPractice1\\Drivers\\chromedriver_win32\\chromedriver.exe";
    public String driver_key="webdriver.chrome.driver";
    public WebDriver driver;

    @Given("^User open application on chrome browser$")
    public void user_open_application_on_chrome_browser() {
       // System.setProperty(driver_key,driver_path);
       // driver=new ChromeDriver();
        //driver.get(URL);
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @When("^user lands on login page$")
    public void user_lands_on_login_page()  {
       // String actual=driver.getTitle();
        //String expected="OrangeHRM";
       // Assert.assertEquals(actual,expected);

    }

    @Then("^user enter username and password$")
    public void user_enter_username_and_password(DataTable  arg1) {

       for( Map<String,String> data:arg1.asMaps(String.class,String.class))
       {
          System.out.println(data.get("username"));
           System.out.println(data.get("password"));

       }

    }


    @Then("^user clicks on submit button$")
    public void user_clicks_on_submit_button()  {
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Then("^User lands on home Page\\.$")
    public void user_lands_on_home_Page()  {

    }
}
