package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public ExtentReports extentReports() throws IOException {
		ExtentReports extentReports = new ExtentReports();

		File f = new File(System.getProperty("user.dir") + "\\test-output\\extentReports\\reports.html");
		ExtentSparkReporter ExtentSparkReporter = new ExtentSparkReporter(f);
		ExtentSparkReporter.config().setTheme(Theme.DARK);
		ExtentSparkReporter.config().setReportName("JALA TECHNOLOGIES Report");
		ExtentSparkReporter.config().setDocumentTitle("JALA TECHNOLOGIOES AUTOMATION REPORT");
		ExtentSparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		extentReports.attachReporter(ExtentSparkReporter);

		Properties configProp = new Properties();
		File configPropFile = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Config\\config.properties");
		FileInputStream fis = new FileInputStream(configPropFile);
		configProp.load(fis);
		extentReports.setSystemInfo("Application url", configProp.getProperty("url"));
		extentReports.setSystemInfo("Browser Name", configProp.getProperty("browser"));
		extentReports.setSystemInfo("OS Name", System.getProperty("os.name"));
		extentReports.setSystemInfo("User Name", System.getProperty("user.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		return extentReports;

	}

}
