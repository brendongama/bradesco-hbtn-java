package provedores;

public class JadLog implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		double percentualFrete;
		if(peso > 2000) {
			percentualFrete = 0.07;
		}else {
			percentualFrete = 0.045;
		}
		
		Frete frete = new Frete();
		frete.setValor(valor * percentualFrete);
		frete.setTipoProvedorFrete(obterTipoProvedorFrete());
		return frete;
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.JADLOG;
	}

}
