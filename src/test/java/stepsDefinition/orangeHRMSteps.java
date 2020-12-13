package stepsDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class orangeHRMSteps {

    public String URL="https://opensource-demo.orangehrmlive.com/";
    public String DashboardURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    public String driver_path="C:\\Users\\ss26370\\Downloads\\chromedriver_win32\\chromedriver.exe";
    public String driver_key="webdriver.chrome.driver";
    public WebDriver driver;

    @Deprecated
    @Given("^User open application on chrome browser$")
    public void user_open_application_on_chrome_browser() {
     System.setProperty(driver_key,driver_path);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.setHeadless(true);

     driver=new ChromeDriver(chromeOptions);
     driver.get(URL);
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @When("^user lands on login page$")
    public void user_lands_on_login_page() {

        String actual=driver.getTitle();
        String expected="OrangeHRM";
        Assert.assertEquals(actual,expected);

    }

    @Deprecated
    @Then("^user enter username\"([^\"]*)\"$")
    public void user_enter_username(String arg1)  {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.name("txtUsername")).sendKeys(arg1);

    }

    @Deprecated
    @Then("^user enters password\"([^\"]*)\"$")
    public void user_enters_password(String arg1) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.name("txtPassword")).sendKeys(arg1);

    }
    @Deprecated
    @Then("^user clicks on submit button$")
    public void user_clicks_on_submit_button() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.name("Submit")).click();


    }

    @Deprecated
    @Then("^User lands on home Page\\.$")
    public void user_lands_on_home_Page(){

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,DashboardURL);

    }
    @Deprecated
    @Then("^User should remains on login page$")
    public void user_should_remains_on_login_page()  {

    }


}
