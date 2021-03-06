package com.lemon.auto.ios.gestures;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.internal.Yaml;

import io.appium.java_client.appmanagement.ApplicationState;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Gestures_01_Swipe_Tester {
	public static void main(String[] args) throws Exception {
		// 期望的能力对象
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		// 平台名
		desiredCapabilities.setCapability("platformName", "iOS");
		// 平台版本
		desiredCapabilities.setCapability("platformVersion", "12.1");
		// app文件的路径
		desiredCapabilities.setCapability("app", "/Users/happy/Desktop/tools/app/UICatalog.app");
		// 设备名
		desiredCapabilities.setCapability("deviceName", "iPhone 8");
		// 是否重置app设置
		desiredCapabilities.setCapability("noReset", true);
		// 创建一个会话
		URL remoteAddress = new URL("http://localhost:4723/wd/hub");
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(remoteAddress, desiredCapabilities);

		/**
		 命令
		mobile: swipe
		备注
		执行简单的滑动手势，在相册分页、切换视图等场景使用，不接受坐标，复杂的滑动手势使用mobile: dragfromtoduration 
		参数
		direction 
		up，down，left，right，必需参数
		element 
		要滑动的元素，非必需参数
		示例
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Map<String, Object> params = new HashMap<>();
		params.put("direction", "down");
		params.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile: swipe", params);

		 */
		Thread.sleep(2000);
		Map<String, Object> params= new HashMap<String, Object>();
		params.put("direction", "up");
//		params.put("direction", "down");
		driver.executeScript("mobile: swipe", params);

//		Thread.sleep(3000);
//		driver.quit();

	}

}
