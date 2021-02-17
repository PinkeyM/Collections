package SeleniumSessions;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinkeym\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("http://demo.guru99.com/popup.php");
		dr.findElement(By.linkText("Click Here")).click();;
		String S=dr.getWindowHandle();
		System.out.println(S);
		Set<String> child=dr.getWindowHandles();
		java.util.Iterator<String> it= child.iterator();
		while(it.hasNext()) {
			String t=it.next();
			if(!S.equalsIgnoreCase(t)) {
				dr.switchTo().window(t);
				WebElement out=dr.findElement(By.xpath("//h2[@style='color:#800080;font-size:28px;font-weight:700;']"));
				System.out.println(out.getText());
				
			}
			
		}

	}

}
