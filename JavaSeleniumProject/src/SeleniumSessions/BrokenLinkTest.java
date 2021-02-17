package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		driver.get("https://ui.freecrm.com//");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mahtopinkey@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gg@123456");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		List<WebElement> LinkList= driver.findElements(By.tagName("a"));// here all the links with tag name as "a" is stored in LinkList object
		LinkList.addAll(driver.findElements(By.tagName("img")));//here in same LinkList obj, all the images are also stored.
		System.out.println("SIze of LinkList is:"+ LinkList.size());
		
		List<WebElement> activelinks= new ArrayList<WebElement>();
		
		for(int i=0; i<=LinkList.size();i++) {
			if(LinkList.get(i).getAttribute("href")!= null) {
				System.out.println("Active is:" +activelinks.add(LinkList.get(i)));
			
				
			}
		}
	}

}
