public class Gerente extends Empregado{

	public Gerente(double salarioFixo) {
		super(salarioFixo);
	}


	@Override
	public double calcularBonus(Departamento departamento) {
		if(departamento.alcancouMeta()) {
			double diferencaValor = (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
			return (this.getSalarioFixo() * 0.20) + diferencaValor;
		}
		return super.calcularBonus(departamento);
	}

}