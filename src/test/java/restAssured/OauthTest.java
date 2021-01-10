package restAssured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class OauthTest {

    public String Access_Token="ya29.a0AfH6SMAbEmwzA-Yo7pV7qCUlbiLyyYN_yd8EAOcaxM9fDrmyO-lsOSAQvumQZ1cMdvXmQH3Jh_98P0w8DxP5nM3Tz0prv6SVVqj8xEem-ggyX9fCCv2sOGEoVkRa7STRz28mNdjFLl1mkPNhhEheUldeCpmgwUmT1DmEc20TwRU";


    @Test
    public void getCoursesTest()
    {
        RestAssured.baseURI="https://rahulshettyacademy.com/getCourse.php";
        String responseBody=given().queryParam("access_token",Access_Token).relaxedHTTPSValidation().
                header("Content-Type","application/json").when().get().then().extract().response().asString();

        System.out.println(responseBody);

    }



}
