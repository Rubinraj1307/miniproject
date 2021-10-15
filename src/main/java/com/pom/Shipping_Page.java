package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	
	public WebDriver driver;
	@FindBy(xpath="//input[@name='cgv']")
private WebElement termsofservice;

	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement shippingbtn;

	public Shipping_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTermsofservice() {
		return termsofservice;
	}

	public WebElement getShippingbtn() {
		return shippingbtn;
	}
	
	
}
