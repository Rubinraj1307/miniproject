package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackToOrder_Page {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='button-exclusive btn btn-default']")
private WebElement backtoorderbtn;
	public BackToOrder_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);		
		
	}
	public WebElement getBacktoorderbtn() {
		return backtoorderbtn;
	}
	

}
