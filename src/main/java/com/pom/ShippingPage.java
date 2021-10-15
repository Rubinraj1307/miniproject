package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
	public WebDriver driver;
	@FindBy(xpath="//input[@type='checkbox']")
private WebElement checkbox;

	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
	private WebElement shippingbtn;

	public ShippingPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getShippingbtn() {
		return shippingbtn;
	}
	

}
