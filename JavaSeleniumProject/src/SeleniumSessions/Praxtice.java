package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Praxtice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		/*driver.get("http://demo.guru99.com/popup.php");
		String parent=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		driver.findElement(By.linkText("Click Here")).click();
		Iterator<String> i1=child.iterator();
		while(i1.hasNext()) {
			String S=i1.next();
			if(!parent.equalsIgnoreCase(S)) {
				driver.switchTo().window(S);*/
				
			}
			
		

	}


