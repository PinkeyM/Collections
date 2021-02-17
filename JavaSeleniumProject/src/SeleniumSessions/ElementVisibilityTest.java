package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// these two are implicit wait.
		driver.get("http://demo.guru99.com/test/radio.html");
		
		//1. isdisplayed() method---applicable for all elements
		
		
        Boolean bn =driver.findElement(By.id("vfb-6-0")).isDisplayed();// this will return bollean value ie, True or False
        System.out.println(bn);
        
        //isenabled()
        Boolean bn1= driver.findElement(By.id("vfb-7-1")).isEnabled();
        System.out.println(bn1);
        
      //isSelected()-is only applicable for checkbox, dropdown and radio buttons.
        Boolean bn2= driver.findElement(By.id("vfb-7-3")).isSelected();
        System.out.println(bn2);
}

}
