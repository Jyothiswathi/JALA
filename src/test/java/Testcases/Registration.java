package Testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import PageClasses.RegistrationPage;
import Utilities.DriverFactory;
import Utilities.Setup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
public	WebDriver driver = null;

	RegistrationPage RegistrationPage;

	@BeforeMethod(groups = { "smoke" })
	public void setup() throws IOException {
		Setup Setup = new Setup();
		driver = Setup.setupBrowser();
		RegistrationPage = new RegistrationPage(driver);
		driver.get("https://magnus.jalatechnologies.com/");
		LoginPage Login = new LoginPage(driver);
		Login.doLoginWithValidCredientials("training@jalaacademy.com","jobprogram");
		
		RegistrationPage.NavigationToRegistrationPage();
	}

	@Test(priority = 1, groups = { "smoke" })
	public void registrationWithAllFields() throws FileNotFoundException {
		boolean isRegistered=false;

		isRegistered	=RegistrationPage.registerWithAllFields();
		Assert.assertTrue(isRegistered);
	}

	@Test(priority = 2)
	public void registrationWithRequiredFields() throws InterruptedException, IOException {
		RegistrationPage.registerWithMandatoryFields();
	}

	@Test(priority = 3)
	public void RegistrationWithOutGivingFields() {

		RegistrationPage.RegistrationWithOutGivingFields();
	}

	@Test(priority = 5)
	public void registrationWithNonMandatoryFields() {
		RegistrationPage.registrationWithNonMandatoryFields();

	}

	@Test(priority = 4)
	public void registerWithDuplicateField() {
		RegistrationPage.registrationwithDuplicateFields();
	}

	@AfterMethod(groups = { "smoke" })
	public void teardown() {
		driver.quit();
	}
	

}
