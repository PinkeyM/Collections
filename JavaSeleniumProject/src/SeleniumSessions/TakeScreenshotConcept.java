package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//*********Interview: Can we take screenshot in selenium? ans- Yes, using getScreenshotAs() method.
		
		//Takesscreenshot and store as file format
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//Now copy the screenshot at desired location using copyfile//method
		try {
			FileUtils.copyFile()
		}
		
		

	}

}
