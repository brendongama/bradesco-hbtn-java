package provedores;

public class Sedex implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		double percentualFrete;
		if(peso > 1000) {
			percentualFrete = 0.10;
		}else {
			percentualFrete = 0.05;
		}
		
		Frete frete = new Frete();
		frete.setValor(valor * percentualFrete);
		frete.setTipoProvedorFrete(obterTipoProvedorFrete());
		return frete;
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.SEDEX;
	}

}
