package Pets_API_Practice;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetsAPI {



    @Test(priority = 1,dataProvider ="5_Pets_Data")
    public void PostPetTest(int id, String pet_name)
    {

        String responseBody=given().relaxedHTTPSValidation().header("Content-type","application/json").
                body(PetsPayload.PetDetails(id,pet_name)).when().post("https://petstore.swagger.io/v2/pet").
                then().log().all().statusCode(200).extract().response().asString();

        System.out.println(responseBody);
        JsonPath js=new JsonPath(responseBody);
       int value= js.getInt("category.id");
       System.out.println("id_value:"+ value);

        String name= js.getString("tags.name");
        System.out.println("tags_name:"+ name);

    }

    @DataProvider(name="5_Pets_Data")
    public Object[][] petsData()
    {

        return new Object[][]{{10,"sheru"},{11,"Tommy"}};


    }

}
