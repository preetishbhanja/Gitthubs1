package firstmavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  
@Test
  public void facebook() {
	  
WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
driver.get("http://facebook.com");

driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
driver.findElement(By.id("pass")).sendKeys("gudubabu");
driver.findElement(By.cssSelector("input[type='submit']")).click();
}
}