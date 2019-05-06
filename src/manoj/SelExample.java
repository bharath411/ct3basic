package manoj;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelExample {

	public void test() {
		System.setProperty("webdriver.chrome.driver", "E:\\java-jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
}
	
	public static void main(String[] args) {
		SelExample sel = new SelExample();
		sel.test();
	}

	
	}

