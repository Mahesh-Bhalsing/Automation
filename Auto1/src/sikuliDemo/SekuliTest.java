package sikuliDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;



public class SekuliTest {

	public static void main(String[] args) throws SikuliException  {
		
		Screen src=new Screen();
		
		Pattern image=new Pattern("D:\\sikuliImages\\gmaillogin.png");
		
		 System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
			
			WebDriver dr=new FirefoxDriver();
			
			dr.get("http:\\www.google.com");
		
		     src.click(image);
		     
		     dr.close();
		

	}

}
