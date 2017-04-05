package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.Selenium;

import Pages.Americangolfsclub;
import Utility.WebConnector;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AmericanGolfsclub {

	WebConnector Selenium =  WebConnector.getInstance();
	
	Americangolfsclub AmericanGolfsclub  =   new Americangolfsclub();
	
	
	@Given("^User able to Landed on the golfclubs page$")
	public void UserabletoLandedonthegolfclubspage() throws Exception{
		
		AmericanGolfsclub.golfclubhome();
	}
		
	
	
	@When("^user clicks on the drivers link$")
	public void userclicksonthedriverslink(){
		
		AmericanGolfsclub.driverlink();
	}
	
	@And("^Drag the price range$")
	public void Dragthepricerange(){
		
		AmericanGolfsclub.drag();
	}
}
