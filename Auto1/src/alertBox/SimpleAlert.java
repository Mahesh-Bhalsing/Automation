package alertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		
   System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
		Alert simpleAlert=driver.switchTo().alert();
		
		String alertText=simpleAlert.getText();
		System.out.println("The alert is"+alertText);
		simpleAlert.accept();
		
    
	}

}
