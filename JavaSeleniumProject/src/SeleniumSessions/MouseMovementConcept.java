package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[8]"));
		Actions action = new Actions(driver);//to perform mouse movement we need to create an object of action class with argument as driver.
		action.moveToElement(ele).perform();//-build().perform() actually performs the action, it will 
		//move the mouse to deal option.
		List<WebElement> Element = driver.findElements(By.xpath("//*[@id=\'bs-example-navbar-collapse-1\']/ul/li[8]/ul/li"));
		for(WebElement elem: Element) {
			if(elem.getText().equals("Sell Forex")) {
				elem.click();
				break;
				
			}
		}
	}

}
