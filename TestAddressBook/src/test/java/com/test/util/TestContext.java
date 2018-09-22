package com.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestContext {

	
	public static void main(String[] args) {
		
		
		Properties prop =new Properties();
		
		try {
			FileInputStream file =new FileInputStream("src\\test\\resources\\testaddress.properties");
			
			prop.load(file);
			
			System.out.println(prop.getProperty("YserName", "TestDefault"));
			System.out.println("password");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
