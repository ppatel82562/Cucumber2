package CucumberPractise;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class CheckoutMyStepdefs extends Utils{



    @Given("^user is on home page$")
    public void user_is_on_home_page() {
//        System.setProperty("webdriver.gecko.driver","src\\Resources\\Driver\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.get("http://demo.nopcommerce.com/");
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
    }

    @When("^click on books page$")
    public void click_on_books_page() {
        clickElement(By.linkText("Books"));     //click on books
    }

    @And("^click on book name is Fahrenhit (\\d+)$")
    public void click_on_book_name_is_Fahrenhit(int arg1) {
        clickElement(By.linkText("Fahrenheit 451 by Ray Bradbury"));    //click on book name
    }

    @And("^click on add to cart$")
    public void click_on_add_to_cart() {
        clickElement(By.xpath("//input[@value='Add to cart']"));        //click on add to cart and wair 5 second for visible element
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @And("^click on shopping cart$")
    public void click_on_shopping_cart() {
        clickElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]"));     //click on shoppinng cart

    }

    @And("^click on terms and condition$")
    public void click_on_terms_and_condition() {
        clickElement(By.id("termsofservice"));          //click on T&C

    }

    @And("^click on check out$")
    public void click_on_check_out() {
        clickElement(By.id("checkout"));        //click on check out

    }

    @And("^click on check out as Guest$")
    public void click_on_check_out_as_Guest() {
        clickElement(By.xpath("//div[3]/input"));       //click on check out as a guest

    }

    @And("^fill the all requirment details$")
    public void fill_the_all_requirment_details() {
        enterText(By.id("BillingNewAddress_FirstName"),"Royal");        //fill name
        enterText(By.id("BillingNewAddress_LastName"),"Mail");          //fill surname
        enterText(By.id("BillingNewAddress_Email"),"royalmail@gmail.com");      //fill email address
        selectByVisibleText(By.id("BillingNewAddress_CountryId"),"United Kingdom"); //select country
        enterText(By.id("BillingNewAddress_City"),"London");    //select city
        enterText(By.id("BillingNewAddress_Address1"),"Harrow"); // fill address
        enterText(By.id("BillingNewAddress_ZipPostalCode"),"HA2 6PY"); //fill postc code
        enterText(By.id("BillingNewAddress_PhoneNumber"),"01234567891"); // fill phone number
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {                              // wait for the next element to be visible
            e.printStackTrace();
        }
    }

    @And("^click on continue for shipping method$")
    public void click_on_continue_for_shipping_method() {
        clickElement(By.xpath("//input[@value='Continue']"));       //click on continue for shipping method
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {                  //wait for the next element to be visible
            e.printStackTrace();
        }

    }

    @And("^again click on continue for payment$")
    public void again_click_on_continue_for_payment() {
        clickElement(By.xpath("(//input[@value='Continue'])[3]"));  //click on continue for payment

    }

    @And("^click on credit card$")
    public void click_on_credit_card() {                //click on credit card
        clickElement(By.id("paymentmethod_1"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {              //wait for the next element to be visible
            e.printStackTrace();
        }
    }

    @And("^click on continue for credit card details$")
    public void click_on_continue_for_credit_card_details() {
        clickElement(By.xpath("(//input[@value='Continue'])[4]"));   //click for credit card details

    }

    @And("^enter credit card details$")
    public void enter_credit_card_details() {                       // fill all cfredit card details
        enterText(By.id("CardholderName"),"Royal");
        enterText(By.id("CardNumber"),"5385 6864 9327 3403");
        selectByVisibleText(By.id("ExpireYear"),"2019");
        enterText(By.id("CardCode"),"710");

    }

    @And("^click on continue for confirm order$")
    public void click_on_continue_for_confirm_order() {
        clickElement(By.xpath("(//input[@value='Continue'])[5]"));      //click for confirm order
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @And("^click on confirm$")
    public void click_on_confirm() {
        clickElement(By.xpath("//input[@value='Confirm']")); //click for confirm


    }

    @Then("^User able to see successfully message which 'Your order has been successfylly processed'$")
    public void user_able_to_see_successfully_message_which_your_order_has_been_successfylly_processed() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong")));
        Assert.assertEquals(driver.findElement(By.xpath("//strong")).getText(),"Your order has been successfully processed!");

        //Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")).getText(),"Thank you");


        System.out.println("Your order has been successfully processed");
        driver.close();


    }

}
