package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


public class RestAssuredTest {

    public String place_id;
/*
  // @Test(priority = 1)
    public void PostRequestTest()
    {
        RestAssured.baseURI= "https://rahulshettyacademy.com";
      String responseBody= given().relaxedHTTPSValidation().log().all().queryParam("key", "qaclick123")
               .header("Content-Type","application/json")
                .body(Payload.AddPlaceParameter("SACHIN SHARMA")).when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope",equalTo("APP")).extract().response().asString();

       System.out.println(responseBody);

        JsonPath js=new JsonPath(responseBody);
        place_id=js.getString("place_id");
        boolean flag=true;
        if(place_id.isEmpty())
        {
          flag=false;
        }
        Assert.assertTrue(flag);

    }


 */

   @Test(priority = 3)
    public void getRequestTest()
   {
       RestAssured.baseURI= "https://rahulshettyacademy.com";
       String getPlaceResponse=	given().relaxedHTTPSValidation().queryParam("key", "qaclick123")
               .queryParam("place_id",place_id)
               .when().get("maps/api/place/get/json")
               .then().assertThat().statusCode(200).extract().response().asString();

      System.out.println(getPlaceResponse);
      JsonPath js=new JsonPath(getPlaceResponse);

      String actual_address=js.getString("address");
      String expected_address="Newyork";
       Assert.assertEquals(actual_address,expected_address);



   }

@Test(priority = 4)
   public void deleteTest(){

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

   @Test(priority = 2)
    public void updateTest()
   {
       RestAssured.baseURI= "https://rahulshettyacademy.com";
       String responseBody= given().relaxedHTTPSValidation().queryParam("key", "qaclick123").header("Content-Type","application/json")
               .body("{\n" +
                       "\"place_id\":\"" +place_id+"\",\n" +
                       "\"address\":\"Newyork\",\n"+
                       "\"key\":\"qaclick123\"\n" +
                       "}\n").when().put("/maps/api/place/update/json")
               .then().assertThat().statusCode(200).extract().response().asString();

       System.out.println(responseBody);
       JsonPath js=new JsonPath(responseBody);
       String actual_msg=js.getString("msg");
       String exp_msg="Address successfully updated";
       Assert.assertEquals(actual_msg,exp_msg);

   }
}
