package com.AutomationTalks.demoProject1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	public static WebDriver driver;
	
	public static final String USERNAME = "frankboahene2";
	  public static final String AUTOMATE_KEY = "g1Sk3KuAZsvPA7f7EcjY";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	@BeforeMethod
	public void launchDriver() throws MalformedURLException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "Chrome");
		 caps.setCapability("browser_version", "70.0");
		 caps.setCapability("os", "Windows");
		 caps.setCapability("os_version", "7");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("project", "AutomationTalksProject");
		 caps.setCapability("build", "Build1");
		 caps.setCapability("name", "TestCaseName");
		
		 driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
		
		//driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void Test1() {
		driver.navigate().to("https://www.AutomationTalks.com");
		System.out.println("Test 1 title is "+driver.getTitle());		
	}
	@Test
	public void Test2() {
		driver.navigate().to("https://www.AutomationTalks.com");
		System.out.println("Test 2 title is "+driver.getTitle());		
	}
	@Test
	public void Test3() {
		driver.navigate().to("https://www.AutomationTalks.com");
		System.out.println("Test 3 title is "+driver.getTitle());			
	}
	@AfterMethod
	public void quit() {
		driver.quit();
		// if test case fails then log the defect in JIRA
	}
	
}
