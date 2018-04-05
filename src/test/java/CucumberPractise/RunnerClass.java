package CucumberPractise;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "." , format = {} , tags = "@checkout")
public class RunnerClass {

}
