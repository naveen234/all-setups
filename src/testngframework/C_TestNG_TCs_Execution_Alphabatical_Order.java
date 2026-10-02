package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class C_TestNG_TCs_Execution_Alphabatical_Order {
	WebDriver driver;
	@Ignore
  @Test
  public void zomato() {
		 driver.get("https://www.zomato.com"); 
	  }
	  @Test(enabled=false)
	  public void twitter() {
		 driver.get("https://www.x.com"); 
	  }
	  @Test
	  public void facebook() {
		 driver.get("https://www.facebook.com"); 
	  }
	  @Test
	  public void selenium() {
		 driver.get("https://www.selenium.dev"); 
	  }
	  @Test(enabled=false)
	  public void redmine() {
		 driver.get("https://www.redmine.org"); 
	  }
	  @Test(enabled=true)
	  public void swiggy() {
		 driver.get("https://www.swiggy.com"); 
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();	
  }

}
