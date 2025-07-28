package provedores;

public class Loggi implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		double percentualFrete;
		if(peso > 5000) {
			percentualFrete = 0.12;
		}else {
			percentualFrete = 0.04;
		}
		
		Frete frete = new Frete();
		frete.setValor(valor * percentualFrete);
		frete.setTipoProvedorFrete(obterTipoProvedorFrete());
		return frete;
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.LOGGI;
	}

}
