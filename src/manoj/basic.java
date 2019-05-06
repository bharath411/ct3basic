package manoj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
public void launch() {
	System.setProperty("webdriver.chrome.driver", "E:\\java-jars\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/admin/");
	
	WebElement userele= driver.findElementById("input-username");
	userele.sendKeys("demo");
	
	WebElement password= driver.findElementByName("password");
	password.sendKeys("demo");
	
	WebElement button=driver.findElementByXPath("//button[@type=\"submit\"]");
	button.click();
}
public static void main(String args[]) {
	basic abc=new basic();
	abc.launch();
}
}
