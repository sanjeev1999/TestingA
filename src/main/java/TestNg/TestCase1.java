package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	WebDriver driver=new ChromeDriver();
	
	
	
@Test(priority=2)
	  public void login() throws InterruptedException {
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
 
  @Test(priority=3)
  public void close() {
	 // driver.close();
  }
  @Test(priority=1)
  public void Openapp() throws InterruptedException {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
		 
	 }
  
  
  
 
  
 
 
}
