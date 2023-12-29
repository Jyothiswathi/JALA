package PageClasses;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import Utilities.DriverFactory;
import Utilities.ExcelReader1;
import Utilities.Setup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {
public	WebDriver driver = null;

	private By Employ = By.xpath("//a[contains(.,'Employee')]");
	private By create = By.xpath("//a[contains(.,'Create')]");
	private By firstName = By.id("FirstName");
	private By lastName = By.id("LastName");
	private By EmailId = By.id("EmailId");
	private By MobileNo = By.id("MobileNo");
	private By calendar = By.xpath("//i[@class='fa fa-calendar']");
	private By DOB = By.id("DOB");
	private By gender = By.id("rdbFemale");
	private By Address = By.id("Address");
	private By Country = By.id("CountryId");
	private By City = By.id("CityId");
	private By AWS = By.xpath("//div[contains(text(),'AWS')]//descendant::input");
	private By QAAutomation = By.xpath("//div[contains(text(),'QA-Automation')]//descendant::input");
	private By save = By.xpath("//button[text()='Save']");
	private By RegistrationValidation = By.xpath("//div[text()='Please fill all the required field first']");

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	ExcelReader1 testData = new ExcelReader1("C:\\JALA\\src\\test\\resources\\ExcelData\\Registration.xlsx");


	public boolean registerWithAllFields() {
		boolean isRegister=false;
		try {
			List<Map<String, String>> registerTestData = testData.getExcelAsMap("register");
			driver.findElement(firstName).sendKeys(registerTestData.get(0).get("First Name"));
			driver.findElement(lastName).sendKeys(registerTestData.get(0).get("Last Name"));
			driver.findElement(EmailId).sendKeys(registerTestData.get(0).get("Email"));
			driver.findElement(MobileNo).sendKeys(registerTestData.get(0).get("Mobile Number"));
			driver.findElement(calendar).click();
			driver.findElement(DOB).sendKeys(registerTestData.get(0).get("Date Of Birth"));
			driver.findElement(gender).click();
			driver.findElement(Address).sendKeys(registerTestData.get(0).get("Address"));
			Select s = new Select(driver.findElement(Country));
			s.selectByIndex(1);
			Select s1 = new Select(driver.findElement(City));
			s.selectByIndex(1);
			driver.findElement(AWS).click();
			driver.findElement(QAAutomation).click();
			driver.findElement(save).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isRegister;

	}

	public void registrationwithDuplicateFields() {
		try {
			List<Map<String, String>> registerTestData = testData.getExcelAsMap("register");
			driver.findElement(firstName).sendKeys(registerTestData.get(0).get("First Name"));
			driver.findElement(lastName).sendKeys(registerTestData.get(0).get("Last Name"));
			driver.findElement(EmailId).sendKeys(registerTestData.get(0).get("Email"));
			driver.findElement(MobileNo).sendKeys(registerTestData.get(0).get("Mobile Number"));
			driver.findElement(calendar).click();
			driver.findElement(DOB).sendKeys(registerTestData.get(0).get("Date Of Birth"));
			driver.findElement(gender).click();
			driver.findElement(Address).sendKeys(registerTestData.get(0).get("Address"));
			Select s = new Select(driver.findElement(Country));
			s.selectByIndex(1);
			Select s1 = new Select(driver.findElement(City));
			s.selectByIndex(1);
			driver.findElement(AWS).click();
			driver.findElement(QAAutomation).click();
			driver.findElement(save).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void NavigationToRegistrationPage()
	{
		try {
			driver.findElement(Employ).click();;
			driver.findElement(create).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void registrationWithNonMandatoryFields() {
		try {
			boolean isdisplayed = false;
			List<Map<String, String>> registerTestData = testData.getExcelAsMap("register");
			driver.findElement(calendar).click();
			driver.findElement(DOB).sendKeys(registerTestData.get(0).get("Date Of Birth"));
			driver.findElement(gender).click();
			driver.findElement(Address).sendKeys(registerTestData.get(0).get("Address"));
			Select s = new Select(driver.findElement(Country));
			s.selectByIndex(1);
			Select s1 = new Select(driver.findElement(City));
			s.selectByIndex(1);
			driver.findElement(AWS).click();
			driver.findElement(QAAutomation).click();
			driver.findElement(save).click();
			isdisplayed = driver.findElement(RegistrationValidation).isDisplayed();
			Assert.assertTrue(isdisplayed);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void registerWithMandatoryFields() throws InterruptedException, IOException {
		try {
			List<Map<String, String>> registerTestData = testData.getExcelAsMap("register");

			driver.findElement(firstName).sendKeys(registerTestData.get(0).get("First Name"));
			driver.findElement(lastName).sendKeys(registerTestData.get(0).get("Last Name"));
			driver.findElement(EmailId).sendKeys(registerTestData.get(0).get("Email"));
			driver.findElement(MobileNo).sendKeys(registerTestData.get(0).get("Mobile Number"));
			driver.findElement(save).click();

			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void RegistrationWithOutGivingFields() {
		try {
			boolean isDisplayed = false;
			driver.findElement(save).click();
			isDisplayed = driver.findElement(RegistrationValidation).isDisplayed();
			Assert.assertTrue(isDisplayed);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
