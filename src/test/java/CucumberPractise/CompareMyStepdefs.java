package CucumberPractise;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareMyStepdefs extends Utils {
    //    HomePage homePage = new HomePage();
    Nop_Commerce nop_commerce = new Nop_Commerce();

    @When("^User selected two products$")
    public void user_selected_two_products() {

        nop_commerce.compare_Products();

    }

    @Then("^User able to compare two products successfully$")
    public void user_able_to_compare_two_products_successfully() {
        Assert.assertEquals(driver.findElement(By.xpath("//a[contains(@href,'/compareproducts')]")).getText(), "Compare products list");


    }

}
