package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart_page3 {
	
	public WebDriver driver;
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement switchto;
	
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement size;
	
	@FindBy(xpath="//a[@name='Orange']")
	private WebElement color;

	@FindBy(xpath="//button[@name='Submit']")
	private WebElement addtocartbtn;

	public Addtocart_page3(WebDriver driver2) {
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

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}
	
}
