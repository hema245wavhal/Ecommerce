package com.richa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.richa.base.Base;

public class LoginTest extends Base {
	
	@BeforeMethod
	public void setup()
	{
		initialize();
	}
	
	@Test
	public void verifyLogin()
	{
		//click on log in
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		driver.findElement(By.name("Email")).sendKeys("trisha.mittal1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password2");
	//wait.until(Excepted)
		driver.findElement(By.xpath("//button[contains(text(),'login')]")).click();
	}
}
