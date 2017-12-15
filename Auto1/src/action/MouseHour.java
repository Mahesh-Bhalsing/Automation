package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHour {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		dr.get("http://toolsqa.com/selenium-webdriver/mouse-hover-action/");
		
		dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
     WebElement element=dr.findElement(By.xpath(".//*[@id='primary-menu']/li[2]/a/span[1]/span/span"));
     
     WebElement element1=dr.findElement(By.linkText("Web Automation Tools"));
     Actions action=new Actions(dr);
     action.moveToElement(element)
     .click(element1).build()
     .perform();
     /*dr.findElement(By.xpath(".//*[@id='primary-menu']/li[2]/ul/li[1]/a/span[1]/span/span")).click();*/
     

	}

}
