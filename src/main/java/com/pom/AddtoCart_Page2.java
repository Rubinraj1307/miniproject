package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart_Page2 {
	public WebDriver driver;
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
private WebElement switchto;
	
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement size;
	
	@FindBy(xpath="//a[@name='Blue']")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocartbt;

	public AddtoCart_Page2(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getSwitchto() {
		return switchto;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtocartbt() {
		return addtocartbt;
	}
	

}
