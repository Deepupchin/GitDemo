package mobileAutomation.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.remote.http.HttpMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPress extends Base {
	
	@Test
	public void long_press_gesture() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();	
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();	
		
		//long press gesture
		WebElement ele =driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		((JavascriptExecutor) driver).executeScript("mobile: longClickGestures",
				ImmutableMap.of("elementId",((RemoteWebElement) ele).getId(),"duration",2000));
		Thread.sleep(3000);
		


	}

}
