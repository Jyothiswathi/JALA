package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	Setup Setup=new Setup();
	WebDriver driver =Setup.geDriver();

	
	
	
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	public void click(By ele) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(ele)).click().build().perform();
	}
	public void clickUsingWebElement(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement((ele)).click().build().perform();
	}


	public boolean findElement(WebDriver driver, WebElement ele) {
		boolean isDisplayed = false;
		try {
			ele.isDisplayed();
			isDisplayed = true;
		} catch (Exception e) {

			isDisplayed = false;
		} finally {
			if (isDisplayed) {
				System.out.println("successfully found element");
			} else {
				System.out.println("unable to locate the element");
			}
		}
		return isDisplayed;
	}

	public boolean isSelected(WebDriver driver, WebElement ele) {
		boolean isSelected = false;
		isSelected = findElement(driver, ele);
		if (isSelected) {
			isSelected = ele.isSelected();
			if (isSelected) {
				System.out.println("the element is selected");
			} else {
				System.out.println("the element is selected");
			}
		} else {
			System.out.println("the element is  not selected");
		}
		return isSelected;

	}

	public boolean isEnabled(WebDriver driver, WebElement ele) {
		boolean isEnabled = false;
		isEnabled = findElement(driver, ele);
		if (isEnabled) {
			isEnabled = ele.isEnabled();
			if (isEnabled) {
				System.out.println("The element is enabled");
			} else {
				System.out.println("The element is not enabled");
			}
		} else {
			System.out.println("Not Enabled");
		}
		return isEnabled;
	}

	boolean type(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}

		}
		return flag;
	}

	public void sendkeys(By ele, String text) {
		boolean isSendKeyys = false;
		try {
			isSendKeyys = driver.findElement(ele).isDisplayed();
			driver.findElement(ele).clear();
			driver.findElement(ele).sendKeys(text);
			isSendKeyys = true;
		} catch (Exception e) {
			System.out.println("Element not found");
			isSendKeyys = false;

		} finally {
			if (isSendKeyys) {
				System.out.println("Successfully entered value");
			} else

			{
				System.out.println("unable to locate a value");
			}
		}

	}
	
	public void sendkeysWithWebElement(WebElement ele, String text) {
		boolean isSendKeyys = false;
		try {
			isSendKeyys =ele.isDisplayed();
		(ele).clear();
			(ele).sendKeys(text);
			isSendKeyys = true;
		} catch (Exception e) {
			System.out.println("Element not found");
			isSendKeyys = false;

		} finally {
			if (isSendKeyys) {
				System.out.println("Successfully entered value");
			} else

			{
				System.out.println("unable to locate a value");
			}
		}

	}

	public boolean isDisplayed(By ele) {
		boolean isDisplayed = false;
		try {
			isDisplayed = driver.findElement(ele).isDisplayed();
			if (isDisplayed) {
				isDisplayed = true;
				System.out.println("Element was displayed");
			}

		} catch (Exception e) {
			System.out.println("Element was not displayed");

		}
		return isDisplayed;

	}
	public boolean isDisplayedByUsingWebElement(WebElement ele) {
		boolean isDisplayed = false;
		try {
			isDisplayed = (ele).isDisplayed();
			if (isDisplayed) {
				isDisplayed = true;
				System.out.println("Element was displayed");
			}

		} catch (Exception e) {
			System.out.println("Element was not displayed");

		}
		return isDisplayed;

	}
	
	
	public void selectByText(By ele, String text)
	{
		try {
			Select s=new Select(driver.findElement(ele));
			s.selectByVisibleText(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
