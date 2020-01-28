package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio {
	
	public static void main(String[] args) {
		
		String path = "c:\\temp\\out";
		boolean diretorioExist = false;
		
		File[] verificarOut = new File("c:\\temp\\").listFiles(File::isDirectory);
		for(File file : verificarOut) {
			if(file.getPath().equals(path)){
				diretorioExist = true;
				break;
			}
		}
		
		if(!diretorioExist) {new File(path).mkdir();}

		
		try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\produtos.txt"))){
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\summary.csv"))){
	
			String linha = br.readLine();
			while(linha != null) {
				String[] line = linha.split(",");
				bw.write(line[0] + ";" + Double.parseDouble(line[1]) * Double.parseDouble(line[2]));
				bw.newLine();
				linha = br.readLine();
			}
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
