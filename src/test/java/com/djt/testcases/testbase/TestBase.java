package com.djt.testcases.testbase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.djt.nativeapps.loginScreen.LoginScreen;
import com.djt.testcases.utils.AppiumServer;
import com.djt.testcases.utils.commounUtils;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class TestBase {
	
	public static AndroidDriver driver;
	


	@BeforeTest
	public static void init() throws IOException {
		if(driver==null) {
		//	AppiumServer.stop();
			AppiumServer.start();
			commounUtils.Loadconfiguration("DjtDeerika.properties");
			commounUtils.setCapabalities();
			driver=commounUtils.getDriver();
			
			
		}
		
	}
	
	

/*	@AfterSuite
	public void TearDown() {
		driver.quit();
		AppiumServer.stop();
	}
*/
	
	
}
