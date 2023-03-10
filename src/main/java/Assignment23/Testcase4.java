package Assignment23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {
public static void main(String[] args) {
	//1 Launch Chrome browser.
	WebDriver driver=new ChromeDriver();
	//2 . Open this URL - www.amazon.in
	
	driver.get("http://www.amazon.in");
	
	//3. Maximize or set size of browser window.
    driver.manage().window().maximize();
    //4. Get the page title and print it.
    System.out.println(driver.getTitle());
    //count header link
    WebElement s=  driver.findElement(By.id("navbar-main"));
	 List<WebElement> e= s.findElements(By.tagName("a"));
	 System.out.println(e.size());
	//count footer link 
	 WebElement s1=  driver.findElement(By.id("navFooter"));
	 List<WebElement> e1= s.findElements(By.tagName("a"));
	 System.out.println(e1.size());
	 //close the browser
	 driver.quit();
}
}
