package PageClasses;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelReader1;

public class LoginPage {

	@FindBy(id = "UserName")
	WebElement LoginUserName;
	@FindBy(id = "Password")
	WebElement password;
	@FindBy(id = "btnLogin")
	WebElement submit;
	@FindBy(xpath = "//a[contains(.,'Home')]")
	WebElement home;
	@FindBy(xpath="//span[text()='Logout']")
	WebElement logout;

public	WebDriver driver = null;
	ExcelReader1 testData = new ExcelReader1("C:\\JALA\\src\\test\\resources\\ExcelData\\login.xlsx");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean doLoginWithValidCredientials(String userName,String password) throws IOException {
		boolean isLogin=false;
		try {
			List<Map<String, String>> loginTestData = testData.getExcelAsMap("login");
for(int i=0;i<loginTestData.size();i++)
{
			LoginUserName.sendKeys(loginTestData.get(i).get("user name"));
			this.password.sendKeys(loginTestData.get(i).get("password"));
			submit.click();
			isLogin=home.isDisplayed();
			//logout.click();
			Thread.sleep(5000);
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isLogin;
		

	}

}
