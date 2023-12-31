package TestNg;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadrivenTest {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumjenkins\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "login")

	public void loginTest(String user, String pwd, String exp) throws InterruptedException {
		driver.get("https://admin-demo.nopcommerce.com/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(user);
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		password.clear();
		password.sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String exp_title = "Dashboard / commetrce administration";
		String act_title = driver.getTitle();
		if (exp.equals("valid")) {
			if (act_title.equals(exp_title)) {
				driver.findElement(By.xpath("//a[text()='Logout']"));
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);

			}

		} else if (exp.equals("invalid")) {
			if (act_title.equals(exp_title)) {
				driver.findElement(By.xpath("//a[text()='Logout']"));
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}

	}

	@DataProvider(name = "login")
	public String[][] getdata() {
		String[][] data = { { "admin@yourstore.com", "admin", "valid" }, { "admin@yourstor.com", "admin", "invalid" },
				{ "admin@yourstore.co", "admin", "invalid" } };
		return data;

	}

}
