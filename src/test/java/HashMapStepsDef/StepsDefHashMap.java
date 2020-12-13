package HashMapStepsDef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class StepsDefHashMap {
    @Given("^User open application on chrome browser$")
    public void user_open_application_on_chrome_browser() throws Throwable {

    }

    @When("^user lands on login page$")
    public void user_lands_on_login_page() throws Throwable {

    }

    @Then("^user enter username and password$")
    public void user_enter_username_and_password(DataTable arg1)  {
        for (Map<String, String> data : arg1.asMaps(String.class, String.class)) {
            System.out.println(data.get("username"));
            System.out.println(data.get("password"));
            System.out.println(data.get("email"));
            System.out.println(data.get("firstname"));
            System.out.println(data.get("lastname"));

            System.out.println("\n");

        }


    }

    @Then("^user clicks on submit button$")
    public void user_clicks_on_submit_button() throws Throwable {

    }

    @Then("^User lands on home Page\\.$")
    public void user_lands_on_home_Page() throws Throwable {

    }
}
