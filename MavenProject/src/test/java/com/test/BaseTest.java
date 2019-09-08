package com.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.Utility.ReadPropfile;

public class BaseTest {
	
	WebDriver driver;
	Properties prop;
	
	@Before
	public void open() throws IOException {
		prop=ReadPropfile.readFile("C:\\Users\\muhon\\eclipse-workspace\\MavenProject\\src\\test\\java");
		String browser = prop.getProperty("browser");//getProperties("browser");
		if (browser.equals("chrome"))
		{
			driver  = new ChromeDriver();
			
		}else if(browser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		}else if (browser.equals("firefox"));
		 
		driver = new FirefoxDriver();
		
		//driver.get(prop.getProperty("key"));//getproperty("url"));
		}
	
	
	
	
	}
	
	
	
	


