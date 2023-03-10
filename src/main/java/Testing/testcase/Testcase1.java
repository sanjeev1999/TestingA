package Testing.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.google.com");
	driver.get("http://www.demo.guru99.com/test/newtours/");
//	driver.findElement(By.name("userName")).sendKeys("mercury");
//	driver.findElement(By.name("password")).sendKeys("mercury");
//    driver.findElement(By.name("submit")).click();
	
//	driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("mercury");
//	driver.findElement(By.cssSelector("input[name=password]")).sendKeys("mercury");
//  driver.findElement(By.cssSelector("input[name=submit")).click();
	
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
    driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	
    
    String title=driver.getTitle();
	
	System.out.println(title);
	String actualTitle="Login: Mercury Tours"; 
	if(actualTitle.equals(title)) {
		System.out.println("test pass");
	}
	else {
		System.out.println("test fail");
	}
   //  String windowhandle= driver.getWindowHandle();
	//driver.getWindowHandle);
	
}
}