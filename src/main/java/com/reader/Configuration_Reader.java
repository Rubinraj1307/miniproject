package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenMiniProject\\src\\main\\java\\com\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
	}
	
	
	
	public String geturl() {
		 
		String url = p.getProperty("url");
return url;
	}
	
	public String getemail_address() {
		String email = p.getProperty("email_address");
		return email;

	}
	public String getpassword() {
		String password = p.getProperty("password");
		return password;

	}
	

}
