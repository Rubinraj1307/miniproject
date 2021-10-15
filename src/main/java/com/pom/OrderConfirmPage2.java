package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmPage2 {
	public WebDriver driver;
	@FindBy(xpath="//span[text()='I confirm my order']")
private WebElement confirmorderbtn;
	public OrderConfirmPage2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getConfirmorderbtn() {
		return confirmorderbtn;
	}

}
