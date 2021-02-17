package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Pinkeym\\Documents\\crr.xlsx");

	}

}
