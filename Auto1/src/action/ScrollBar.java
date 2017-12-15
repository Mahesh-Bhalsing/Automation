package action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ScrollBar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("https://www.myrightbuy.com");
		
		Actions action=new Actions(dr);

	
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		System.out.println("Scroll completeed");
	}

}
