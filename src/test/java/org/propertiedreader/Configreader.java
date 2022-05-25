package org.propertiedreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	public static void main(String[] args) throws IOException {
		try {
			String filename="./PropertiesFile/confighidden.properties";
			FileInputStream fis=new FileInputStream(filename);
			Properties prop=new Properties ();
			prop.load(fis);
			String url1=prop.getProperty("url1");
			System.out.println("URL="+url1);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public String getpropdata(String key) throws IOException {
		try {
			String filename="./PropertiesFile/confighidden.properties";
			FileInputStream fis=new FileInputStream(filename);
			Properties prop=new Properties ();
			prop.load(fis);
			String url1=prop.getProperty("url1");
			System.out.println("URL="+url1);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		return key;
		
	}
}


