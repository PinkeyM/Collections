package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverSessions {

	public static void main(String[] args) {
		// Firefox browser:
		//geckodriver:
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pinkeym\\Documents\\geckodriver-v0.27.0-win64\\geckodriver.exe");// here System=class and setproprty=method
	//WebDriver driver=new FirefoxDriver();//launcg firefox
	//created an object. So, FirefoxDriver is a class which is implemnting Webdriver interface.
	//so FirefoxDriver is an class and new FirefoxDriver is the object of that class. WebDriver=interface
 //driver.get("hhtp://www.google.com");
// Chrome:
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();//launch chrome browser
driver.get("https://www.google.com/");//open URL
String Url= driver.getCurrentUrl();
String Title=driver.getTitle();// to get the title 
System.out.println(Title);
//Validation point from testing view:
if(Title.equals("Google")) {// to check whther the printed title is correct or not.
	System.out.println("Correct");
}else {
	System.out.println("Incorrect");
}

System.out.println(driver.getCurrentUrl());//to see the current URL
System.out.println(driver.getPageSource());//to get page source
driver.quit();// to close the browser at last onec everything is done.

	}

}
