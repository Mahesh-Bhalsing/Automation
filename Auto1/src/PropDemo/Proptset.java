package PropDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Proptset {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f=new File("D:\\BhanuPratap\\Auto1\\src\\PropDemo\\data.properties");
		
		FileInputStream fi=new FileInputStream(f);
		
		Properties pro=new Properties();
		
		try {
			pro.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get(pro.getProperty("URL"));
		
		
		

	}

}
