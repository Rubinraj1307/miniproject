package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page2 {

	public WebDriver driver;
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	private WebElement addressbtn;
	public Address_Page2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddressbtn() {
		return addressbtn;
	}
}
