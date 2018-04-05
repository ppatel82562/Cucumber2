package CucumberPractise;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterMyStepdefs extends Utils {
    HomePage homePage = new HomePage();
    Nop_Commerce nop_commerce = new Nop_Commerce();

    @When("^User enter valid credentials$")
    public void userEnterValidCredentials() {

        nop_commerce.register_Successfully();
    }

    @Then("^User able to do succefully registration$")
    public void userAbleToDoSuccefullyRegistration() {
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")).getText(),"Your registration completed");
    }


    }

