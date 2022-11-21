package mobileAutomation.appium;


import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends Base {
	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException {
		
		
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Preference']")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("Kush Wifi");
		driver.findElement(By.id("android:id/button1")).click();
		
		Thread.sleep(3000);

	
	}

}
