package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		driver.get("https://ui.freecrm.com/");
		WebElement UN=driver.findElement(By.name("email"));
		UN.sendKeys("mahtopinkey@gmail.com");
		WebElement Pwd=driver.findElement(By.name("password"));
		Pwd.sendKeys("Gg@123456");
		WebElement button=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		button.click();
		
		DrawBorder(button, driver);
	}
	
	
	public static void DrawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor) driver);// we are creating object of class JavascriptExecutor and casting driver into
		//JavascriptExecutor
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

}
