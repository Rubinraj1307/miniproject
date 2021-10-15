package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedtocheckout_Page2 {
public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement proceedtocheckoutbtn;

	public Proceedtocheckout_Page2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedtocheckoutbtn() {
		return proceedtocheckoutbtn;
	}

}
