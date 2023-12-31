package Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import Utilities.Setup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MiscellaneousScenarios  extends Setup{
	WebDriver driver=null;

	@Test
	public void takeScreenshotes() throws IOException {
		driver=setupBrowser();
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File(System.getProperty("user.dir")+"\\Screenshots\\amazonScreenshot.jpg"));
		driver.quit();

	}

//	@Test
//	public void iFrame() {
//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// driver.manage().deleteAllCookies();
//		driver.get("https://magnus.jalatechnologies.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
//		driver.findElement(By.id("Password")).sendKeys("jobprogram");
//		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.xpath("//a[contains(.,'More')]")).click();
//		driver.findElement(By.xpath("//a[contains(.,' iFrames')]")).click();
//		driver.switchTo().frame("iframe2");
//		driver.findElement(By.xpath("//a[@data-toggle='push-menu']")).click();
//		driver.quit();
//
//	}

//	@Test
//	public void brokenLinks() throws MalformedURLException, IOException
//	{
//		int count=0;
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// driver.manage().deleteAllCookies();
//		driver.get("https://magnus.jalatechnologies.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
//		driver.findElement(By.id("Password")).sendKeys("jobprogram");
//		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.xpath("//a[contains(.,'More')]")).click();
//		driver.findElement(By.xpath("//a[contains(.,' Links')]")).click();
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		for(WebElement link:links)
//		{
//			String linkAddress = link.getAttribute("href");
//		HttpURLConnection con	=(HttpURLConnection)new URL(linkAddress).openConnection();
//		con.setRequestMethod("HEAD");
//		con.connect();
//		int responsecode=con.getResponseCode();
//		if(responsecode>=400)
//			
//		{
//		count++;
//		System.out.println("broken link is"+link.getText());
//		}
//		}
//		
//		
//
//	
//	}
//	@Test
//	public void waits() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://magnus.jalatechnologies.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
//		driver.findElement(By.id("Password")).sendKeys("jobprogram");
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
//		driver.findElement(By.id("btnLogin")).click();
//
//	}

//	@Test
//	public void Actions() throws InterruptedException
//	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://magnus.jalatechnologies.com/");
//		driver.manage().window().maximize();
//		Actions a=new Actions(driver);
//		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
//		driver.findElement(By.id("Password")).sendKeys("jobprogram");	
//		
//		a.click(driver.findElement(By.id("btnLogin"))).build().perform();
//		a.click(driver.findElement(By.linkText("http://jalatechnologies.com/contact-us.html"))).build().perform();
	// Thread.sleep(5000);

	// a.moveToElement(driver.findElement(By.xpath("(//span[@class='nav-link-text'])[3]"))).build().perform();
	// a.doubleClick(driver.findElement(By.linkText("JIRA")));
	// a.dragAndDrop(driver.findElement(By.xpath("(//span[@class='nav-link-text'])[3]")),
	// driver.findElement(By.xpath("(//span[@class='nav-link-text'])[3]"))).build().perform();
//		a.keyUp(Keys.CONTROL);
//		a.sendKeys("a");
//		a.keyUp(Keys.CONTROL);
//		a.build().perform();
	// a.sendKeys(Keys.ENTER);

//	}

//	@Test
//	public void table() {
//		boolean isStatus = false;
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// driver.manage().deleteAllCookies();
//		driver.get("https://magnus.jalatechnologies.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
//		driver.findElement(By.id("Password")).sendKeys("jobprogram");
//		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.xpath("//a[contains(.,'Employee')]")).click();
//		driver.findElement(By.xpath("//a[contains(.,' Search ')]")).click();
//		int totalRows = driver.findElements(By.xpath("//table[@id='tblEmployee']//td//parent::tr")).size();
//		System.out.println(totalRows);
//		String name = driver.findElement(By.xpath("(//td[text()='Rishabh'])[1]")).getText();
//		System.out.println(name);
//		// dynamic webTable Handling
//
//		List<WebElement> phoneNumbers = driver.findElements(By.xpath("//table[@id='tblEmployee']//td[3]"));
//		for (WebElement x : phoneNumbers) {
//			if (x.getText().equals("8919790522")) {
//				System.out.println(x.getText());
//				isStatus = true;
//			}
//		}
//		Assert.assertEquals(isStatus, true);
//
//	}
   
	
	@Test
	public void calender()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().deleteAllCookies();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//a[contains(.,'Employee')]")).click();
		driver.findElement(By.xpath("//a[contains(.,' Create ')]")).click();
		driver.findElement(By.xpath("//div[@class='input-group-addon']")).click();
	}
}
