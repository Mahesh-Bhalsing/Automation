package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javafx.scene.shape.MoveTo;

public class Drag_DropAction {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:\\selgeko\\geckodriver.exe");
	
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
		
		dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement From=dr.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
	    WebElement To=dr.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
        
	    Actions builder=new Actions(dr);
	    
	    Action dragAndDrop=builder.clickAndHold(From)
	    		.moveToElement(To)
	    		.release(To)
	    		.build();
	    
	    dragAndDrop.perform();
	    
	}

}
