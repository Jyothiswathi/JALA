package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DisableChromeBrowserNotifications {

	@Test
	public void desableNotifications() {

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumjenkins\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com");

		System.out.println("hello joy");

	}

}
