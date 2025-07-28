import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
	
	private String titulo;
	private String autor;
	private double preco;
		
	public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
		super();
		if(titulo.length() < 3) {
			throw new LivroInvalidoException("Titulo de livro invalido");
		}else {
			this.titulo = titulo;
		}
		String[] palavras = autor.trim().split("\\s+");
		if (palavras.length < 2) {
			throw new AutorInvalidoException("Nome de autor invalido");
        } else {
        	this.autor = autor;
        }
		if(preco < 1) {
			throw new LivroInvalidoException("Preco de livro invalido");
		}else {
			this.preco = preco;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
