package org.onlinestore.Utility;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver = null;

	public static WebDriver launchBrowser() {
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", driverPath + "\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver.exe");
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		maximizeWindow(driver);
		impliciWait(driver, 10);
		driver.get("https://www.amazon.in/");
		
		return driver;
	}

	public static void impliciWait(WebDriver driver, int titmeUnitSeconds) {
		driver.manage().timeouts().implicitlyWait(titmeUnitSeconds, TimeUnit.SECONDS);
	}

	public static void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public static void mouseHoverAction(WebElement account_And_List,String subElement) {

		Actions action = new Actions(driver);
		action.moveToElement((WebElement) account_And_List).build().perform();
		if(subElement.equals("Sign In")) {
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")));
		}
		action.click();
		action.perform();
	 
	}

}
