package Testcases;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClasses.LoginPage;
import Utilities.ExcelReader1;
import Utilities.Setup;

public class Login {
	public WebDriver driver = null;

	@BeforeMethod(groups= {"smoke"})
	public void setup() throws IOException {
		Setup Setup = new Setup();
		driver = Setup.setupBrowser();
		driver.get("https://magnus.jalatechnologies.com/");
	}

	@Test(groups = {"smoke"})
	public void doLogin() throws IOException {
		boolean isLogin = false;
		ExcelReader1 testData = new ExcelReader1("C:\\JALA\\src\\test\\resources\\ExcelData\\login.xlsx");

		List<Map<String, String>> loginTestData = testData.getExcelAsMap("login");
		//for (int i = 0; i < loginTestData.size(); i++) {
			String userName = loginTestData.get(0).get("user name");
			String password = loginTestData.get(0).get("password");
			LoginPage LoginPage = new LoginPage(driver);
			isLogin = LoginPage.doLoginWithValidCredientials(userName, password);
			SoftAssert s=new SoftAssert();
			s.assertTrue(isLogin, "please enter valid credientials");
			s.assertAll();
		//}
	}

	@AfterMethod(groups= {"smoke"})
	public void tearDown() {
		driver.quit();
	}

}
