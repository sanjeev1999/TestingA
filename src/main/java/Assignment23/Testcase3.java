package Assignment23;

import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
public static void main(String[] args) throws InterruptedException {
	     
	     //1 Launch Chrome browser.
			WebDriver driver=new ChromeDriver();
			//2 . Open this URL - www.amazon.in
			
			driver.get("http://www.amazon.in");
			
			//3. Maximize or set size of browser window.
		    driver.manage().window().maximize();
		    //4. Get the page title and print it.
		    System.out.println(driver.getTitle());
		 WebElement s=  driver.findElement(By.xpath("//div[@id='nav-xshop']"));
		 List<WebElement> e= s.findElements(By.tagName("a"));
		 for(WebElement menu:e) {
			menu.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			Thread.sleep(2000);
		 }
	      System.out.println("completed");
	    driver.close();
			
}
}
