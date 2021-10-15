package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement switchto;
	
	@FindBy(xpath="//i[@class='icon-plus']")
private WebElement quantity;
	
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement size;
	
	@FindBy(xpath="//a[@name='Pink']")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocartbt;

	public Addtocart_Page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getColor() {
		return color;
	}


	public WebElement getAddtocartbt() {
		return addtocartbt;
	}


	public WebElement getSwitchto() {
		return switchto;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}
	
	
}
