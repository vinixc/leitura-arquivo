package applicationTwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
	
	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("lorem.txt");
		BufferedWriter bf = new BufferedWriter(fw);
		
			bf.newLine();
			bf.newLine();
			bf.write("UEHHUEUEHUHEEUEUEUEHUE");
			bf.write("sdfghjkjhgfds");
			bf.newLine();
			bf.write("sauhsuashsu" + System.lineSeparator());
			
			bf.close();
		
	}

}
