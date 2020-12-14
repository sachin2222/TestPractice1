package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class HooksTestSteps {


    @Before("@First")
    public void setup(){
     System.out.println("Before  for all");


    }

    @After("@First")
    public void tearDown(){
        System.out.println("After for all");

    }

    @Given("^this is for third hook test$")
    public void this_is_for_third_hook_test()  {
        System.out.println("Third");

    }

    @Given("^this is for first tag test$")
    public void this_is_for_first_tag_test()  {
        System.out.println("First");
    }

    @Given("^this is for second tag test$")
    public void this_is_for_second_tag_test()  {
        System.out.println("Second");

    }




}
