package applicationTwo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws IOException{
		
		OutputStream out = new FileOutputStream("lorem.txt");
		Writer wr = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(wr);
		
		bw.write("cupidatat non proident, sunt in culpa qui officia deserunt mollit anim");
		bw.newLine();
		bw.write("d est laborum.");
		bw.close();
		
	}

}
