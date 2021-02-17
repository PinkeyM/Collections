package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=8FQ4QSKGFYCVVKGH6D8S&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");//open URL
		
		//First Locator-Xpath:2nd priotity
		//Absolute Xpath should not be used, that means when proper hierarchy is given.htlm/body/div[1]/div[5].....
		//Relative Xpath should be used.like, //*[@id='firstname']
		driver.findElement(By.xpath("//*[@id='ap_customer_name']")).sendKeys("Pinkey");//	driver.findElement=method, By=class
		driver.findElement(By.xpath("//*[@id='ap_phone_number']")).sendKeys("7021225919");
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("mahtopinkey@gmail.com");
		//driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("mahtopinkey@gmail.com");
		//driver.findElement(By.xpath("//*[@id='continue]")).click();
		
		//By Id: 1st priority always
		//driver.findElement(By.id("ap_customer_name")).sendKeys("Pinkey");
		//driver.findElement(By.id("ap_phone_number")).sendKeys("7021225919");
		
		//By Name:
		//driver.findElement(By.name("firstname")).sendKeys("Pinkey");
		
		//Link Text:
		
		//driver.findElement(By.linkText("Conditions of Use")).click();
		//CSS Selector:
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("password");// just put # and type the id name
		
	}

}
