package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	public Properties getProperty() throws FileNotFoundException, IOException{
		Properties properties = new Properties();
	
		try{
			
		properties.load(new FileInputStream("./src/test/resources/browser-config.properties"));
		
		}catch(Exception e){
			System.out.println("Exception "+e);
		}
		
		return properties;
	
	}
	
	
}
