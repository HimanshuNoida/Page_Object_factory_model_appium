package com.djt.testcases.RightNavigation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.djt.nativeapps.loginScreen.RightnNavigationScreen;
import com.djt.nativeapps.screenbase.ScreenBase;
import com.djt.testcases.testbase.TestBase;

import io.appium.java_client.android.AndroidDriver;

public class RightNavigatio_Testcases extends TestBase {

	@BeforeTest
	public void waitt() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void rightNavigation() {
		navigation = new RightnNavigationScreen(driver);
		navigation.RightNavigation();

	}

}
