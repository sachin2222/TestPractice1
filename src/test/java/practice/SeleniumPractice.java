package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SeleniumPractice {

    public String driver_path = "C:\\Users\\ss26370\\IdeaProjects\\TestPractice1\\Drivers\\chromedriver_win32\\chromedriver.exe";
    public String driver_key = "webdriver.chrome.driver";
    public WebDriver driver;


    @BeforeSuite
    public void launch()
    {
        System.setProperty(driver_key,driver_path);
        driver = new ChromeDriver();

    }
    //@Test
    public void  handleAuthenticationPopupTest() {
        String cred_url="https://admin:admin@the-internet.herokuapp.com/basic_auth";
        driver.get(cred_url);
    }

    @Test
    public void uploadTestByAutoIT()
    {


    }



}
