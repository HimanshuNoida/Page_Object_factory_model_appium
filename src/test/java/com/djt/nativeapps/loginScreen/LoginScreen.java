package com.djt.nativeapps.loginScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.djt.nativeapps.screenbase.ScreenBase;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends ScreenBase {
	
	
	@FindBy(id = "in.deerikaexpress.djtretailers:id/loginNumber_et")
	public  WebElement loginnumber;

	@FindBy(xpath="//*[@text='CONTINUE']")
	public  WebElement continuee;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public   WebElement Submit;
	
	public LoginScreen(AndroidDriver driver) {
		super(driver);
		
	}

	public  setLocationScreen loginsendnumber(String number) throws InterruptedException {
		loginnumber.click();
		Thread.sleep(3000);
		loginnumber.sendKeys(number);
		Thread.sleep(3000);
		((AndroidDriver<WebElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		continuee.click();
		Thread.sleep(10000);
		Submit.click();
		return new setLocationScreen(driver);
	}

}
