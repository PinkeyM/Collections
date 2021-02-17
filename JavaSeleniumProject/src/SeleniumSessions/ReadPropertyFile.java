package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {
	
	static WebDriver driver;// here we have made the WebDriver variable as global variable so that we can use it anywhere.
	
	//config.properties file is the repository where we add all generic values 

	public static void main(String[] args) throws IOException {
		// to read the properties file we need to create an object of properties class
		Properties prop= new Properties();
		FileInputStream st= new FileInputStream("C:\\Users\\Pinkeym\\Java Testing\\JavaSeleniumProject\\src\\SeleniumSessions\\config.properties");// created a object of FileInputStream
		//class. Need to pass the path of config. file so that it reads this file.
		prop.load(st);//to load the particular file.
		//System.out.println(prop.getProperty("name"));// prop.getPropert() is the method where we pass the key.
		String url=prop.getProperty("URL");
		String browsername =prop.getProperty("browser");
		
		//System.out.println(prop.getProperty("Name"));// showing null as the name is not correct, its in capital letter
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();//launch chrome browser
			
		}else {
			System.out.println("Error found");
		}
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("Search_xpath"))).sendKeys(prop.getProperty("Sear"));
		driver.findElement(By.xpath(prop.getProperty("button_xpath"))).click();
		driver.navigate().back();
	
		
	}

}
