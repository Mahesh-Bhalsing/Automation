package ExtendRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentRepoDemo {
	ExtentReports reports;
	ExtentTest  logger;
	WebDriver dr;
	
	@Test
	public void veriftTittle(){
		
	reports=new ExtentReports("C:\\ExRepo.html");
	logger=reports.startTest("TestOneVerifyTittle");
	 System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
	 dr=new FirefoxDriver();
	logger.log(LogStatus.INFO, "Browser Started");
	dr.get("https://www.google.com");
    logger.log(LogStatus.INFO, "Application Up And Running");
    String str=dr.getTitle();
    
    Assert.assertTrue(str.contains(str));
	
    logger.log(LogStatus.INFO, "Pass");
    
    dr.close();
	}
}
