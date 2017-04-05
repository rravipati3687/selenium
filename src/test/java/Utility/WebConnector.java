package Utility;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public   class  WebConnector {
	
	
	
	Properties CONFIG=null;
	public  WebDriver driver =null;
	WebDriver mozilla=null;
	public static WebConnector w;
	
	
	
	public WebConnector(){
		
	
		if(CONFIG==null){
			try{
				// initialize OR
				CONFIG = new Properties();
				FileInputStream fs = new FileInputStream(
						System.getProperty("user.dir")
								+ "/src/test/java/configurations/project.properties");
				CONFIG.load(fs);
										
							
				
			}catch(Exception e)
			{
				System.out.println("Error on intializing properties files");
			}
			
			
			
		}
		
	
	}
	
	

	// opening the browser
	public void openBrowser(String browserType){
		//log("Opening browser "+browserType);
		
		if(browserType.equals("Mozilla")){
			
			driver  = new FirefoxDriver();
			
			
			
		}
		else if(browserType.equals("IE"))	{
			         
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			caps.setCapability("nativeEvents", false);
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver=new InternetExplorerDriver(caps);
			
			
		}
		
		else if(browserType.equals("Chrome")){
			
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chrome//chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\webdriverjs\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		
		// max
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
	}
	
	public void checkAlert(){
		
		try{
		WebDriverWait wait = new WebDriverWait(driver,2);
	
		wait.until(ExpectedConditions.alertIsPresent());
		
		Actions act= new Actions(driver);
		
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
		}
		catch(Exception e){
			
			
		}
		
		
	}
	
	
			
			
	// navigates to a URL
	public void navigate(String URL){
		//log("Naviating to "+CONFIG.getProperty(URL));
		driver.get(CONFIG.getProperty(URL));
	}
	
	public void Logincredentials(String LoginUserName, String LoginPasword){
		
		driver.findElement(By.xpath(CONFIG.getProperty(LoginUserName))).sendKeys("Ramakrishna.ravipati@gmail.com");;
		driver.findElement(By.xpath(CONFIG.getProperty(LoginPasword))).sendKeys("Rajirama80#");
		
	}
	// clicking on any object
	public void click(String objectName){
		//log("Clicking on " + objectName);
		driver.findElement(By.xpath(CONFIG.getProperty(objectName))).click();
	}
	
		
	
	
	/********Singleton**********/
	public static  WebConnector getInstance(){
		if(w==null)
			w= new WebConnector();
		
		return w;
	}
	
	
	

}
    
	
	
	
	
