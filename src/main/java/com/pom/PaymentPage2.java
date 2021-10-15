package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage2 {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='bankwire']")
private WebElement paybybankwire;
	public PaymentPage2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getPaybybankwire() {
		return paybybankwire;
	}

}
