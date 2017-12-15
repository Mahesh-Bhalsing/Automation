package datePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("https://jqueryui.com/datepicker/");
		
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		dr.findElement(By.id("datepicker")).click();
		
		//dr.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
		
	}

}
