package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("vdfvdfv");
		//Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();
		String text= alert.getText();
		System.out.println("hghg"+text);
		//Thread.sleep(2000);
		
		//alert.accept();
		//alert.dismiss();//if suppose cancel button was there then we should use this dismiss method
		

		
		
	}

}
