package windowHandlesDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleTest {

	public static void main(String[] args) {


   System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("http:www.gmail.com");
		
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String P_Window=dr.getWindowHandle();
		
		Set<String> s1=dr.getWindowHandles();
		 
		Iterator<String>i=s1.iterator();
		
		while(i.hasNext()){
		
		String cwindow=i.next();
		
		if(!P_Window.equalsIgnoreCase(cwindow));{
		
		dr.switchTo().window(cwindow);
	
		dr.close();
		
		
		}
		
		
		
	}

	}
	
}
