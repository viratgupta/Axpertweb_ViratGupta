package Axpert_Operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
	
	Properties Repository= new Properties();
	
	public Properties LoadRepository() throws IOException
	{
		InputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\Objects\\objects.properties"));
		
		Repository.load(stream);
		
		return Repository;
	}

}
