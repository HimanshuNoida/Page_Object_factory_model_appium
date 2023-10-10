package com.djt.testcases.testbase.login;

import org.testng.annotations.Test;

import com.djt.nativeapps.loginScreen.LoginScreen;
import com.djt.testcases.testbase.TestBase;

public class login  extends TestBase{
	
	public static LoginScreen login;
	@Test(priority = 1)
	public static void login() throws InterruptedException {
		
		Thread.sleep(3000);
		login=new LoginScreen(driver);
		login.login();
	
	}
	
	@Test(priority = 2)
	public static void loginnumber() throws InterruptedException {
		login.loginsendnumber("9999459457");
		
	}
	
}
