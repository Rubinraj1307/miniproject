package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation_page {
	public WebDriver driver;
	@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement confirmorderbtn;
	public OrderConfirmation_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getConfirmorderbtn() {
		return confirmorderbtn;
	}
	
	

}
