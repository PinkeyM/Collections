package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HtlmlUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();//launch chrome browser
	      WebDriver driver = new HtmlUnitDriver();
	      driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		  driver.get("http://demo.guru99.com/");
		  
			System.out.println("Before login" + driver.getTitle());
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mahtopinkey@gmail.com");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			System.out.println("After login" + driver.getTitle());
		
	}

}
