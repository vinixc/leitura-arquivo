package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {

	public static void main(String[] args) {
		/**
		 * FileWriter (Stream de escrita de caracteres em arquivos)
		 * 
		 * new FileWriter(path) <--- Cria/recria o arquivo.
		 * new FileWriter(path, true) <-- Acrescenta ao arquivo existente, ABRE o ARQUIVO.
		 * 
		 * BufferedWriter (Mais rapido)
		 * 
		 */
		
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good nigth"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
