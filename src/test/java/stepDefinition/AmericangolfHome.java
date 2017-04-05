package stepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Selenium;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages.Americangolfhome;
import Utility.WebConnector;

public class AmericangolfHome {

	
	
	
	Americangolfhome Americangolfhome= new Americangolfhome();
	
	
	@Given("^User is Landed on the americangolf home page$")
	public void userisUserisLandedontheamericangolfhomepage() throws Exception{
		
		Americangolfhome.Sucessfull_login();
	}
		
	
	
	
	@When("^user clicks on the Home button$")
	public void userclicksontheHomebutton(){
		Americangolfhome.clickBrandbutton();
		
	}
	
	@And("^user clicks on the Golfclub button$")
	public void userclicksontheGolfclubbutton(){
		Americangolfhome.clickGolfsbutton();
		
	}
	
	
}
