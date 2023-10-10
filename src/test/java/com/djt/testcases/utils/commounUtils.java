package com.djt.testcases.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class commounUtils {

	private static Properties prop = new Properties();
	public static int EXPLICIT_WAIT_TIME;
	public static int IMPLICIT_WAIT_TIME;
	public static String APLLICATION_NAME;
	public static String BASE_PKG;
	public static String APP_ACTIVTY;
	public static String APP_PASSWORD;
	public static String APPIUM_PORT;
	public static String BROWSER_NAME;
	public static String PLATFORM_NAME;
	public static String NEW_COMMAND_TIMEOUT;
	public static String AUTOMATION_INSTRUMENT;
	public static String PLATFORM_VERSION;
	public static String DEVICE_NAME;
	private static DesiredCapabilities capablities = new DesiredCapabilities();
	private static URL serverURL;
	private static AndroidDriver driver;
	public static String DEVICE_READY_TIMEOUT;

	public static void Loadconfiguration(String propertyFileName) throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\" + propertyFileName);
		prop.load(fis);
		EXPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("explicit.wait"));
		IMPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("implicit.wait"));
		BASE_PKG = prop.getProperty("base.pkg");
		APP_ACTIVTY = prop.getProperty("application.activity");
		APPIUM_PORT = prop.getProperty("appium.server.port");
		DEVICE_NAME=prop.getProperty("device.name");
		PLATFORM_NAME = prop.getProperty("platform.name");
		PLATFORM_VERSION = prop.getProperty("platform.version");
		
	}

	public static void setCapabalities() {
		capablities.setCapability(MobileCapabilityType.PLATFORM_NAME, commounUtils.PLATFORM_NAME);
		capablities.setCapability(MobileCapabilityType.PLATFORM_VERSION, commounUtils.PLATFORM_VERSION);
		capablities.setCapability(MobileCapabilityType.DEVICE_NAME, commounUtils.DEVICE_NAME);
		capablities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, commounUtils.APP_ACTIVTY);
		capablities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, commounUtils.BASE_PKG);
		
		
		

	}

	public static AndroidDriver getDriver() throws MalformedURLException {
		serverURL = new URL("http://localhost:"+APPIUM_PORT +"/wd/hub");
		driver = new AndroidDriver(serverURL, capablities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

}
