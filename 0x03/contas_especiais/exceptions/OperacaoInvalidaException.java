package exceptions;

public class OperacaoInvalidaException extends Exception{

	private static final long serialVersionUID = 1L;

	public OperacaoInvalidaException(String mensagem) {
		super(mensagem);
	}
	
}
