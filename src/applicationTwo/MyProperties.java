package applicationTwo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {
	
	static Properties properties;
	
	@SuppressWarnings("static-access")
	public MyProperties(Properties newProperties) {
		this.properties = newProperties;
	}
	
	public static void setProperties() throws IOException {
		properties.setProperty("login", "vinixc");       
		properties.setProperty("senha", "vinixc123");    
		properties.setProperty("url", "localhost:8080"); 
		properties.store(new FileWriter("con.properties"), "criando arquivo de propriedades");
	}
	
	public static Properties getProperties() throws IOException {
		setProperties();
		Properties props = new Properties();
		props.load(new FileReader("con.properties"));
		return props;
	}

}
