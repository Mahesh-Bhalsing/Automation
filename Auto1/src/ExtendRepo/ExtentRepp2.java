package ExtendRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentRepp2 {

	public static void main(String[] args) {
		
		ExtentReports extent;
		
		extent = new ExtentReports("C:\\ExRepo", true);
		
		 ExtentTest test = extent.startTest("My First Test", "Sample description");
		
		System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("https://www.google.com");

	    String str=dr.getTitle();
	    
	    if(str=="google"){
	    
	    System.out.println("Test");
	    }

	}

}
