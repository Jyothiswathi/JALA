package Listeners;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utilities.ExtentReport;

public class Listeners implements ITestListener {
	ExtentReport ExtentReporter = new ExtentReport();
	ExtentReports extentReport;
	ExtentTest extentTest;

	@Override
	public void onTestStart(ITestResult result) {
		String TestCaseName = result.getName();
		extentTest = extentReport.createTest(TestCaseName);
		extentTest.log(Status.INFO, TestCaseName + "Start Executing");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String TestCaseName = result.getName();
		WebDriver driver = null;
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationSchreenshotPath=System.getProperty("user.dir")+"\\Screenshot\\"+TestCaseName+".png";
		try {
			org.openqa.selenium.io.FileHandler.copy(srcScreenshot, new File(destinationSchreenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		extentTest.addScreenCaptureFromPath(destinationSchreenshotPath);
		extentTest.log(Status.PASS, TestCaseName + " is Successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String TestCaseName = result.getName();
		WebDriver driver = null;
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationSchreenshotPath=System.getProperty("user.dir")+"\\Screenshot\\"+TestCaseName+".png";
		try {
			org.openqa.selenium.io.FileHandler.copy(srcScreenshot, new File(destinationSchreenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		extentTest.addScreenCaptureFromPath(destinationSchreenshotPath);
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.FAIL, TestCaseName + " Execution is failed ");	

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String TestCaseName = result.getName();
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.SKIP, TestCaseName + " is skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		try {
			 extentReport = ExtentReporter.extentReports();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Execute before running all testcases");

	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();

	}

}
