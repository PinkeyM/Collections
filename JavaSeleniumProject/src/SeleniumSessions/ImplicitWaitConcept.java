package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		//thread.sleep()-- hard coded as it will wait for that particular time even though the page/element is loaded, so we go for dynamic wait.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.get("https://www.ebay.com/");//launch the URL
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//all the wait statements are to be declared just after the URL is invoked.
		//Dynamic wait.
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);// here for safer side we are giving 40 sec of wait so that if the page is suppose
		//taking 3, 5,...7 sec also to load, it will wait and the rest time will be ignored.
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//implicit wait is for all the we elements. suppose we are not able to see any button as its not loaded yet.
		
	}

}
