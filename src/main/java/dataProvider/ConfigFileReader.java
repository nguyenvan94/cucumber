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
	private final String propertiesFilePath="config//Configuation.properties";
	
	
	public void ConfigFileReader() {
	try {
		FileReader fileReader= new FileReader(propertiesFilePath);
		BufferedReader reader = new BufferedReader(fileReader);
		Properties pro = new Properties();
		try {
		      properties.load(reader);
		      reader.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}catch(FileNotFoundException e ) {
		//throw new RuntimeErrorException("");
		}
	}
}
