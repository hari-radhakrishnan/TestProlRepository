package prolPlusLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ProlPlusLoginTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://prolplus.qa.numeris.ca/AccountManagement/Account/Login?ReturnUrl=%2F");
	  ProlPlusLoginPage log = new ProlPlusLoginPage(driver);
	  log.username();
	  log.password();
	  log.login();
	  Actions action = new Actions(driver);
	  Thread.sleep(2000);
	  WebElement menu1 = driver.findElement(By.linkText("Program Line-Up"));
	  Thread.sleep(2000);
	  action.moveToElement(menu1).perform();
	  WebElement menu2 = driver.findElement(By.linkText("View Program Line-Up"));
	  Thread.sleep(2000);
	  action.moveToElement(menu2).perform();
	  menu2.click();
	  driver.findElement(By.id("previous-week-button")).click();
	  driver.findElement(By.id("previous-week-button")).click();
	  driver.findElement(By.id("previous-week-button")).click();
	  driver.findElement(By.id("previous-week-button")).click();
	  driver.findElement(By.id("previous-week-button")).click();
	  Thread.sleep(10000);
	  WebElement plu1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/table/tbody/tr/td/div/div/div[3]/table/tbody/tr/td[2]/div/div[2]/a[1]"));
	  plu1.click();
	  
	  
  }
}