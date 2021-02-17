package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		driver.get("https://ui.freecrm.com/contacts");
		////*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]// tr[1] is row and td1[2] is column
		////*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		////*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		////*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mahtopinkey@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gg@123456");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		//1st Method:*******************************
		String Before_Xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String After_Xpath="]/td[2]";
		for(int i=1; i<=4; i++) {
			String name=driver.findElement(By.xpath(Before_Xpath + i +After_Xpath)).getText();
			System.out.println(name);
			if(name.contains("Pinkey")) {
				driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).click();
				
			}
		}
		//2nd Method*************************
		driver.findElement(By.xpath("//input[@class='hidden']")).click();
		

	}

}
