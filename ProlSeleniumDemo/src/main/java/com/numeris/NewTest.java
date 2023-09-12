package com.numeris;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	private WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://prolplus.qa.numeris.ca/");
	  driver.findElement(By.name("Username")).sendKeys("sprakash");
	  Thread.sleep(3000);
	  driver.findElement(By.name("Password")).sendKeys("Move@2023");
	  Thread.sleep(3000);
	  driver.findElement(By.id("login-btn")).click();
	  Thread.sleep(3000);
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
