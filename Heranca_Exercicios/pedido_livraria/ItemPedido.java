package pedido_livraria;

public class ItemPedido {

	private Produto produto;
	private int quantidade;	
	
	public ItemPedido(Produto produto, int quantidade) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

}
