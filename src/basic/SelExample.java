package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelExample {

	
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\selenium31459\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	}
	
	public static void main(String[] args) {
		SelExample sel = new SelExample();
		sel.test1();
	}
}
