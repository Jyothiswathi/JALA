import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Testcases.Login;
import Utilities.Setup;

public class PopupAndWindowHandling {
	public WebDriver driver = null;

	@BeforeMethod
	public void setup() throws IOException {
		Setup Setup = new Setup();
		Login Login = new Login();
		driver = Setup.setupBrowser();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//a[contains(.,'More')]")).click();
		driver.findElement(By.xpath("//a[contains(.,' Popups')]")).click();

	}

	@Test
	public void alertMessageUsingGetText() {
		driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		String a = alert.getText();
		System.out.println(a);

	}

	@Test
	public void alertWithTextBox() {
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("hii");
		a.accept();

	}

	@Test
	public void alertMessageUsingOkCancel() {
		driver.findElement(By.id("confirmBox")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.id("confirmBox")).click();
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();

	}

	@Test
	public void alertMessageUsingAcceptDismiss() {
		driver.findElement(By.id("confirmBox")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.id("confirmBox")).click();
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();

	}

	@Test
	public void windowHandling() {
		driver.findElement(By.linkText("Popup One")).click();
		String parentid = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String eachWindow : allwindows) {
			if (!parentid.equalsIgnoreCase(eachWindow)) {
				driver.switchTo().window(eachWindow);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("hello");

			}
		}

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
