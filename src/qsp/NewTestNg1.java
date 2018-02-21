package qsp;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNg1 
{
  @Test
  public void testA() 
  {
	  Reporter.log("testA",true);
  }
  
  @Test
  public void testB() 
  {
	  Reporter.log("testB",true);
  }
  
  @Test
  public void testC() 
  {
	  Reporter.log("testC",true);
	  Assert.fail();
  }
}
