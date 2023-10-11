package com.djt.testcases.testbase.login;

import org.testng.annotations.Test;

import com.djt.nativeapps.loginScreen.LoginScreen;
import com.djt.testcases.testbase.TestBase;

public class login  extends TestBase{
	
	

	@Test(priority = 1)
	public static void loginnumber() throws InterruptedException {
		login=new LoginScreen(driver);
		login.loginsendnumber("9999459457");
		
	}
	
}
