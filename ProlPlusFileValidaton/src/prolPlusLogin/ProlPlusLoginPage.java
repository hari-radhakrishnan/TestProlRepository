package prolPlusLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProlPlusLoginPage {
  WebDriver driver;
  public ProlPlusLoginPage(WebDriver driver) {
	  this.driver = driver;
	  
  }
  public void username () {
	  driver.findElement(By.name("Username")).sendKeys("kanila");
  }
  public void password () {
	  driver.findElement(By.name("Password")).sendKeys("Richmond1010!");
  }
  public void login () {
	  driver.findElement(By.id("login-btn")).click();
  }
}
