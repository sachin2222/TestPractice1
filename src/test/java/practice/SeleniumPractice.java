package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class SeleniumPractice {

    public String driver_path = "C:\\Users\\ss26370\\IdeaProjects\\TestPractice1\\Drivers\\chromedriver_win32\\chromedriver.exe";
    public String driver_key = "webdriver.chrome.driver";
    public String firefox_key="webdriver.gecko.driver";
    public String firefoxDriverPath="C:\\Users\\ss26370\\IdeaProjects\\TestPractice1\\Drivers\\geckodriver-v0.28.0-win64\\geckodriver.exe";
    public WebDriver driver;


    //@BeforeSuite
    public void launch_Chrome() {
        System.setProperty(driver_key, driver_path);
        driver = new ChromeDriver();

    }

    //@BeforeSuite
    public void launch_firefox() {
        System.setProperty(firefox_key,firefoxDriverPath);
        driver = new FirefoxDriver();

    }

    //@Test
    public void handleAuthenticationPopupTest() {
        String cred_url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
        driver.get(cred_url);
    }

    //@Test
    public void actionClassTest() {
        String URL = "https://opensource-demo.orangehrmlive.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("txtUsername"));
        WebElement password = driver.findElement(By.name("txtPassword"));
        WebElement submit = driver.findElement(By.name("Submit"));

        Actions action = new Actions(driver);
        //action.moveToElement(username).click().sendKeys("Admin").build().perform();
        //action.moveToElement(password).click().sendKeys("admin123").build().perform();
        //action.moveToElement(submit).click().build().perform();

        action.sendKeys(username,"Admin").build().perform();
        action.sendKeys(password,"admin123").build().perform();
        action.click(submit).build().perform();


    }

   // @Test
    public void RightClickTest()
    {
        String URL="https://swisnl.github.io/jQuery-contextMenu/demo.html";
        driver.get(URL);
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement button=driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
        actions.contextClick(button).build().perform();
        actions.click(driver.findElement(By.xpath("/html/body/ul/li[5]/span"))).build().perform();

        System.out.println("Alert Message: " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


    }

   // @Test
    public void DragAndDropTest()
    {
        String URL="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html";
        driver.get(URL);
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement source=driver.findElement(By.id("box1"));
        WebElement target=driver.findElement(By.id("dropBox"));

        WebElement dog=driver.findElement(By.id("box2"));
        WebElement target2=driver.findElement(By.id("dropBox2"));

        actions.dragAndDrop(source,target).build().perform();
        actions.dragAndDrop(dog,target2).build().perform();

    }
   // @Test
    public void sliderTest()
    {
        String URL="https://jqueryui.com/slider/";
        driver.get(URL);
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame(0);

        WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
        actions.moveToElement(slider).dragAndDropBy(slider,300,0).build().perform();

    }

    //@Test
    public void resizableTest()
    {
        String URL="https://jqueryui.com/resizable/";
        driver.get(URL);
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame(0);
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement resizable=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"resizable\"]")));

        actions.moveToElement(resizable).build().perform();


    }

    //@Test
    public void downloadFileTest_Chrome()
    {
        String URL="http://demo.automationtesting.in/FileDownload.html";
        driver.get(URL);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("SACHIN");
        driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();

    }

    @Test
    public void downloadFileTest_FireFox() throws AWTException {
        System.setProperty(firefox_key,firefoxDriverPath);

        FirefoxProfile profile=new FirefoxProfile();
        profile.setPreference("browser.download.dir", "C:\\Users\\ss26370\\OneDrive - ZS\\Desktop\\Sachin Docs");
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain");
        profile.setPreference("browser.download.manager.showWhenStarting",false);

        FirefoxOptions options=new FirefoxOptions();
        options.setProfile(profile);
        driver = new FirefoxDriver(options);

        String URL="http://demo.automationtesting.in/FileDownload.html";
        driver.get(URL);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("SACHIN");
        driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();



    }
}
