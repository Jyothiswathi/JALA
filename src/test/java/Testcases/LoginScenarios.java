package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.Setup;

public class LoginScenarios extends Setup {
	WebDriver driver=null;

	@BeforeMethod
	public void initBrowesr() throws IOException
	{
		driver=setupBrowser();
	driver.get("https://magnus.jalatechnologies.com/");
	}
	
	
	@Test
	public void loginWithValidCredentials()
	{
		boolean isLogin=false;
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		isLogin=driver.findElement(By.xpath("//a[contains(.,' Home')]")).isDisplayed();
		Assert.assertTrue(isLogin);
		
	}
	@Test
	public void loginWithinValidCredientials()
	{
		boolean isLogin=false;

		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.co");
		driver.findElement(By.id("Password")).sendKeys("jobprogra");
		driver.findElement(By.id("btnLogin")).click();
		isLogin=driver.findElement(By.xpath("//div[text()='Invalid Email address or Password.']")).isDisplayed();
		Assert.assertTrue(isLogin);
		
	}
	
	@Test
	public void loginWithinValidEmail()
	{
		boolean isLogin=false;

		driver.findElement(By.name("UserName")).sendKeys("training@jalaacademy.co");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		isLogin=driver.findElement(By.xpath("//div[text()='Invalid Email address or Password.']")).isDisplayed();
		Assert.assertTrue(isLogin);
		
	}
	@Test
	public void loginWithinValiPassword()
	{
		boolean isLogin=false;

		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.co");
		driver.findElement(By.id("Password")).sendKeys("jobprogra");
		driver.findElement(By.id("btnLogin")).click();
		isLogin=driver.findElement(By.xpath("//div[text()='Invalid Email address or Password.']")).isDisplayed();
		Assert.assertTrue(isLogin);
		
	}
	@Test
	public void logout()
	{
		boolean isLogOut=false;

		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.xpath("//span[text()='Logout']")).click();
	isLogOut=driver.findElement(By.xpath("//h2[contains(text(),' Login Credentials')]")).isDisplayed();
	Assert.assertTrue(isLogOut);
		
	}
	
	@AfterMethod
	public void logOut()
	{
		driver.quit();
	}
	
}
