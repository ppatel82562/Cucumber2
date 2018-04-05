package CucumberPractise;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    public void enterlogincredential (String uname,String pword){
        enterText(By.id("txtUsername"),uname);
        enterText(By.id("txtPassword"),pword);
        clickElement(By.id("btnLogin"));
    }
//    public void serchProduct(String product){
//        enterText(By.id("small-searchterms"),product);
//        clickElement(By.xpath("//input[@value='Search']"));
//    }
    }
