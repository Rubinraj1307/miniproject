package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Page {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!'])[1]")

	private WebElement Eveningdress;

	public Dress_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getEveningdress() {
		return Eveningdress;
	}
	
}
