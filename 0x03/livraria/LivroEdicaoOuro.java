import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro{

	public LivroEdicaoOuro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
		super(titulo, autor, preco);
	}

	@Override
	public double getPreco() {		
		return super.getPreco() + (super.getPreco() * 0.30);
	}

}
