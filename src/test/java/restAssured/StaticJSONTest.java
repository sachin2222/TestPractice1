package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class StaticJSONTest {

    public String place_id;

    @Test
    public  void staticJSONTest() throws IOException {
        RestAssured.baseURI= "https://rahulshettyacademy.com";
        String responseBody= given().relaxedHTTPSValidation().log().all().queryParam("key", "qaclick123")
                .header("Content-Type","application/json")
                .body(new String(Files.readAllBytes(Paths.get("C:\\Users\\ss26370\\IdeaProjects\\TestPractice1\\payload\\addPlace.json")))).when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope",equalTo("APP")).extract().response().asString();

        System.out.println(responseBody);

        JsonPath js=new JsonPath(responseBody);
        place_id=js.getString("place_id");
        System.out.println(place_id);


    }
}
