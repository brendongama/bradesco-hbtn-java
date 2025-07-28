import provedores.ProvedorFrete;

public class ProcessadorPedido {

	private ProvedorFrete provedorFrete;

	public ProcessadorPedido(ProvedorFrete provedorFrete) {
		super();
		this.setProvedorFrete(provedorFrete);
	}
	
	public void processar(Pedido pedido) {
		pedido.setFrete(provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal())); 
	}

	public ProvedorFrete getProvedorFrete() {
		return provedorFrete;
	}

	public void setProvedorFrete(ProvedorFrete provedorFrete) {
		this.provedorFrete = provedorFrete;
	}
}
