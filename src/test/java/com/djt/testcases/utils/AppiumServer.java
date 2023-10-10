package com.djt.testcases.utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServer {
	public static AppiumDriverLocalService server;

	public static void start() {

		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder().usingPort(4723);
		server = AppiumDriverLocalService.buildService(serviceBuilder);
		server.start();

	}

	public static void stop() {
		server.stop();
	}
}
