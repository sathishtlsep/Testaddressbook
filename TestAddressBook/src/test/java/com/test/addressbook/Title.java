package com.test.addressbook;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Sathish
 *
 */
public class Title {
	public String validateTitle(WebDriver driver) {
            driver.get("http:\\a.testaddressbook.com");

		return driver.getTitle();

	}
}
