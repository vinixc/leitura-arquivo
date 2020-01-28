package application;

import java.io.File;
import java.io.IOException;

public class InfoCaminhoArquivo {
	public static void main(String[] args) throws IOException {
					
		System.out.println("Enter a file path: ");
		String strPath = "c:\\temp\\in.txt";
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: "+ path.getParent());
		System.out.println("getPath: "+ path.getPath());
		System.out.println("getAbsolutePath: "+ path.getAbsolutePath());
		System.out.println("getCanonicalPath: "+ path.getCanonicalPath());
		System.out.println("getFreeSpace: "+ path.getFreeSpace()); //Espa�o de bytes n alocados
		System.out.println("getTotalSpace: "+ path.getTotalSpace());//espa�o total de bytes.
		System.out.println("getUsableSpace: "+ path.getUsableSpace());
		
	}

}
