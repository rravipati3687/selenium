package Pages;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import Utility.WebConnector;

public class AmericangolfUserLogin {

	WebConnector Selenium =  WebConnector.getInstance();
		
	public void Launch_LoginPage() throws Exception{
		
		Selenium.openBrowser("Chrome");
		Selenium.navigate("LoginURL"); 
		Selenium.click("Loginclick");
	  
	    
		
	}
	
	public void Enter_Login_Credentials() throws Exception{
		
		Selenium.Logincredentials("LoginUserName","LoginPasword");
		
	
	}
	
	public void click_LoginIn_button(){
	//	Selenium.click("Loginbutton");
		
		System.out.println(Selenium.driver.getTitle());
		//WebDriverWait wait=new WebDriverWait(Selenium.driver,30);
		//wait.until(ExpectedConditions.titleContains("Welcome to the Facebook page"));
		
		
	}
	@SuppressWarnings("deprecation")
	public void Sucessful_login(){
			
		Assert.assertEquals("Login", Selenium.driver.getTitle());
		
		
	}
	
	
	
	
}
