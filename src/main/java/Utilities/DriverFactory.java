package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	WebDriver driver = null;
	ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();

	public WebDriver initDriver(String browserName) {

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tl.set(new ChromeDriver());
		}
		geDriver().manage().window().maximize();
		geDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return geDriver();

	}

	public WebDriver geDriver() {
		return tl.get();
	}

}
