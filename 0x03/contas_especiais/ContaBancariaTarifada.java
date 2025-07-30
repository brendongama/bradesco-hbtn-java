import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{

	private int quantidadeTransacoes;
	double taxaDepositoSaque = 0.10;
	
	public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
		super(numeracao, taxaJurosAnual);
		this.quantidadeTransacoes = 0;
	}

	@Override
	public void sacar(double valor) throws OperacaoInvalidaException {	
		super.sacar(valor + taxaDepositoSaque);
		this.quantidadeTransacoes++;
	}
	
	@Override
	public void depositar(double valor) throws OperacaoInvalidaException {
		super.depositar(valor - taxaDepositoSaque);
		this.quantidadeTransacoes++;
	}
	
	public int getQuantidadeTransacoes() {
		return quantidadeTransacoes;
	}
}
