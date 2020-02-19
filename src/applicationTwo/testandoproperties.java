package applicationTwo;

import java.io.IOException;
import java.util.Properties;

public class testandoproperties {
	
	public static void main(String[] args) throws IOException {
		
		/**
		 * 
		 
		Properties prop = new Properties();
		prop.setProperty("login", "vinixc");
		prop.setProperty("senha", "vinixc123");
		prop.setProperty("url", "localhost:8080");
		
		prop.store(new FileWriter("con.properties"), "criando arquivo de propriedades");
				
		
		props.load(new FileReader("con.properties"));
		*/
		@SuppressWarnings("static-access")
		Properties props = new MyProperties(new Properties()).getProperties();
		
		System.out.println(props.getProperty("login"));
		System.out.println(props.getProperty("senha"));
		System.out.println(props.getProperty("url"));
		
		
	}

}
