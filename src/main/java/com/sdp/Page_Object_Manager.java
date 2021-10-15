package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Address_Page;
import com.pom.Address_Page2;
import com.pom.AddtoCart_Page2;
import com.pom.Addtocart_Page;
import com.pom.Addtocart_page3;
import com.pom.BackToOrder_Page;
import com.pom.ContinueShoppingPage;
import com.pom.Dress_Page;
import com.pom.Evening_Dress;
import com.pom.Home_Page;
import com.pom.NewShopping_Page;
import com.pom.OrderConfirmPage2;
import com.pom.OrderConfirmation_page;
import com.pom.PaymentPage2;
import com.pom.Payment_Page;
import com.pom.Proceedtocheckout_Page;
import com.pom.Proceedtocheckout_Page2;
import com.pom.ShippingPage;
import com.pom.Shipping_Page;
import com.pom.ShoppingPage_2;
import com.pom.Shopping_Page;
import com.pom.Signin_Page;
import com.pom.Summary_Page;
import com.pom.Summary_Page2;
import com.pom.Tshirt_Page;
import com.pom.Women_Page;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Home_Page  hp;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
	}


	public Home_Page getinstanceHP() {
		hp = new Home_Page(driver);
		return hp;

	}
	
	private Signin_Page signin;
	
	public Signin_Page getinstancesiginin() {
		 signin = new Signin_Page(driver);
return signin;
	}
	
	private Shopping_Page sp;
	public Shopping_Page getinstanceshopping() {
		 sp = new Shopping_Page(driver);
return sp;
	}
	
	private Dress_Page Dp;
	public Dress_Page getinstanceDresspage() {
 Dp = new Dress_Page(driver);
		return Dp;
	}
	
	private Evening_Dress Ed;
	 public Evening_Dress getinstanceEveningdresss() {
 Ed = new Evening_Dress(driver);		 
		 return Ed;

	}
	 
	 
	 private Addtocart_Page ap;
	 public Addtocart_Page getinstanceAddtocart() {
 ap = new Addtocart_Page(driver);
return ap;
	 
	}
	 
	 private Proceedtocheckout_Page pg;
	 public Proceedtocheckout_Page getinstanceprcdtocheckout() {
 pg = new Proceedtocheckout_Page(driver);
return pg;
 
	}
	 
	 private Summary_Page Sp;
	 public Summary_Page getinstancesummary() {
 Sp = new Summary_Page(driver);
return Sp;
		 
	}
	 
	 private Address_Page Ap;
	 public Address_Page getinstanceaddress() {
 Ap = new Address_Page(driver);
return Ap;
	 }
	 
	 private Shipping_Page spg;
	 public Shipping_Page getinstanceshippingpage() {
Shipping_Page spg = new Shipping_Page(driver);
		 return spg;
	}
	 
	 private Payment_Page pp;
	 public Payment_Page getinstancepaymentpage() {
 pp = new Payment_Page(driver);
return pp;
		 
	}
	 
	 private OrderConfirmation_page op;
	 public OrderConfirmation_page getinstanceorderconfrimation() {
 op = new OrderConfirmation_page(driver);
return op;
		 
	}
	 
	 private BackToOrder_Page bp;
	 public BackToOrder_Page getinstancebackorder() {
 bp = new BackToOrder_Page(driver);
return bp;
	}
	 
	 private NewShopping_Page ng;
	 public NewShopping_Page getinstance_newshopping() {
		 ng = new NewShopping_Page(driver);
		return ng;
		 

	}
	 
	private Tshirt_Page tp;
	public Tshirt_Page getinstancetshirt() {
 tp = new Tshirt_Page(driver);
return tp;
		

	}
	
	private AddtoCart_Page2 ap2;
	
	public AddtoCart_Page2 getinstanceaddtocart() {
 ap2 = new AddtoCart_Page2(driver);
return ap2;

	}
	
	 private ContinueShoppingPage csp;
	 public ContinueShoppingPage getinstancecontinueshopping() {
		// TODO Auto-generated method stub
		 
		  csp = new ContinueShoppingPage(driver);
		 return csp;

	}
	 
	 private ShoppingPage_2 sp2;
	 public ShoppingPage_2 getinstanceshppingpage() {
		 sp2 = new ShoppingPage_2(driver);
		return sp2;

	}
	 
	 private Women_Page wp;
	 public Women_Page getinstance_womenpage() {
		 wp = new Women_Page(driver);
		return wp;

	}
	 
	 private Addtocart_page3 ap3;
	 public Addtocart_page3 getinstance_addtocartpage() {
		 Addtocart_page3 ap3 = new Addtocart_page3(driver);
		 return ap3;

	}
	 
	 private Proceedtocheckout_Page2 pg2;
	 public Proceedtocheckout_Page2 getinstance_proceedtocheckout() {
 pg2 = new Proceedtocheckout_Page2(driver);
return pg2;
		 
	}
	 
	private  Summary_Page2 spg2;
	public Summary_Page2 getinstancesummarys() {
 spg2 = new Summary_Page2(driver);
return spg2;
	}
	
	private Address_Page2 adrs;
	public Address_Page2 getinstanceaddres() {
		 adrs = new Address_Page2(driver);
		return adrs;

	}
	private ShippingPage shp;
	public ShippingPage getinstanceshipping() {
 shp = new ShippingPage(driver);
return shp;
		
	}
	
	private PaymentPage2 pay2;
	public PaymentPage2 getinstancepayment() {
	 pay2 = new PaymentPage2(driver);
	return pay2;

	}
	
	private OrderConfirmPage2 cnfrm;
	public OrderConfirmPage2 getinstanceorder() {
 cnfrm = new OrderConfirmPage2(driver);
return cnfrm;
	}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
