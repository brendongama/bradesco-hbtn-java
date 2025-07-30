package arquivos.um;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExercise {
	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "exemplo.txt";

		String caminho = "src\\arquivos\\um\\";
		File arquivo = new File(caminho + fileName);
		
		if (arquivo.exists()) {
			System.out.println("Conteúdo do arquivo '"+fileName+"':\n");
			try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho + fileName))) {
				String linha;
				while ((linha = bufferedReader.readLine()) != null) {
					System.out.println(linha);
				}
				System.out.println("\n");
				System.out.println("Leitura do arquivo concluída.");
			} catch (IOException e) {
				System.out.println("Erro ao ler o arquivo "+fileName+".");
			}
		} else {
			throw new FileNotFoundException("Arquivo " + fileName + " não existe");
		}

	}
}
