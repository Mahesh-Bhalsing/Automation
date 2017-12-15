package alertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmPopUp {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    
				driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
				
			WebElement element=	driver.findElement(By.xpath(".//*[@id='content']/p[8]/button"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
				
				Alert confirmationAlert = driver.switchTo().alert();
				String alertText = confirmationAlert.getText();
				System.out.println("Alert text is " + alertText);
				confirmationAlert.dismiss();

	}

}
