package pedido_livraria;

public class Pedido {

	private double percentualDesconto;
	private ItemPedido[] itens;
		
	public Pedido(double percentualDesconto, ItemPedido[] itens) {
		this.percentualDesconto = percentualDesconto;
		this.itens = itens;
	}
	
	public double calcularTotal() {
		double valorTotal = 0.0;
		for(ItemPedido item: itens) {
			double precoLiquido = item.getProduto().obterPrecoLiquido();
			valorTotal += precoLiquido * item.getQuantidade();
		}		
		double desconto = valorTotal * (percentualDesconto / 100.0);
        return valorTotal - desconto;
	}
	
	public double getPercentualDesconto() {
		return percentualDesconto;
	}
	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	public ItemPedido[] getItens() {
		return itens;
	}
	public void setItens(ItemPedido[] itens) {
		this.itens = itens;
	}
}
