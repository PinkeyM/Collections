package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		//to get the count of links on the page
		//to give the text of each link
		List<WebElement> obj1= driver.findElements(By.tagName("a"));// here a is the html tag name for all links.
		//size of the list
		System.out.println(obj1.size());
		//to give the text of each link
		for(int i=0; i<obj1.size();i++) {// here obj1.size()= 397, as the index start from 0, so size will be 396
			String S=obj1.get(i).getText();
			System.out.println(S);
			
			
		}
	}

}
