package com.test_address;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.addressbook.Title;;

public class TestAddressBook {

	WebDriver driver;

	@BeforeClass
	public void doBefore() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {

		Assert.assertEquals("Address Book", new Title().validateTitle(driver));
	}

	@AfterClass

	public void doAfter() {
		driver.quit();
	}
}
