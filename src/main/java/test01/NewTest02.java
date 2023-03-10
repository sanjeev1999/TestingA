package test01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest02 {
	 @Test(groups="software",invocationCount = 5)
	  public void Test3() {
		  System.out.println("test3");
		  
		  
	  }
	 @Test()
	  public void Test4() {
		  System.out.println("test4");
	  }
	 
	 @Test(groups="add")
	    @Parameters ({"val1", "val2"})
	    public void Sum(int v1, int v2) {
	    	int finalsum = v1 + v2;
	        System.out.println("The final sum of the given values is " + finalsum);
	    }
	 
	 
	 
	  
}

