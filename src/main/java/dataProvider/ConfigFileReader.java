package dataProvider;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

import org.omg.IOP.ExceptionDetailMessage;
public class ConfigFileReader {
 
	private Properties properties;
	private static String propertiesFilePath= System.getProperty("user.dir")+"/configs/Configuation.properties";

	public ConfigFileReader() {
		//public void ConfigFileReader() Contructor can't void => if void it must not contructor => not contructor=> null
	try {
		FileReader fileReader= new FileReader(propertiesFilePath);
		BufferedReader reader = new BufferedReader(fileReader);
		properties = new Properties();
		try {
		      properties.load(reader);
		      reader.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}catch(FileNotFoundException e ) {
		throw new RuntimeException("Configuration.properties not found at " + propertiesFilePath);
		}
	}
	public String getApplication_URL() {
		String URL = properties.getProperty("url").trim();
		if (URL != null)
			return URL;
		else
			throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:URL");

	}
}
