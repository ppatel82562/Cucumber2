package CucumberPractise;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class Nop_Commerce extends Utils {

    Load_Properties load_properties=new Load_Properties();
    String url = load_properties.getProperty("url");
    String product = load_properties.getProperty("product");
    public void getUrl(){
        driver.get(url);
    }

    public void serch_Product(){
        enterText(By.id("small-searchterms"),product);
        clickElement(By.xpath("//input[@value='Search']"));

    }

    public void register_Successfully (){
        String email = "Rajesh"+randomDate()+"patel@gmail.com";

        email = "Rajesh"+randomDate()+"patel@email.com";
        clickElement(By.linkText("Register"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        enterText(By.id("FirstName"), "Rajesh");
        enterText(By.id("LastName") , "Patel");
        enterText(By.id("Email"), email);
        enterText(By.id("Password"), "Patel1234");
        enterText(By.id("ConfirmPassword"), "Patel1234");
        clickElement(By.id("register-button"));
        System.out.println(email);
        System.out.println("User able to do registration successfully");

    }

    public void compare_Products() {
        clickElement(By.xpath("//input[@value='Add to compare list']"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(By.xpath("(//input[@value='Add to compare list'])[2]"));

        clickElement(By.linkText("product comparison"));
        System.out.println("User successfully compare 2 products");

    }

//    public void order_Book (){
//
//        clickElement(By.linkText("Books"));
//        clickElement(By.linkText("Fahrenheit 451 by Ray Bradbury"));
//        clickElement(By.xpath("//input[@value='Add to cart']"));
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//       // clickElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]"));
//        clickElement(By.className("cart-label"));
//        clickElement(By.id("termsofservice"));
//        clickElement(By.id("checkout"));
//        clickElement(By.xpath("//div[3]/input"));
//        enterText(By.id("BillingNewAddress_FirstName"),"Royal");
//        enterText(By.id("BillingNewAddress_LastName"),"Mail");
//        enterText(By.id("BillingNewAddress_Email"),"royalmail@gmail.com");
//        selectByVisibleText(By.id("BillingNewAddress_CountryId"),"United Kingdom");
//        enterText(By.id("BillingNewAddress_City"),"London");
//        enterText(By.id("BillingNewAddress_Address1"),"Harrow");
//        enterText(By.id("BillingNewAddress_ZipPostalCode"),"HA2 6PY");
//        enterText(By.id("BillingNewAddress_PhoneNumber"),"01234567891");
//        clickElement(By.xpath("//input[@value='Continue']"));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        clickElement(By.xpath("(//input[@value='Continue'])[3]"));
//        clickElement(By.id("paymentmethod_1"));
//        clickElement(By.xpath("(//input[@value='Continue'])[4]"));
//        enterText(By.id("CardholderName"),"Royal");
//        enterText(By.id("CardNumber"),"5385 6864 9327 3403");
//        selectByVisibleText(By.id("ExpireYear"),"2019");
//        enterText(By.id("CardCode"),"710");
//        clickElement(By.xpath("(//input[@value='Continue'])[5]"));
//        clickElement(By.xpath("//input[@value='Confirm']"));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println("Your order has been successfully");

//    }

}
