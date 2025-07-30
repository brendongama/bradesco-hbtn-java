import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
	
	private String numeracao;
	private double saldo;
	private double taxaJurosAnual;
		
	public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
		this.numeracao = numeracao;
		this.taxaJurosAnual = taxaJurosAnual;
		this.saldo = 0.0;
	}
	
	public void depositar(double valor) throws OperacaoInvalidaException {
		if(valor > 0) {
			saldo += valor;
		}else {
			throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
		}		
	}
	
	public void sacar(double valor) throws OperacaoInvalidaException {
		if(valor <= 0) {
			throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
		}
		if(valor > saldo) {
			throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
		}
		
		saldo -= valor;
	}
	
	public double calcularTarifaMensal() {
		double tarifa = saldo * 0.10;
		double tarifaMaxima = 10.0;
		if(tarifa < tarifaMaxima) {
			return tarifa;
		}else {
			return tarifaMaxima;
		}		
	}
	
	public double calcularJurosMensal() {
		double jurosMensal = (taxaJurosAnual / 12) / 100;
		if(saldo <= 0) {
			return 0;
		}else {
			return saldo * jurosMensal;
		}				
	}

	public void aplicarAtualizacaoMensal() {
		double valorTarifa = calcularTarifaMensal();
        double jurosMensal = calcularJurosMensal();
        this.saldo = saldo - valorTarifa + jurosMensal;
	}
	
	
	public String getNumeracao() {
		return numeracao;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTaxaJurosAnual() {
		return taxaJurosAnual;
	}
}

