package Assignment23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
public static void main(String[] args) {
	//1 Launch Chrome browser.
	WebDriver driver=new ChromeDriver();
	//2 . Open this URL - www.amazon.in
	driver.get("http://www.amazon.in");
	//3. Maximize or set size of browser window.
    driver.manage().window().maximize();
    //4. Get the page title and print it.
  
    String s=driver.getTitle();
    System.out.println(s);
    //5. Now, click on menu link say 'Amazon Pay' (or choose any other link from the menu list) //taking Phone menu link
   driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
   //6. Get the page title and print it.
   System.out.println(driver.getTitle());
   //7. Navigate back to Home Page
   driver.navigate().back();
   //8. Get the page title and print it. Verify that value matches with output of point no. 4
   String s2=driver.getTitle();
   System.out.println(s2);
   if(s2.equals(s)) {
	   System.out.println("Title Matched");
   }
   else {
	   System.out.println("Title not Matched");
   }
   //9. Close the browser.

   driver.close();
  // driver.findElement(By.xpath("//div[@id='nav-xshop']")).click();
  // System.out.println(driver.getTitle());
   
}
}
