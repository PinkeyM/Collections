package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.navigate().to("https://github.com/");
	dr.findElement(By.linkText("Marketplace")).click();
	WebDriverWait wait= new WebDriverWait(dr, 5);
	WebElement el1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='h00-mktg mb-2 ml-n1 lh-condensed-ultra']")));
	
		String s=el1.getText();
		System.out.println(s);
		

	}

}
