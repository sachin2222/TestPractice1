package restAssured;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComplexJSONParse {


   @Test(enabled = false)
    public void complexJSONTest() {

        JsonPath js = new JsonPath(Payload.coursePrice());
        int size=js.getInt("courses.size()");
        System.out.println(size);

       // int amount=js.getInt("dashboard.purchaseAmount");
       // System.out.println(amount);

     // String title1=  js.getString("courses[0].title");
     // System.out.println(title1);

        for(int i=0;i<size;i++)
        {
           String title= js.get("courses["+i+"].title");
           int amount=js.get("courses["+i+"].price");
           // System.out.println(title + ":" + amount);

        }
        for(int i=0;i<size;i++)
        {
            String title= js.get("courses["+i+"].title");

            if(title.equalsIgnoreCase("RPA"))
            {
                int copies=js.get("courses["+i+"].copies");
                System.out.println(title + ":" + copies);
                break;

            }

        }

    }


    @Test(enabled = true)
    public void sumValidationTest()
    {
        JsonPath js = new JsonPath(Payload.coursePrice());
        int size=js.getInt("courses.size()");

        int total_amount=js.get("dashboard.purchaseAmount");
        int total_sum=0;

        for(int i=0;i<size;i++){

          int price=js.get("courses["+i+"].price");
          int copies=js.get("courses["+i+"].copies");
          total_sum=total_sum + price*copies;
        }
          System.out.println(total_sum);

           Assert.assertEquals(total_amount,total_sum);

    }
}