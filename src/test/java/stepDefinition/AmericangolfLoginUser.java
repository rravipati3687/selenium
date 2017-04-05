package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages.AmericangolfUserLogin;

public class AmericangolfLoginUser {

	AmericangolfUserLogin AmericangolfUserLogin= new AmericangolfUserLogin();
	
	@Given("^User is on americangolf home page by launching Login URL$")
	public void UserisonamericangolfhomepagebylaunchingLoginURL() throws Exception{
		
		AmericangolfUserLogin.Launch_LoginPage();
	}
		
	@When("^User enter loginusername and loginpassword$")	
	public void Userenterloginusernameandloginpassword() throws Exception{
		
		AmericangolfUserLogin.Enter_Login_Credentials();
	}
	
	
	@And("^User Clicks on login button$")
	public void UserClicksonloginbutton(){
		AmericangolfUserLogin.click_LoginIn_button();
		
	}
	
	
}
