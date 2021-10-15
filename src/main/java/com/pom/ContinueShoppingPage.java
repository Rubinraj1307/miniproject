package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueShoppingPage {
	public WebDriver driver;
	@FindBy(xpath="//i[@class='icon-chevron-left left']")
private WebElement continueshoppingbt;
	public ContinueShoppingPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getContinueshoppingbt() {
		return continueshoppingbt;
	}

}
