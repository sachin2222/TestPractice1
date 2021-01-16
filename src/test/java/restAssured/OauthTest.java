package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.restassured.RestAssured.given;

public class OauthTest {

    public String client_id="692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com";
    public String client_secret_id="erZOWM9g3UtwNRj340YYaK_W";
    public String auth_url="https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php";
     public String Access_Token;
     public String code;


    @Test(priority = 2)
    public void getCoursesTest()
    {
        RestAssured.baseURI="https://rahulshettyacademy.com/getCourse.php";
        String responseBody=given().urlEncodingEnabled(false).queryParam("access_token",Access_Token).relaxedHTTPSValidation().
                header("Content-Type","application/json").when().get().then().extract().response().asString();

        System.out.println(responseBody);

    }


    @Test(priority = 1)
    public void getAccessToken()
    {
        RestAssured.baseURI="https://www.googleapis.com";
       String body= given().urlEncodingEnabled(false).relaxedHTTPSValidation().queryParam("code",code).queryParam("client_id",client_id).queryParam("client_secret",client_secret_id).
                queryParam("grant_type","authorization_code").queryParam("redirect_uri","https://rahulshettyacademy.com/getCourse.php").
                header("Content_type","application/json").when().post("/oauth2/v4/token").then().extract().response().asString();

              System.out.println(body);
        JsonPath js=new JsonPath(body);
        Access_Token=js.get("access_token");
        System.out.println(Access_Token);

    }

    @Test(priority = 0)
    public void getAuthorizationCode() throws InterruptedException
    {



            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ss26370\\IdeaProjects\\TestPractice1\\Drivers\\chromedriver_win32\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            WebDriver driver = new ChromeDriver(options);
            driver.get(auth_url);

            driver.findElement(By.name("identifier")).sendKeys("restapitest95@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.name("password")).sendKeys("8700896892");
            driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(5000);

            String currentUrl  = driver.getCurrentUrl();
            System.out.println("CurrentURL: " + currentUrl);

            String[] Partial_url = currentUrl.split("code=",2);

         String[] required_code=Partial_url[1].split("&scope",2);
         System.out.println(required_code[0]);
         code=required_code[0];

    }

}
