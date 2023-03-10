package Testing.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase4 {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.google.com");
	driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Sanjeev");
	driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Kumar");
	driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("8573450525");
	driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("india");
	driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("chandigarh");
	driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("sanju@gmail.com");
	//String a=driver.getCurrentUrl();
	//System.out.println(a);
	//System.out.println(driver.getPageSource());
	
	Select drop=new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")));
	System.out.println(drop.getOptions().size());
	List<WebElement> e=drop.getOptions();
	for(WebElement a:e) {
		System.out.println(a.getText());
	}
	drop.deselectByVisibleText("morning");
	//drop.selectByValue("Radio-2");
	//drop.selectByIndex(0);
//	WebElement male=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
//	System.out.println(male.isDisplayed());
//	System.out.println(male.isEnabled());
//	System.out.println("Before Select"+male.isSelected());
//	male.click();
	
	driver.findElement(By.linkText("Software Testing Tutorials")).click();
	//Thread.sleep(3000);
	System.out.println(driver.getTitle());
	
	
	
	
	

	
}


}