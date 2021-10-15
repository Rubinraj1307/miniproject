package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Page {
	public WebDriver driver;
	@FindBy(xpath="//img[@itemprop='image']")
private WebElement quickviewscroll;
	
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quickviewbtn;

	public Tshirt_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getQuickviewscroll() {
		return quickviewscroll;
	}

	public WebElement getQuickviewbtn() {
		return quickviewbtn;
	}

}
