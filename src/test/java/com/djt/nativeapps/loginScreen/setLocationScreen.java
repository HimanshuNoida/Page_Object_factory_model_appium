package com.djt.nativeapps.loginScreen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.djt.nativeapps.screenbase.ScreenBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class setLocationScreen extends ScreenBase {

	public setLocationScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@text='Set location manually']")
	public static WebElement locationManually;

	@FindBy(xpath = "//*[@text='Search for delivery location']")
	public static WebElement EnterdLocation;

	@FindBy(xpath = "//*[@text='Confirm location and proceed']")
	public static WebElement confirmLocationProceed;

	public static void setLocation(String setLocation) throws InterruptedException, Exception {
		WebElement textbox;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Set location manually']")).click();
		Reporter.log("User clicked  Set location to set location manually ");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			driver.findElement(By.xpath("//*[@text='WHILE USING THE APP']")).click();
		} catch (Exception e) {
			System.out.println("you are again setting the location so its not required");
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		try {
			textbox = driver.findElement(By.className("android.widget.ScrollView"));
			textbox.findElement(By.className("android.widget.FrameLayout")).click();
		} catch (StaleElementReferenceException e) {
			textbox = driver.findElement(By.className("android.widget.ScrollView"));

		}
		textbox.findElement(By.className("android.widget.FrameLayout")).click();
		textbox.findElement(By.xpath("//*[@text='Search for delivery location']")).sendKeys(setLocation);
		Reporter.log("User enter location sector 51 Gurgaon and set location 51");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement location = driver
				.findElement(By.id("in.deerikaexpress.djtretailers:id/recycler_searchLocationView"));
		List<WebElement> Address = location.findElements(By.className("android.widget.LinearLayout"));
		int size = Address.size();
		System.out.println("size= " + size);

		for (int i = 0; i <= size - 1; i++) {
			if (i == 1) {
				WebElement add = Address.get(i);
				add.click();
			}

		}
		Thread.sleep(3000);

		confirmLocationProceed.click();

	}

}
