package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VDG_Test {



    public String driver_path = "C:\\Users\\ss26370\\IdeaProjects\\TestPractice1\\Drivers\\chromedriver_win32\\chromedriver.exe";
    public String driver_key = "webdriver.chrome.driver";
    public WebDriver driver;
    public String URL="http://10.1.6.196/virtual-discovery-games-qa";


    @BeforeSuite
    public void launch()
    {
        System.setProperty(driver_key,driver_path);
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

    }

    //@Test
    public void CSS_STYLE_OF_MODULE_LIBRARY() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/app-root/app-module-library/div/div[3]/app-module[4]/div/div[5]/header")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-details/div/div[1]/header"));//Module Library

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        String Module_library_fcolor = element.getCssValue("font-color");
        System.out.println(Module_library_fcolor + " :FONT COLOR");

        String Module_library_bcolor = element.getCssValue("background-colour");
        System.out.println(Module_library_bcolor + " :Back Ground Color");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }

    //@Test
    public void CSS_STYLE_OF_COMPELLIUM_PHARMA_VIEW_MODULE() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/app-root/app-module-library/div/div[3]/app-module[4]/div/div[5]/header")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-details/div/div[3]/div[2]/div[2]/header"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        String Module_library_fcolor = element.getCssValue("font-color");
        System.out.println(Module_library_fcolor + " :FONT COLOR");

        String Module_library_bcolor = element.getCssValue("background-colour");
        System.out.println(Module_library_bcolor + " :Back Ground Color");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }
   // @Test
    public void CSS_STYLE_OF_VIRTUAL_HOSPITAL_TOUR_VIEW_MODULE_DESCRIPTION() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/app-root/app-module-library/div/div[3]/app-module[4]/div/div[5]/header")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-details/div/div[3]/div[2]/div[3]/header"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        String Module_library_fcolor = element.getCssValue("font-color");
        System.out.println(Module_library_fcolor + " :FONT COLOR");

        String Module_library_bcolor = element.getCssValue("background-colour");
        System.out.println(Module_library_bcolor + " :Back Ground Color");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }

    @Test
    public void CSS_STYLE_OF_date_VIEW_MODULE_DESCRIPTION() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/app-root/app-module-library/div/div[3]/app-module[4]/div/div[5]/header")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-details/div/div[3]/div[2]/div[4]/header"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        String Module_library_fcolor = element.getCssValue("font-color");
        System.out.println(Module_library_fcolor + " :FONT COLOR");

        String Module_library_bcolor = element.getCssValue("background-colour");
        System.out.println(Module_library_bcolor + " :Back Ground Color");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }
    //@Test
    public void CSS_STYLE_OF_PROFILE_IMAGE() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/app-root/app-module-library/div/div[3]/app-module[4]/div/div[5]/header")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-details/div/div[3]/div[1]/div"));//Profile Image

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }

    //@Test
    public void CSS_STYLE_OF_TAG_HOSPITAL() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/app-root/app-module-library/div/div[3]/app-module[4]/div/div[5]/header")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-details/div/div[3]/div[2]/div[5]/header[2]"));//Profile Image

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");



        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }

   // @Test
    public void CSS_STYLE_OF_VirtualGamesPlatform() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-library/app-header/div/div[1]/header"));//Virtual Games Platform

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }
   // @Test
    public void CSS_STYLE_OF_ZS_LOGO() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-library/app-header/div/div[1]/img"));//Virtual Games Platform

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }

   // @Test
    public void CSS_STYLE_OF_MODULE_LIBRARY_TITLE() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-library/div/div[1]/div[1]/header[1]"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }

    // @Test
    public void CSS_STYLE_OF_LOGOUT_BUTTON() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-library/app-header/div/div[2]/header"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }
    //@Test
    public void CSS_STYLE_OF_VIEW_MODULE() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-module-library/div/div[3]/app-module[1]/div/div[5]/header"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String Module_library_fsize = element.getCssValue("font-size");
        System.out.println(Module_library_fsize + " FONT SIZE");


        String Module_library_fweight = element.getCssValue("font-weight");
        System.out.println(Module_library_fweight + " :FONT WEIGHT");

        String Module_library_fstyle = element.getCssValue("font-style");
        System.out.println(Module_library_fstyle + " :FONT STYLE");

        String Module_library_ffamily = element.getCssValue("font-family");
        System.out.println(Module_library_ffamily + " :FONT FAMILY");

        System.out.println(element.getLocation() + " :LEFT-TOP COORDINATES");
        System.out.println(element.getSize() + " :SIZE OF AN ELEMENT");


    }

}
