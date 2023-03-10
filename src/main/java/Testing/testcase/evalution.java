package Testing.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class evalution { 
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("");
	 String title=driver.getTitle();
	
		
		System.out.println(title);
		String actualTitle="Login: Mercury Tours"; 
		if(actualTitle.equals(title)) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fsil");
		}
		
	
}
}


