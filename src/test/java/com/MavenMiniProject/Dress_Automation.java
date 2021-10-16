package com.MavenMiniProject;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Dress_Automation extends Base_Class {

	public static WebDriver driver = Base_Class.get_driver("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		waiting_time(20);
		
		String url = File_Reader_Manager.getinstanceFRM().getinstanceCR().geturl();

		get_url(url);

		clickbutton(pom.getinstanceHP().getSigninbt());

		String email_address = File_Reader_Manager.getinstanceFRM().getinstanceCR().getemail_address();
		inputboxvalue(pom.getinstancesiginin().getUsername(),email_address);

		String password = File_Reader_Manager.getinstanceFRM().getinstanceCR().getpassword();
		inputboxvalue(pom.getinstancesiginin().getPassword(),password);

		clickbutton(pom.getinstancesiginin().getSignin_btn());

		clickbutton(pom.getinstanceshopping().getDresses());

		clickbutton(pom.getinstanceDresspage().getEveningdress());

		actionmethods(pom.getinstanceEveningdresss().getQuickview(), "move");

		clickbutton(pom.getinstanceEveningdresss().getQuickviewbt());

		switchto(pom.getinstanceAddtocart().getSwitchto());

		quantitys(pom.getinstanceAddtocart().getQuantity(), "increase", 9);

		select(pom.getinstanceAddtocart().getSize(), "byvalue", "2");

		clickbutton(pom.getinstanceAddtocart().getColor());

		clickbutton(pom.getinstanceAddtocart().getAddtocartbt());

		thread(2000);

		takescreenshot("add to cart");

		parent_switchto();

		thread(2000);
		takescreenshot("proceed to checkout");

		clickbutton(pom.getinstanceprcdtocheckout().getProceedtocheckoutbtn());

		clickbutton(pom.getinstancesummary().getSummary());

		scrollview(pom.getinstanceaddress().getAddressscroll());
		takescreenshot("address");

		clickbutton(pom.getinstanceaddress().getAddressbtn());

		clickbutton(pom.getinstanceshippingpage().getTermsofservice());

		clickbutton(pom.getinstanceshippingpage().getShippingbtn());

		clickbutton(pom.getinstancepaymentpage().getPaybybankwire());

		scrollview(pom.getinstanceorderconfrimation().getConfirmorderbtn());
		takescreenshot("confirm my order");

		clickbutton(pom.getinstanceorderconfrimation().getConfirmorderbtn());

		clickbutton(pom.getinstancebackorder().getBacktoorderbtn());

		clickbutton(pom.getinstance_newshopping().getTshirtbtn());

		waiting_time(20);

		actionmethods(pom.getinstancetshirt().getQuickviewscroll(), "move");

		clickbutton(pom.getinstancetshirt().getQuickviewbtn());

		switchto(pom.getinstanceaddtocart().getSwitchto());

		select(pom.getinstanceaddtocart().getSize(), "byvalue", "2");

		clickbutton(pom.getinstanceaddtocart().getColor());

		clickbutton(pom.getinstanceaddtocart().getAddtocartbt());

		parent_switchto();

		clickbutton(pom.getinstancecontinueshopping().getContinueshoppingbt());

		clickbutton(pom.getinstanceshppingpage().getWomen());

		actionmethods(pom.getinstance_womenpage().getQuickviewscroll(), "move");

		clickbutton(pom.getinstance_womenpage().getQuickviewbtn());

		switchto(pom.getinstance_addtocartpage().getSwitchto());

		select(pom.getinstance_addtocartpage().getSize(), "byvalue", "2");

		clickbutton(pom.getinstance_addtocartpage().getColor());

		clickbutton(pom.getinstance_addtocartpage().getAddtocartbtn());

		parent_switchto();

		clickbutton(pom.getinstance_proceedtocheckout().getProceedtocheckoutbtn());

		clickbutton(pom.getinstancesummarys().getSummary());

		clickbutton(pom.getinstanceaddres().getAddressbtn());

		clickbutton(pom.getinstanceshipping().getCheckbox());

		clickbutton(pom.getinstanceshipping().getShippingbtn());

		clickbutton(pom.getinstancepayment().getPaybybankwire());

		clickbutton(pom.getinstanceorder().getConfirmorderbtn());
	}

}
