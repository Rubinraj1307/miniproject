package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
	public WebDriver driver;
	@FindBy(xpath="//h1[text()='Addresses']")
private WebElement addressscroll;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement addressbtn;

	public Address_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getAddressscroll() {
		return addressscroll;
	}

	public WebElement getAddressbtn() {
		return addressbtn;
	}

}
