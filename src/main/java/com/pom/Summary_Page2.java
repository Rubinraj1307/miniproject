package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page2 {
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
private WebElement summary;
	public Summary_Page2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSummary() {
		return summary;
	}

}
