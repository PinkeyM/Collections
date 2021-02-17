package SeleniumSessions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleWindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		
		driver.get("http://demo.guru99.com/popup.php");
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		//it wil return the parent window  name as a string
		String parent=driver.getWindowHandle();
		
		//it wil return all the child window  name as a string
		Set<String> S= driver.getWindowHandles();
		java.util.Iterator<String> i1 = S.iterator();
		
		while (i1.hasNext())
		{
			String ChildWindow=i1.next();
			
			if(!parent.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gg@gmail.com");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.close();
				
				}
			System.out.println(driver.getTitle());
	
		
		
	}
	
	
	}
}



