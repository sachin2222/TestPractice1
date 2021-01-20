package pojo;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SerialiseTest {


    @Test
    public void PostRequestTest() {

        SerialisePojo pj = new SerialisePojo();
        pj.setAccuracy(10);
        pj.setAddress("Badarpur");
        pj.setLanguage("IN");
        pj.setName("sachin");
        pj.setPhone_number("87700896892");

        List<String> myList=new ArrayList<String>();
        myList.add("shoes");
        myList.add("Park");

        pj.setTypes(myList);
        Location loc=new Location();
        loc.setLat(-38.30000000);
        loc.setLng(45.7666666);
        pj.setLocation(loc);


        RestAssured.baseURI = "https://rahulshettyacademy.com";

        String body = given().relaxedHTTPSValidation().queryParam("key", "qaclick123").header("content-type", "application/json").
                body(pj).when().post("/maps/api/place/add/json").then().assertThat().statusCode(200).extract().response().asString();

        System.out.println(body);


    }


}
