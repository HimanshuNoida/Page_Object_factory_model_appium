package com.djt.testcases.testbase.Adress_set;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.djt.nativeapps.loginScreen.Setstore_address_screen;
import com.djt.nativeapps.loginScreen.setLocationScreen;
import com.djt.testcases.testbase.TestBase;

public class Adress_set  extends TestBase{
	
	
	@BeforeTest
	public void waitt() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Test
	public  void setaddress() throws InterruptedException, Exception {
		address=new setLocationScreen(driver);
		address.setLocation("Sector 51 Gurugram");
	}
	
	
	
}
