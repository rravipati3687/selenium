package Pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.WebConnector;

public class Americangolfsclub extends AmericangolfUserLogin {

	
	WebConnector Selenium =  WebConnector.getInstance();
	
	
	public void golfclubhome(){
		
		WebElement golf= Selenium.driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
		Actions act= new Actions(Selenium.driver);
		act.moveToElement(golf).build().perform();
		
	}
	
	public void driverlink(){
		
		WebElement Box= Selenium.driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[1]/div/div[1]"));
		List<WebElement> links=Box.findElements(By.tagName("a"));
		System.out.println("BOX"+Box.getAttribute("id"));
		System.out.println(links.size());
		
			Random r =new Random();		
		   int i=r.nextInt(links.size());
			System.out.println(i);
			System.out.println(links.get(i).getText());
			links.get(1).click();
		
		
		
	}
	public void drag(){
		
		WebDriverWait wait = new WebDriverWait(Selenium.driver,30); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='secondary']/div[1]/div[2]/div/ul/li[1]/a/span[1]")));
		
		Selenium.driver.findElement(By.xpath("//*[@id='secondary']/div[1]/div[2]/div/ul/li[1]/a/span[1]")).click();
		Actions act1= new Actions(Selenium.driver);
		WebElement icon= Selenium.driver.findElement(By.xpath("//*[@id='secondary']/div[1]/div[1]/div/div/div[1]"));
		
		act1.dragAndDropBy(icon, 60, 0).build().perform();
	}
	
	
}
