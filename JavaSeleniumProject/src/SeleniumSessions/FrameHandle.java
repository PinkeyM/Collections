package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch chrome browser
		
		driver.manage().window().maximize();//to max window
		//driver.manage().deleteAllCookies(); delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//When element is not found then must there some iframe, so to deal with that 1st way is using name:
		
		//driver.switchTo().frame("iframeResult");// iframe is the name 
		
		//2nd way: using index. so in xpath in inspect write -//iFrame and then see where it highlights and select the index value.
		//driver.switchTo().frame(0);
		
		//3rd way using webelemnt
		WebElement ele= driver.findElement(By.xpath("//iFrame[@id='iframeResult']"));
		driver.switchTo().frame(ele);
		//**************
		driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("Pinkey");
		//driver.switchTo().parentFrame();
		Thread.sleep(4000);
		//driver.close();
		
		//**************YouTube link  for iFrame /Inline Frame----https://www.youtube.com/watch?v=iALE-lJkPr4)***********************************
		
	}

}
