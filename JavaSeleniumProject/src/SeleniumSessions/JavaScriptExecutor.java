package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		driver.get("https://www.youtube.com/");
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Java");
		
		
		
		
		//Javascript command
		  JavascriptExecutor js= (JavascriptExecutor)driver;//we have type casted javascriptexecutor
		  WebElement elee=driver.findElement(By.xpath("//div[@id='logo-icon-container']"));
		  
		  //for highlighting the element
		  //js.executeScript("arguments[0].setAttribute('style','background: green; border:2px solid red;');", elee);
		  js.executeScript("arguments[0].style.border='3px solid yellow'", elee);
		  
		//JavaSCriptExecutors-- its a class where we cast the driver into JavaSCriptExecutors
		//execute script--this method is used to execute javascript code.

	}
	
	
		//JavaSCriptExecutors-- its a class where we cast the driver into JavaSCriptExecutors
		//execute script--this 
	
	///**To generate user defined alerts we have to use generateAlert() methdo.
		
	}

	
		
	

