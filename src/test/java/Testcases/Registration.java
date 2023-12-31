package Testcases;

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
import Utilities.Base;
import Utilities.DriverFactory;
import Utilities.Setup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
	public WebDriver driver = null;

	RegistrationPage RegistrationPage;

	@BeforeMethod(groups = { "smoke" })
	public void setup() throws IOException {
		Setup Setup = new Setup();
		driver = Setup.setupBrowser();
		RegistrationPage = new RegistrationPage(driver);
		driver.get("https://magnus.jalatechnologies.com/");
		LoginPage Login = new LoginPage(driver);
		Login.doLoginWithValidCredientials("training@jalaacademy.com", "jobprogram");

		RegistrationPage.NavigationToRegistrationPage();
	}

	@Test(priority = 1, groups = { "smoke" })
	public void registrationWithAllFields() throws IOException, InterruptedException {
		boolean isValidation = false;
		RegistrationPage.registerWithAllFields();
		isValidation = RegistrationPage.validateRegistrationPage();
		Assert.assertTrue(isValidation, "Validation of register with all  fields are failed");
	}

	@Test(priority = 2)
	public void registrationWithRequiredFields() throws InterruptedException, IOException {
		boolean isvalidation = false;
		isvalidation = RegistrationPage.registerWithMandatoryFields();
		Assert.assertTrue(isvalidation, "Validation of registration with required fields are failed");
	}

	@Test(priority = 3)
	public void RegistrationWithOutGivingFields() {
		boolean isvalidation = false;

		isvalidation = RegistrationPage.RegistrationWithOutGivingFields();
		Assert.assertTrue(isvalidation, "validation of Registration without giving any fields are failed");
	}

	@Test(priority = 3)
	public void registrationWithNonMandatoryFields() {
		boolean isValidation = false;
		isValidation = RegistrationPage.registrationWithNonMandatoryFields();
		Assert.assertTrue(isValidation, "validation of registration with only non mandatory fields are failed");

	}

	@Test(priority = 0)
	public void registerWithDuplicateField() throws IOException, InterruptedException {
		boolean isValidation = false;
		RegistrationPage.registrationwithDuplicateFields();
		isValidation = RegistrationPage.validateRegistrationPage();
		Assert.assertTrue(isValidation, "Validation of registrationWithDuplicate fields are failed");

	}

	@AfterMethod(groups = { "smoke" })
	public void teardown() {
		driver.quit();
	}

}
