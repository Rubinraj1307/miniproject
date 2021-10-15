package com.Adactin_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Base {
	
	public static WebDriver driver;

	public static WebDriver get_driver(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//browser//chromedriver.exe");

			driver = new ChromeDriver();
		
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") +
					"//drivers//geckodriver.exe");

			driver = new FirefoxDriver();

		}
     driver.manage().window().maximize();
		return driver;

	}
	public static void waiting_time(int implicit) {
		driver.manage().timeouts().implicitlyWait(implicit, TimeUnit.SECONDS);
	}
	public static void get_url(String url) {
		driver.get(url);

	}
	
	public static void clickbutton( WebElement element) {
		element.click();
	}
	
	public static void inputboxvalue(WebElement element, String value) {
		element.sendKeys(value);

	}public static void actionmethods(WebElement element,String options ) {
		Actions act = new Actions(driver);
		if (options.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
			
		}else if (options.equalsIgnoreCase("right click")) {
			act.contextClick(element).build().perform();
			
		}else if (options.equalsIgnoreCase("double click")) {
			act.doubleClick(element).build().perform();
			
		}

		

	}public static  void switchto(WebElement element) {
		driver.switchTo().frame(element);

	}
	public static void select(WebElement element,String options, String value) {
		Select s = new Select(element);

		if (options.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
			
		}
	}
	
	public static void takescreenshot( String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File  ("C:\\Users\\Admin\\eclipse-workspace\\MavenMiniProject\\screenshot\\"+name+".png");
		FileUtils.copyFile(src, dest);

	}
	
	public static void parent_switchto() {
		driver.switchTo().parentFrame();
		

	}
	public static void scrollview(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}
	public static void quantitys(WebElement element, String value, int number) {
		if (value.equalsIgnoreCase("increase")) {
			for (int i = 0; i < number; i++) {
				element.click();
				
			}
			
		}
	}
	
	public static void thread(int sec) throws InterruptedException {
		Thread.sleep(sec);

	}
	
	



}
