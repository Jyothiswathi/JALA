package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup extends ConfigReader {

	DriverFactory DriverFactory;
	WebDriver driver = null;
	ConfigReader ConfigReader=null;
	static ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();

public	Properties prop;

	public WebDriver setupBrowser() throws IOException {
		prop=init_Properties();
	String browserNameFromProperties=prop.getProperty("browser");
		String browserName = "chrome";
		if (browserNameFromProperties.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tl.set(new ChromeDriver());
		}
		geDriver().manage().window().maximize();
		geDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return geDriver();
	}

	public static  WebDriver geDriver() {
		
		return tl.get();
	}

	public void tearDown() {
		driver.quit();
	}

}
