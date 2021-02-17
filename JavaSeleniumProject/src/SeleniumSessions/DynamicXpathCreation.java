package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathCreation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");//1st way to write xpath for search text field
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");//2nd way
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");//3rd way using contains
//Dynamic id:
		//id= test_123;
		//id=test_345; so here ids have test but after underscore different numbers are there so in that case:
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Java");//here after '_' it can have any values
		//id = 5765_test_233
		//id34_test_AA
		//driver.findElement(By.xpath("//input[contains(@id,'_test_')]")).sendKeys("Java");
		
		//For links:
		
		//driver.findElement(By.linkText("Sell")).click();// 1st way
		driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click();//2nd way
		
		
		
	}

}
