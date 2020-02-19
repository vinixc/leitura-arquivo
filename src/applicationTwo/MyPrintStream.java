package applicationTwo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class MyPrintStream {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("UHUEHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		ps.println("------------------------------------------");
		
		ps.close();
		
		PrintWriter pw = new PrintWriter("lorem2.txt");
		pw.println("UHUEHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		pw.println("------------------------------------------");
		pw.println("-----------------#-----------------------");
		pw.close();
	}
	
}
