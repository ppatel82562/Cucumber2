package CucumberPractise;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SerchNPCstepDefs {

    //HomePage homePage = new HomePage();
    Nop_Commerce nop_commerce = new Nop_Commerce();

    @Given("^User on home page$")
    public void user_on_home_page()  {
    }
    @When("^User enter \"([^\"]*)\" name in serch box$")
    public void user_enter_name_in_serch_box(String arg1)  {


        nop_commerce.serch_Product();

        // homePage.serchProduct("computer");
    }

    @Then("^user able to serch the product$")
    public void user_able_to_serch_the_product()  {

    }


}
