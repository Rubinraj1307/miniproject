package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page {
	public WebDriver driver;
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[4]")
private WebElement quickviewscroll;
	
	@FindBy(xpath="(//span[text()='Quick view'])[3]")
	private WebElement quickviewbtn;

	public Women_Page(WebDriver driver2) {
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
