package manoj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc {
	public void tsrtc1() {
		System.setProperty("ChromeDriver.WebDriver", "E:\\\\java-jars\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tsrtconline.in/oprs-web/ticket/waitlist.do");

		WebElement tckno= driver.findElementById("id");
		tckno.sendKeys("123456789");
		
		WebElement Mobno=driver.findElementById("mobileNo");
		Mobno.sendKeys("8438555482");
		
		WebElement button=driver.findElementById("searchBtn");
		button.click();
	}
	public static void main(String args[]) {
		Tsrtc abc=new Tsrtc();
		abc.tsrtc1();
	}
}
