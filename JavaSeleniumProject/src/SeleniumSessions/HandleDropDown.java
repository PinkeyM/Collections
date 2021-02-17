package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		// For downloading different browser drivers below is the link:
		//https://www.selenium.dev/documentation/en/webdriver/driver_requirements/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=0SM2BWVEDCZ4N4B1W5BN&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");//open URL
		
//handle a drop down: interview**************
		//driver.findElement(By.xpath("//select[@name='countryCode']/option[@value='AF']]")).click();
		//driver.findElement(By.xpath("//*[@id='ap_customer_name']")).sendKeys("Pinkey");
		Select sel= new Select (driver.findElement(By.xpath("//select[@name='countryCode']")));
		//sel.selectByValue("AF");
		sel.selectByVisibleText("AL +355");
	
		
	}

}
