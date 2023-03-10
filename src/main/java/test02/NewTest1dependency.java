package test02;

import org.testng.annotations.Test;
import org.testng.Assert;


public class NewTest1dependency {
  @Test()
  public void f() {
	  Assert.assertTrue(true);
	  Assert.assertEquals("sanju", "sanju","strings are equal");
	  
  }
}
