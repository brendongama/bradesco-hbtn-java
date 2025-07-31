import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	public Estoque(String fileName) {
        this.produtos = carregarProdutos(fileName);
    }

	private List<Produto> produtos;


	private List<Produto> carregarProdutos(String fileName) {
        List<Produto> produtos = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length == 4) {
                    int id = Integer.parseInt(campos[0]);
                    String nome = campos[1];
                    int quantidade = Integer.parseInt(campos[2]);
                    double preco = Double.parseDouble(campos[3]);
                    produtos.add(new Produto(id, nome, quantidade, preco));
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }
        return produtos;
    }

	public void adicionarProduto(String nome, int quantidade, double preco) {
		int id = produtos.get(produtos.size() - 1).getId() + 1;
		if(produtos.isEmpty() ) {
			id = 1;
		}

		Produto produto = new Produto(id, nome, quantidade, preco);
        produtos.add(produto);
        salvarProdutos("estoque.csv");
		
	}
	
    private void salvarProdutos(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Produto produto : produtos) {
                writer.write(produto.getId() + "," + produto.getNome() + "," + produto.getQuantidade() + "," + produto.getPreco());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void excluirProduto(int idExcluir) {
		produtos.removeIf(produto -> produto.getId() == idExcluir);        
        salvarProdutos("estoque.csv");
		
	}

	public void exibirEstoque() {
		for (Produto produto : produtos) {
            System.out.println(produto);
        }		
	}

	public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
		for (Produto produto : produtos) {
            if (produto.getId() == idAtualizar) {
                produto.setQuantidade(novaQuantidade);            
                salvarProdutos("estoque.csv"); 
                return;
            }
        }		
	}
	
	
    public List<Produto> getProdutos() {
		return produtos;
	}
}
