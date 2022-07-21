/**
 * 
 */
package com.browserStack.flipkart.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.browserStack.flipkart.utils.FlipkartConstants;

/**
 * @author User
 *
 */
public class BasePO {

	static WebDriver driver;

	public BasePO(WebDriver driver) {
		BasePO.driver = driver;
	}

	public void launchApp() {
		driver.get(FlipkartConstants.FLIPKART_URL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Flipkart application loaded.");
	}

}
