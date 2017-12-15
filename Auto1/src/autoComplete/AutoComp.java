package autoComplete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("http://www.google.com");
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenium suresh");
		
		Thread.sleep(3000);
		System.out.println("First Time Arrow key Pressed");
		dr.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		
	     Thread.sleep(3000);
		System.out.println("Second Time Arrow key Pressed");
		dr.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		
		dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	    
		

	}

}
