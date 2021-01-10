package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class ParameterRestAPI
{
public String place_id;

@Test(dataProvider = "PlaceData",priority = 1)
    public void parameterizedTest(String name,String address)
{
    RestAssured.baseURI= "https://rahulshettyacademy.com";
    String responseBody= given().relaxedHTTPSValidation().log().all().queryParam("key", "qaclick123")
            .header("Content-Type","application/json")
            .body(Payload.AddPlaceParameter(name, address)).when().post("maps/api/place/add/json")
            .then().assertThat().statusCode(200).body("scope",equalTo("APP")).extract().response().asString();

    System.out.println(responseBody);

    JsonPath js=new JsonPath(responseBody);
    place_id=js.getString("place_id");
    System.out.println(place_id);
    deleteTest(place_id);

}

public static  void deleteTest(String place_id){
    RestAssured.baseURI= "https://rahulshettyacademy.com";
    String getPlaceResponse=	given().relaxedHTTPSValidation().queryParam("key", "qaclick123")
            .body("{\n" +
                    "    \"place_id\":\""+ place_id+"\"\n" +
                    "}\n")
            .when().delete("/maps/api/place/delete/json")
            .then().assertThat().log().all().statusCode(200).extract().response().asString();

    System.out.println(getPlaceResponse);
    JsonPath js=new JsonPath(getPlaceResponse);
    String act_status=js.getString("status");
    Assert.assertEquals(act_status,"OK");

}


@DataProvider(name="PlaceData")
    public Object[][] getDate()
{
   return new Object[][]{{"kapil", "GK2"}, {"sachin", "NY"}, {"Ram", "Dehradun"}, {"lallu", "badarpur"}};

}

}
