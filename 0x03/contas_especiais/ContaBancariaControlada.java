import exceptions.OperacaoInvalidaException;

public class ContaBancariaControlada extends ContaBancariaBasica{

	private double saldoMinimo = 0;
	private double valorPenalidade = 0;
	
	public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
		super(numeracao, taxaJurosAnual);
		this.saldoMinimo = saldoMinimo;
		this.valorPenalidade = valorPenalidade;
	}
	
	@Override
	public void aplicarAtualizacaoMensal() {
		double valorTarifa = super.calcularTarifaMensal();
        double jurosMensal = super.calcularJurosMensal();
        
        if (getSaldo() <= saldoMinimo) {
            valorTarifa += valorPenalidade;
        }
        
        try {
            super.depositar(jurosMensal);
            super.sacar(valorTarifa);
        } catch (OperacaoInvalidaException e) {
            e.printStackTrace();
        }
	}
	
	
	public double getSaldoMinimo() {
		return saldoMinimo;
	}
	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}
	public double getValorPenalidade() {
		return valorPenalidade;
	}
	public void setValorPenalidade(double valorPenalidade) {
		this.valorPenalidade = valorPenalidade;
	}

}
