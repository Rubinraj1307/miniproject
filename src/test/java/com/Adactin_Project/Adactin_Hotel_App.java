package com.Adactin_Project;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Adactin_project.Adactin_Base;

public class Adactin_Hotel_App extends Adactin_Base {
		public static WebDriver driver;

		public static void main(String[] args) throws AWTException, IOException, InterruptedException {

			driver= get_driver("chrome");

			waiting_time(20);
 
			get_url("https://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.id("username"));
		inputboxvalue(username, "Rubinraj");
		
		WebElement password = driver.findElement(By.id("password"));
		inputboxvalue(password, "P@ssw0rd");
		
		
	WebElement login = driver.findElement(By.id("login"));
	clickbutton(login);
	
	waiting_time(10);
	
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	select(location, "byvalue", "New York");
	
	WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
	select(hotels, "byvalue", "Hotel Sunshine");
	
	WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
	select(roomtype, "byvalue", "Deluxe");
	
	WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
	select(roomnos, "byvalue", "3");
	
	WebElement checkin = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
	inputboxvalue(checkin, "14/10/2021");
	
	
	WebElement checkout = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
	inputboxvalue(checkout, "15/10/2021");
	
	WebElement adutlsroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
	select(adutlsroom, "byvalue", "2");
	
	WebElement childrensroom = driver.findElement(By.xpath("//select[@name='child_room']"));
	select(childrensroom, "byvalue", "1");
	
	
	WebElement search = driver.findElement(By.id("Submit"));
	clickbutton(search);
	
	waiting_time(5);
	
	WebElement selectbt = driver.findElement(By.xpath("//input[@type='radio']"));
	clickbutton(selectbt);
	
	WebElement continuebt = driver.findElement(By.xpath("//input[@type='submit']"));
	clickbutton(continuebt);
	
	WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	inputboxvalue(firstname, "Rubin");
	
	WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
	inputboxvalue(lastname, "raj");
	
	WebElement billingaddress = driver.findElement(By.xpath("//textarea[@name='address']"));
	inputboxvalue(billingaddress, "5a,srinivasapuram,paraniputhur,chennai");
	
	WebElement ccnumber = driver.findElement(By.xpath("//input[@name='cc_num']"));
	inputboxvalue(ccnumber, "1234123412341234");
	
	WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
	select(cctype, "byvalue", "MAST");
	
	WebElement ccmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	select(ccmonth, "byvalue", "4");
	
	WebElement ccexpyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	select(ccexpyear, "byvalue", "2022");
	
	WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	inputboxvalue(cvv, "369");
	
	WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
	clickbutton(booknow);
	}
		
		



}
