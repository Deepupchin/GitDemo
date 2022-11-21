package mobileAutomation.appium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void basicConfiguration() throws IOException {

		// class to start the appium server automatically
		service= new AppiumServiceBuilder().withAppiumJS(new File
				("C://Users//DELL//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("192.168.29.204").usingPort(4723).build();
		service.start();
		/*
		 * First time it will install the app in emulator
		 * further launch the same.
		 * flow : code > appium server > mobile
		 * response will be vice versa
		 */
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("DeepEmulator");
		options.setApp
		("C://Deep//workspace1//appium//src//test//java//resources//ApiDemos-debug.apk");
		
//		("C://Deep//workspace1//appium//src//test//java//resources//TerraPayDI-appV110-1.apk");
		
		
		driver=new AndroidDriver(new URL("http://192.168.29.204:4723"), options);
//		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.204:4723"), options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

		
	}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
		service.stop();
		
	}

}
