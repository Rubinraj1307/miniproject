package com.MavenMiniProject;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dress_Automation extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		driver = get_driver("Chrome");

		waiting_time(20);

		get_url("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickbutton(signin);

		WebElement email = driver.findElement(By.id("email"));
		inputboxvalue(email, "rubinraj7@gmail.com");

		WebElement pass = driver.findElement(By.id("passwd"));
		inputboxvalue(pass, "rubin1307");

		WebElement clickbtn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		clickbutton(clickbtn);

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		clickbutton(dresses);

		WebElement eveningdresses = driver.findElement(By.xpath("(//a[contains(@title,'Browse our "
				+ "different dresses to choose the perfect dress for an unforgettable evening!')])[1]"));
		clickbutton(eveningdresses);

		WebElement quickview = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		actionmethods(quickview, "move");

		WebElement quickview1 = driver.findElement(By.xpath("//span[text()='Quick view']"));
		clickbutton(quickview1);

		WebElement quantity = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		switchto(quantity);

		WebElement quantity1 = driver.findElement(By.xpath("//i[@class='icon-plus']"));		
		quantitys(quantity1, "increase", 9);
		
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		select(size, "byvalue", "2");

		WebElement colour = driver.findElement(By.xpath("//a[@name='Pink']"));
		clickbutton(colour);

	

		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		clickbutton(addtocart);
		
		
		thread(2000);

		takescreenshot("add to cart");

		parent_switchto();
		
		thread(2000);
		takescreenshot("proceed to checkout");
		
		WebElement checkout = driver.findElement(
				By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		clickbutton(checkout);

//		WebElement summary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//		clickbutton(summary);
//
//		WebElement Address = driver.findElement(By.xpath("//h1[text()='Addresses']"));
//		scrollview(Address);
//		takescreenshot("address");
//		
//		WebElement address = driver.findElement(By.xpath("//button[@name='processAddress']"));
//		clickbutton(address);
//
//		
//
//		WebElement termsofservice = driver.findElement(By.xpath("//input[@name='cgv']"));
//		clickbutton(termsofservice);
//
//
//		WebElement shipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
//		clickbutton(shipping);
//
//		WebElement paybybankwire = driver.findElement(By.xpath("//a[@class='bankwire']"));
//		clickbutton(paybybankwire);
//
//		WebElement buy = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//
//		scrollview(buy);
//		takescreenshot("confirm my order");
//
//		clickbutton(buy);
//
//		WebElement back_to_order = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
//		clickbutton(back_to_order);
//
//		WebElement tshirt = driver
//				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));
//		clickbutton(tshirt);
//
//		waiting_time(20);
//
//		WebElement quick3 = driver.findElement(By.xpath("//img[@itemprop='image']"));
//		actionmethods(quick3, "move");
//
//		WebElement quickview2 = driver.findElement(By.xpath("//span[text()='Quick view']"));
//		clickbutton(quickview2);
//
//		WebElement quantity2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//		switchto(quantity2);
//
//		WebElement size1 = driver.findElement(By.xpath("//select[@name='group_1']"));
//		select(size1, "byvalue", "2");
//
//		WebElement colour2 = driver.findElement(By.xpath("//a[@name='Blue']"));
//		clickbutton(colour2);
//
//		WebElement addtocart1 = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
//		clickbutton(addtocart1);
//
//		parent_switchto();
//
//		WebElement continueshopping = driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"));
//		clickbutton(continueshopping);
//
//		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
//		clickbutton(women);
//
//		WebElement quick4 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[4]"));
//
//		actionmethods(quick4, "move");
//
//		WebElement quickview3 = driver.findElement(By.xpath("(//span[text()='Quick view'])[3]"));
//		clickbutton(quickview3);
//
//		WebElement quantity6 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//		switchto(quantity6);
//
//		WebElement size5 = driver.findElement(By.xpath("//select[@name='group_1']"));
//		select(size5, "byvalue", "2");
//
//		WebElement colour5 = driver.findElement(By.xpath("//a[@name='Orange']"));
//		clickbutton(colour5);
//
//		WebElement addtocart3 = driver.findElement(By.xpath("//button[@name='Submit']"));
//		clickbutton(addtocart3);
//
//		parent_switchto();
//
//		WebElement proceed1 = driver.findElement(
//				By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
//		clickbutton(proceed1);
//
//		WebElement summary1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
//		clickbutton(summary1);
//
//		WebElement address1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
//		clickbutton(address1);
//
//		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		clickbutton(checkbox);
//
//		WebElement proceedcheck = driver
//				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
//		clickbutton(proceedcheck);
//
//		WebElement bankwire = driver.findElement(By.xpath("//a[@class='bankwire']"));
//		clickbutton(bankwire);
//
//		WebElement cnfrmorder = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
//		clickbutton(cnfrmorder);
	}

}
