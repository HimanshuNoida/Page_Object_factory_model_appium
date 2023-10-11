package com.djt.nativeapps.screenbase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.djt.nativeapps.loginScreen.LoginScreen;
import com.djt.nativeapps.loginScreen.RightnNavigationScreen;
import com.djt.nativeapps.loginScreen.setLocationScreen;
import com.djt.testcases.RightNavigation.RightNavigatio_Testcases;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScreenBase {

	
	public  LoginScreen login;
	public RightnNavigationScreen nav;
	public setLocationScreen address;
	
	public static AndroidDriver driver;
	
	public static WebDriverWait wait;
	public ScreenBase(AndroidDriver driver) {
		this.driver=driver;
		loadElements();
		
	}


	public void loadElements() {	
		PageFactory.initElements(driver,this);
	}
	
	
	public void waitforElements(long duration,String locator) {
		 wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator))).click();

	}
	
	public void hideKeybord() {
		driver.hideKeyboard();

	}
	
	
}
