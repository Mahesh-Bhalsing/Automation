package countLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("http://www.google.com");
		
		List<WebElement> webl =dr.findElements(By.tagName("a"));
		
          int linkcount= webl.size();
          
          System.out.println(linkcount);
	
          for(WebElement linkc:webl)
          {
        	  
        	  System.out.println(linkc.getAttribute("href"));
          }
	}

}
