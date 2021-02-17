package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://abstracta.us/blog/software-testing/best-demo-websites-for-practicing-different-types-of-software-tests/");
		//driver.manage().window().maximize();
		driver.findElement(By.id("comment")).sendKeys("Pinkey");
		driver.findElement(By.id("author")).sendKeys("KKK");
		driver.findElement(By.id("email")).sendKeys("majghf@hsj.com");
		driver.findElement(By.id("url")).sendKeys("jshdfjsd");
		driver.findElement(By.id("wp-comment-cookies-consent")).click();
		driver.findElement(By.id("aiowps-captcha-answer"));
		driver.findElement(By.id("submit")).click();
		
		
		
	}

}
