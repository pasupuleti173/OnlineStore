package org.onlinestore.TestScripts;

import org.onlinestore.PageObjects.HomePage;
import org.onlinestore.PageObjects.LoginPage;
import org.onlinestore.Utility.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScript_01 {
	private   WebDriver driver=null;
	
	@BeforeMethod
	public void beforeMethod() {
		BaseClass.launchBrowser();
		System.out.println("open url ");
	}
	
	@Test
	public void testCase_01() {
		HomePage.click_Account_Sign_In();
		LoginPage.Login("9176854486", "suresh123zon");
		HomePage.click_Mobile_Link();
		HomePage.select_Product();
		HomePage.click_Account_Sign_Out();
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
