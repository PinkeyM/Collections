package SeleniumSessions;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowser {

	@Test
	public void hedaless(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("headless");
		co.addArguments("window size=1200x400");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
		System.out.println("Tets"+ driver.getTitle());
		
		
		
		
		
		
		
		

	}

}
