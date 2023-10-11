package com.djt.nativeapps.loginScreen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.djt.nativeapps.screenbase.ScreenBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class RightnNavigationScreen extends ScreenBase {

	
	@FindBy(xpath="//*[@content-desc='Open navigation drawer']")
	public WebElement openDrawer;
	
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/sideWishList_relative")
	public WebElement Wishlist;
	
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/backImg_wishlist")
	public WebElement Wishlist_Backbutton;
	//
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/sideYourAccount_relative")
	public WebElement myAccount;
	
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/backImg_youraccount")
	public WebElement MyAcccount_BackButton;
	//
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/sideMembership_relative")
	public WebElement Deerika_membership_dashboard;
	
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/backImg_youraccount")
	public WebElement Deerika_membership_dashboard_backbutton;
//

	
	@FindBy(id="in.deerikaexpress.djtretailers:id/sideCustomerService_relative")
	public WebElement customerservice_realtive;
	

	
	@FindBy(id="in.deerikaexpress.djtretailers:id/backImg_ssupport")
	public WebElement customerservice_realtive_backbutton;
	
	
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/sidelegals_relative")
	public WebElement side_legal;
	
	
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/sideNotification_relative")
	public WebElement sideNotification;
	

	@FindBy(id="in.deerikaexpress.djtretailers:id/backImg")
	public WebElement sideNotification_backbutton;
	
	
	
	
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/sideYourAddress_relative")
	public WebElement side_youraddress;
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/backImg_youraccount")
	public WebElement side_youraddress_backbutton;
	
	
	
	
//	@FindBy(id="//*[@text='+Add New Address']")
//	public WebElement AddAddress;
	
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/sidelegals_relative")
	public WebElement sideligal_relative;
	
	

	@FindBy(id="in.deerikaexpress.djtretailers:id/backImg_addressbook")
	public WebElement sideligal_relative_backbutton;
	
	
	
	@FindBy(id="in.deerikaexpress.djtretailers:id/sideRateUs_relative")
	public WebElement rateus;
	
	
	
	public RightnNavigationScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public  void RightNavigation() {
		openDrawer.click();
		Wishlist.click();
		Wishlist_Backbutton.click();
		openDrawer.click();
		myAccount.click();
		MyAcccount_BackButton.click();
		openDrawer.click();
		customerservice_realtive.click();
		customerservice_realtive_backbutton.click();
		openDrawer.click();
		Deerika_membership_dashboard.click();
		Deerika_membership_dashboard_backbutton.click();
		openDrawer.click();
		sideNotification.click();
		sideNotification_backbutton.click();
	
	}
	
	
/*	
	WebElement wishElement = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/sideWishList_relative")));
	wishElement.click();
	Reporter.log("User clicked the Wishlist");
	try {
		wishlist.wishList();
	} catch (Exception e) {
		System.out.println("There are not item present in the wishlist");
	}

	WebElement wishElement_Back = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/backImg_wishlist")));
	wishElement_Back.click();

	staticIcon = (new WebDriverWait(driver, 50)).until(
			ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@content-desc='Open navigation drawer']")));
	staticIcon.click();

	WebElement MyAccount = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/sideYourAccount_relative")));
	MyAccount.click();

	Reporter.log("User clicked  My Account ");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	profileChange.profileChange();

	
	  WebElement MyAccount_back = (new WebDriverWait(driver, 50))
	  .until(ExpectedConditions.presenceOfElementLocated(By.id(
	  "in.deerikaexpress.djtretailers:id/backImg_youraccount")));
	  MyAccount_back.click();
	 
	staticIcon = (new WebDriverWait(driver, 50)).until(
			ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@content-desc='Open navigation drawer']")));
	staticIcon.click();

	WebElement DeerikaPlusMember = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/sideMembership_relative")));
	DeerikaPlusMember.click();
	Reporter.log("User clicked  Deerika plus memeber");

	WebElement DeerikaPlusMember_Back = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/backImg_youraccount")));
	DeerikaPlusMember_Back.click();

	staticIcon = (new WebDriverWait(driver, 50)).until(
			ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@content-desc='Open navigation drawer']")));
	staticIcon.click();

	WebElement Addrees_Book = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/sideYourAddress_relative")));
	Addrees_Book.click();
	Reporter.log("User clicked  Address Book");
	WebElement location = (new WebDriverWait(driver, 50))
			.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='+Add New Address']")));
	location.click();
	Thread.sleep(20000);
	addressChange.addressChange();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement Addrees_Book_Back = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/backImg_shipping")));

	Addrees_Book_Back.click();
	staticIcon = (new WebDriverWait(driver, 50)).until(
			ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@content-desc='Open navigation drawer']")));
	staticIcon.click();

	WebElement Notification = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/sideNotification_relative")));
	Notification.click();
	Reporter.log("User clicked  Notifications");

	WebElement Notification_back = (new WebDriverWait(driver, 50))
			.until(ExpectedConditions.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/backImg")));
	Notification_back.click();

	
	 staticIcon = (new WebDriverWait(driver, 50))
	  .until(ExpectedConditions.presenceOfElementLocated(By.
	  xpath("//*[@content-desc='Open navigation drawer']"))); staticIcon.click();
	  
	  
	  
	 WebElement customersupport = (new WebDriverWait(driver, 50))
	 .until(ExpectedConditions.presenceOfElementLocated(By.id(
	  "in.deerikaexpress.djtretailers:id/sideCustomerService_relative")));
	  customersupport.click();
	  
	 Thread.sleep(3000);
	  
	  driver.findElement(By.id("in.deerikaexpress.djtretailers:id/backImg_ssupport"
	  )).click();
	 
	staticIcon = (new WebDriverWait(driver, 50)).until(
			ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@content-desc='Open navigation drawer']")));
	staticIcon.click();

	WebElement terms_of_use = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/sidelegals_relative")));
	terms_of_use.click();
	Reporter.log("User clicked  terms of use ");

	WebElement terms_of_use_back = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/backImg_addressbook")));
	terms_of_use_back.click();

	staticIcon = (new WebDriverWait(driver, 50)).until(
			ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@content-desc='Open navigation drawer']")));
	staticIcon.click();

	WebElement rateus = (new WebDriverWait(driver, 50)).until(ExpectedConditions
			.presenceOfElementLocated(By.id("in.deerikaexpress.djtretailers:id/sideRateUs_relative")));
	rateus.click();
	Reporter.log("User clicked  Rate Us");
	Thread.sleep(3000);
	((AndroidDriver<WebElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
*/
}