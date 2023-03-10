package Assignment23;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase2 {
public static void main(String[] args) throws InterruptedException {
	//1 Launch Chrome browser.
		WebDriver driver=new ChromeDriver();
		//2 . Open this URL - www.amazon.in
		driver.get("http://www.amazon.in");
		//3. Maximize or set size of browser window.
	    driver.manage().window().maximize();
	    //4. Get the page title and print it.
	System.out.println(driver.getTitle());
//	5. Click on menu link, say 'Amazon Pay'.
//	6. Get Page title and verify it with expected value.
//	7. Navigate back to Home Page.
//	8. Get Page title and verify it with expected value.
//	9. Repeat steps 5 to 8 for other menu links.
	List<String> xpath = new ArrayList<String>();
	xpath.add("//a[normalize-space()='Amazon miniTV']");
	xpath.add("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']");
	xpath.add("//a[normalize-space()='Mobiles']");
	xpath.add("//div[@id='nav-xshop']");
	xpath.add("//a[contains(@href,'/deals?ref_=nav_cs_gb')]");
	xpath.add("//a[normalize-space()='Electronics']");
	xpath.add("//a[normalize-space()='Amazon Pay']");
	xpath.add("//a[normalize-space()='Fashion']");
	xpath.add("//a[@href='/gp/new-releases/?ref_=nav_cs_newreleases']");
	
	List<String> title=new ArrayList<String>();
	title.add("");
	title.add("Amazon.in Bestsellers: The most popular items on Amazon");
	title.add("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in");
	title.add("Help - Amazon Customer Service");
	title.add("Amazon.in - Today's Deals");
	title.add("Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in");
	title.add("Amazon Pay");
	title.add("Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids");
	title.add("Amazon.in Hot New Releases: The bestselling new and future releases on Amazon");
	
	for(int i=0;i<9;i++) {
	driver.findElement(By.xpath(xpath.get(i))).click();
	if(driver.getTitle().equals(title.get(i))) {
		System.out.println("test pass");
		driver.navigate().back();
		Thread.sleep(2000);
		
	}
	else {
		System.out.println("not pass");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	}
	//10. Close the browser

	driver.close();
	}
	}
	
	
	
	
 
    
