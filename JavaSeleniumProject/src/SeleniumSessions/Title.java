package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("mahtopinkey@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Gg@123456");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		String name=driver.getTitle();
System.out.println(name);
	}

}
