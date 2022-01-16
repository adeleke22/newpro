package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koduk\\eclipse-workspace\\Selenuim software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}
