package Modules;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class TestBase {
	
	EdgeOptions options = new EdgeOptions();

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\koduk\\eclipse-workspace\\Selenuim software\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://phptravels.net/api/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByName("email").sendKeys("admin@phptravels.com");
		driver.findElementByName("password").sendKeys("demoadmin");
		driver.findElementByXPath("/html/body/div[1]/form[1]/button/span[1]").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByCssSelector("li.dropdown:nth-child(6) > a:nth-child(1)").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByCssSelector("#hotelsmodule > li:nth-child(5) > a:nth-child(1)").click();
		driver.findElementByCssSelector("#servicetype").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByCssSelector("#servicetype > option:nth-child(2)").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
}
