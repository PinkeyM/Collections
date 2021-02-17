package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTextMyself {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		driver.get("https://www.google.com/");
		WebElement ele= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		ele.sendKeys("java");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println("No of drops"+ list.size());
		
		for(int i=0; i<=list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("jdk")) {
				System.out.println(list.get(i).getText());
				break;
				
			}
			
		}
		

	}

}
