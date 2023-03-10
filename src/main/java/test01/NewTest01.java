package test01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class NewTest01 {
  @Test(groups = "software")
  public void Test1() {
	  System.out.println("test1");
	  
  }
  @Test(groups ={"hardware", "software"}) 
  public void Test2() {
	  System.out.println("test2");
  }
  @BeforeMethod(groups ="hardware")
  public void beforemethod () {
	  System.out.println("before method");
  }
  @AfterMethod
  public void Aftermethod () {
	  System.out.println("before method");
  }
  @BeforeTest
  public void beforetest() {
	  System.out.println("before test");
  }
  
  @AfterTest
  public void AfterTest() {
	  System.out.println("afterTest");
	  
  }
  @BeforeSuite
  public void beforesuite() {
	  System.out.println("before suite");
  }
  @AfterSuite
  public void Aftersuite() {
	  System.out.println("after suite");
  }
  @BeforeClass
  public void beforeclass() {
	  System.out.println("before class");
  }
  @AfterClass
  public void Afterclass() {
	  System.out.println("Afterclass");
  }
  
}
