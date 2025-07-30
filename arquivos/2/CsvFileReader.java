import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
	
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "funcionarios.csv";
		String caminho = "../2/";
		File arquivo = new File(caminho + fileName);
		if (arquivo.exists()) {
			try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho + fileName))) {

				String linha;
				while ((linha = bufferedReader.readLine()) != null) {
					String[] dados = linha.split(",");
					System.out.println("Funcionário: " + dados[0]);
	                System.out.println("Idade: " + dados[1]);
	                System.out.println("Departamento: " + dados[2]);
	                System.out.println("Salarial: " + dados[3]);
	                System.out.println("------------------------");
	            }

	            System.out.println("Leitura do arquivo concluída.");
			} catch (IOException e) {
				System.out.println("Erro ao ler o arquivo "+fileName+".");
			}
		} else {
			throw new FileNotFoundException("Arquivo " + fileName + " não existe");
		}
		
		
	}

}
