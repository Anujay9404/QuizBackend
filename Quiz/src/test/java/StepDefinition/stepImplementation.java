package StepDefinition;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepImplementation {

	 WebDriver driver;
	
	 @Given("^Open the quiz application$")
	    public void open_the_quiz_application()  {
		 driver = new ChromeDriver();
//		 utilitypackage.DriverFactory.open("chrome");
		 driver.get("http://localhost:4200/");
	        
	    }

	    @When("^User enter Email$")
	    public void user_enter_email() {
	    	System.out.println("step to enter email");
	        
	    }
	    @And("^User enter password$")
	    public void user_enter_password(){
	       System.out.println("step to enter password");
	    }

	    @Then("^Redirect to view page$")
	    public void redirect_to_view_page()  {
	        System.out.println("step to get into view");
	    }

	    @And("^click on login button$")
	    public void click_on_login_button() {
	    	System.out.println("step to complete login");
	       
	    }

	    
}
