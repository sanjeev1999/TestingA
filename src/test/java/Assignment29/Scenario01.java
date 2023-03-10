package Assignment29;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;



public class Scenario01 {
	
WebDriver driver;
  @Test(priority=1)
  public void openBrowser() {
	 driver =new ChromeDriver();
  }
  @Test(priority=2)
  public void NavigateURL() {
	  driver.get("http://www.fb.com");
  }
  @Test(priority=3)
  public void testurl() {
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");

	   
  }
  
  @Test(priority=4)
  public  void verifybuton() {
	  Assert.assertEquals(driver.getPageSource().contains("Create new account"),true);
	  
	 
  }
  
  
}
