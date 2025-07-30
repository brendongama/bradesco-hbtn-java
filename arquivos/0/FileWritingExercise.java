package arquivos.zero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do arquivo (com extensão .txt): ");
		String fileName = scanner.nextLine();

		// implemente o codigo aqui
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
			System.out.println("Digite o texto ou digite 'sair' para finalizar: ");
			String textoEntrada = scanner.nextLine();
			while (!textoEntrada.isBlank()) {
				if (textoEntrada.contains("sair")) {
					break;
				} else {
					bufferedWriter.write(textoEntrada + System.lineSeparator()); // Escreve a entrada no arquivo
					textoEntrada = scanner.next();
				}
			}
			bufferedWriter.close();
			scanner.close();
			System.out.println("Arquivo " + fileName + " criado e os textos foram salvos com sucesso!");

		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
