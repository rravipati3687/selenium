package Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import Utility.WebConnector;

public class Americangolfhome extends AmericangolfUserLogin{

	
	WebConnector Selenium =  WebConnector.getInstance();
	
		
	@SuppressWarnings("deprecation")
	public void Sucessfull_login(){
		
		try{
			//Selenium.checkAlert();
			
			////WebDriverWait wait=new WebDriverWait(Selenium.driver,30);
			//wait.until(ExpectedConditions.titleContains("Facebook"));
			Assert.assertEquals("Login", Selenium.driver.getTitle());
		}
		catch(Throwable t){
			
			System.out.println(t);
			
		}
	}
	
		
		public void clickBrandbutton(){
						
			Selenium.click("Brandbutton");
		}
		
		public void clickGolfsbutton(){
			
			Selenium.click("Golfsbutton");
		}
}
