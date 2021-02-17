package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='next']")).click();
		//driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[3]/td[4]")).click();
		List<WebElement> ele= driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']//td"));
		System.out.println(ele.size());
		for(int i=0; i<=ele.size();i++) {
			ele.get(i).getText();
			if(ele.get(i).getText().equals("7")) {
				ele.get(i).click();
				break;
				
			}
		}
	}

}
