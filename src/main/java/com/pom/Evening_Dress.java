package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dress {
	public WebDriver driver;
	
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement quickview;
	
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quickviewbt;

	public Evening_Dress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getQuickview() {
		return quickview;
	}

	public WebElement getQuickviewbt() {
		return quickviewbt;
	}

	
}
