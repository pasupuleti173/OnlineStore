package org.onlinestore.PageObjects;

import org.onlinestore.Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
	private static WebDriver driver = null;
	private static WebElement element = null;

	public static By txt_Email = By.id("ap_email");
	public static By txt_Password = By.id("ap_password");
	public static By continue_Btn = By.id("continue");
	public static By submit_Btn = By.id("signInSubmit");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement txt_EMail_OR_PhoneNumber(String emailId) {
		try {
			element = driver.findElement(txt_Email);
		} catch (WebDriverException we) {
			we.printStackTrace();
		}
		element.sendKeys(emailId);
		return element;
	}

	public static WebElement txt_Password(String password) {
		try {
			element = driver.findElement(txt_Password);
		} catch (WebDriverException we) {
			we.printStackTrace();
		}
		element.sendKeys(password);
		return element;
	}

	public static void click_Continue_Btn() {
		try {
			element = driver.findElement(continue_Btn);
		} catch (WebDriverException we) {
			we.printStackTrace();
		}
		if (element.isDisplayed()) {
			element.click();
		}
	}

	public static void submit_Button() {
		try {
			element = driver.findElement(submit_Btn);
		} catch (WebDriverException we) {
			we.printStackTrace();
		}
		if (element.isDisplayed()) {
			element.click();
		}
	}

	public static void Login(String email, String password) {
		try {
			txt_EMail_OR_PhoneNumber(email);
			click_Continue_Btn();
			txt_Password(password);
			submit_Button();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}

	}
}
