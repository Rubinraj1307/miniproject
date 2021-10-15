package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage_2 {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Women']")
private WebElement women;
	public ShoppingPage_2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public WebElement getWomen() {
		return women;
	}

}
