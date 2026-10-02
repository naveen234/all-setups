package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Alerts {
	WebDriver driver;
  @Test
  public void clickonokbuttoninalertwindow() throws InterruptedException {
  driver.get("https://www.baalabharathi.org/code/confirmation-dialog-box/");
	driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

}
