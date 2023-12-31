package PageClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.Base;
import Utilities.ExcelReader1;

public class RegistrationPage extends Base {
	public WebDriver driver = null;

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
	private By Nameserchbox = By.id("Name");
	private By mobileNoSearchbox = By.id("MobileNo");
	private By searchBtn = By.id("btnSearch");
	private By FirstRecord = By
			.xpath("(//table[@id='tblEmployee']//td//parent::tr)[1]//descendant::td[text()='7993685486']");

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	ExcelReader1 testData = new ExcelReader1("C:\\JALA\\src\\test\\resources\\ExcelData\\Registration.xlsx");

	public boolean registerWithAllFields() {
		boolean isRegister = false;
		try {
			List<Map<String, String>> registerTestData = testData.getExcelAsMap("register");
			sendkeys(firstName, registerTestData.get(0).get("First Name"));
			sendkeys(lastName, registerTestData.get(0).get("Last Name"));
			sendkeys(EmailId, registerTestData.get(0).get("Email"));
			sendkeys(MobileNo, registerTestData.get(0).get("Mobile Number"));
			click(calendar);
			sendkeys(DOB, registerTestData.get(0).get("Date Of Birth"));
			click(gender);
			// sendkeys(Address, registerTestData.get(0).get("Address"));
			selectByText(Country, "Bangladesh");
			click(AWS);
			click(QAAutomation);
			click(save);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isRegister;

	}

	public void registrationwithDuplicateFields() {
		try {
			
			List<Map<String, String>> registerTestData = testData.getExcelAsMap("register");
			sendkeys(firstName, registerTestData.get(0).get("First Name"));
			sendkeys(lastName, registerTestData.get(0).get("Last Name"));
			sendkeys(EmailId, registerTestData.get(0).get("Email"));
			sendkeys(MobileNo, registerTestData.get(0).get("Mobile Number"));
			click(calendar);
			sendkeys(DOB, registerTestData.get(0).get("Date Of Birth"));
			click(gender);
			// sendkeys(Address, registerTestData.get(0).get("Address"));
			selectByText(Country, "Bangladesh");

			click(AWS);
			click(QAAutomation);
			click(save);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NavigationToRegistrationPage() {
		try {
			click(Employ);
			click(create);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean registrationWithNonMandatoryFields() {
		try {
			boolean isdisplayed = false;
			List<Map<String, String>> registerTestData = testData.getExcelAsMap("register");
			click(calendar);
			sendkeys(DOB, registerTestData.get(0).get("Date Of Birth"));
			click(gender);
			// sendkeys(Address, registerTestData.get(0).get("Address"));
			selectByText(Country, registerTestData.get(0).get("Country"));
			click(AWS);
			click(QAAutomation);
			Thread.sleep(2000);
			click(save);
			Thread.sleep(3000);
			isdisplayed = isDisplayed(RegistrationValidation);
			Assert.assertTrue(isdisplayed);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDisplayed(RegistrationValidation);

	}

	public boolean registerWithMandatoryFields() throws InterruptedException, IOException {
		boolean isValidate=false;

		try {
			List<Map<String, String>> registerTestData = testData.getExcelAsMap("register");
			List<String> ExpectedData=new ArrayList<String>();
			List<String> actualData=new ArrayList<String>();		
			sendkeys(firstName, registerTestData.get(0).get("First Name"));
			sendkeys(lastName, registerTestData.get(0).get("Last Name"));
			sendkeys(EmailId, registerTestData.get(0).get("Email"));
			sendkeys(MobileNo, registerTestData.get(0).get("Mobile Number"));
			click(save);
			sendkeys(Nameserchbox, registerTestData.get(0).get("First Name"));
			sendkeys(mobileNoSearchbox, registerTestData.get(0).get("Mobile Number"));
			click(searchBtn);
			Thread.sleep(5000);
			ExpectedData.add(registerTestData.get(0).get("First Name"));
			ExpectedData.add(registerTestData.get(0).get("Last Name"));
			ExpectedData.add(registerTestData.get(0).get("Email"));
			ExpectedData.add(registerTestData.get(0).get("Mobile Number"));
			List<WebElement> elements = driver
					.findElements(By.xpath("(//table[@id='tblEmployee']//td//parent::tr)[1]//descendant::td"));
			for (WebElement x : elements) {
				String eachElement = x.getText();
				actualData.add(eachElement);
			}
			actualData.removeAll(Arrays.asList("", null, " ", "Edit  Delete"));
			int count = 0;
			for (int i = 0; i < actualData.size(); i++) {
				if (ExpectedData.contains(actualData.get(i)))			
				count++;
			}
			if (count == ExpectedData.size()) {
				isValidate = true;
			}
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return isValidate;
	}

	public boolean RegistrationWithOutGivingFields() {
		try {
			click(save);
			isDisplayed(RegistrationValidation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDisplayed(RegistrationValidation);

	}

	public boolean validateRegistrationPage() throws IOException, InterruptedException {
		boolean isValidate = false;
		List<Map<String, String>> registerTestData = testData.getExcelAsMap("register");
		Map<String, String> firstrow = registerTestData.get(0);
		Set<String> allheaders = firstrow.keySet();
		List<String> ExpectedData = new ArrayList<String>();
		List<String> actualData = new ArrayList<String>();
		for (String x : allheaders) {
			ExpectedData.add(firstrow.get(x).trim());
			ExpectedData.remove(Arrays.asList("", null, " "));
		}
		sendkeys(Nameserchbox, registerTestData.get(0).get("First Name"));
		sendkeys(mobileNoSearchbox, registerTestData.get(0).get("Mobile Number"));
		click(searchBtn);
		Thread.sleep(5000);
		List<WebElement> elements = driver
				.findElements(By.xpath("(//table[@id='tblEmployee']//td//parent::tr)[1]//descendant::td"));
		for (WebElement x : elements) {
			String eachElement = x.getText();
			actualData.add(eachElement);
		}
		actualData.removeAll(Arrays.asList("", null, " ", "Edit  Delete"));
		int count = 0;
		for (int i = 0; i < actualData.size(); i++) {
			if (ExpectedData.contains(actualData.get(i)))
				;
			count++;
		}
		if (count == ExpectedData.size()) {
			isValidate = true;
		}
		return isValidate;
	}
}
