package applicationTwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {
	
	public static void main(String[] args) throws IOException{
		
		Socket s = new Socket();
		System.out.println(s.getTcpNoDelay());
		
		InputStream input = new FileInputStream("lorem.txt");
		Reader r = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(r);
		
		OutputStream out = new FileOutputStream("lorem2.txt");
		Writer wr = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(wr);
		
		String line = br.readLine();
		while(line != null) {
			bw.write("Hello World!!! " + Math.random());
			bw.newLine();
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}
		
		br.close();
		bw.close();
	}
}
