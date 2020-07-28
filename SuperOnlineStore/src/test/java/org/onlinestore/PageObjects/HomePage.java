package org.onlinestore.PageObjects;
 
import org.onlinestore.Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {
	private static WebElement element = null;
	private static WebDriver driver=null;
	
	public static By account_And_List=By.xpath("//a[@id=\"nav-link-accountList\"]/span");
	public static By signOut_Btn=By.id("nav-item-signout");
	public static By mobile_Link=By.linkText("Mobiles");
	public static By select_Product=By.id("gwd-browseMultiCategoryCard-merchandised-search-6");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public static void click_Account_Sign_In() {
		
		try {
			BaseClass.impliciWait(driver, 10);
			element=driver.findElement(account_And_List);
			BaseClass.mouseHoverAction(element, "Sign In");
		} catch (WebDriverException we) {
			we.printStackTrace();
		}
	}
	
	public static void click_Account_Sign_Out() {
		try {
			element=driver.findElement(signOut_Btn);
		} catch (WebDriverException we) {
			we.printStackTrace();
		}
		element.click();
	}
	public static void click_Mobile_Link() {
		try {
			element=driver.findElement(mobile_Link);
		} catch (WebDriverException we) {
			we.printStackTrace();
		}
		element.click();
	}
	public static void select_Product() {
		try {
			element=driver.findElement(select_Product);
		} catch (WebDriverException we) {
			we.printStackTrace();
		}
		element.click();
	}
}
