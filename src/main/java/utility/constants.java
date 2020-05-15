package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class constants {
	
	public static final String PropertyFile="src/test/resources/constants.properties";
	
	public static final String ApplicationURL = GetPropertyValue("ApplicationURL");
	public static final String Username = GetPropertyValue("Username");
	public static final String Password = GetPropertyValue("Password");
	
	
	
	/*Reading a property file and getting value of any property defined
	@Param PropertyName - Name of property for which you want to get value*/	
	
	public static Properties prop;
	static String PropertyValue;	
	
	public static String GetPropertyValue(String PropertyName){
		prop = AccessPropertiesFile();
		try{
				PropertyValue= prop.getProperty(PropertyName);	
			}
			catch(Exception e){
			}	
	return PropertyValue;
	}
	
	// try retrieve data from file
	public static Properties AccessPropertiesFile(){
		prop = new Properties();
		try{
			prop.load(new FileInputStream(PropertyFile));
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return prop;
	}

}
