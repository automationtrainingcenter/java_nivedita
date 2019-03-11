package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		//create FileInputStream class object
		try {
			FileInputStream fis = new FileInputStream(".\\config.properties");
			//create Properties class object
			Properties prop = new Properties();
			// load the properties file object fis into the Properties class object
			prop.load(fis);
			// read the properties from file
			String url = prop.getProperty("url");
			System.out.println("url value is "+url);
			System.out.println("username is "+prop.getProperty("username"));
			System.out.println("password is "+prop.getProperty("password", "testing"));
			System.out.println("email is "+prop.getProperty("email", "surya@gmail.com"));
			//to set the properties
//			prop.setProperty(key, value):
			//save that properties file
//			prop.save(out, comments);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
