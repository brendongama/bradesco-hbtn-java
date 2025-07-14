import java.util.*;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.getProduto().obterPrecoLiquido() 
                    * (1 - percentualDesconto / 100);
        }
        return total;
    }
    
	public void apresentarResumoPedido() {  
		double descontoDoItem = 0.0;
    	System.out.println("------- RESUMO PEDIDO -------");
    	for(ItemPedido item: itens) {
    		descontoDoItem += ((item.getQuantidade())* item.getProduto().obterPrecoLiquido()) * (percentualDesconto /100);
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", 
                item.getProduto().getClass().getSimpleName(), 
                item.getProduto().getTitulo(), 
                item.getProduto().obterPrecoLiquido(), 
                item.getQuantidade(), 
                item.getProduto().obterPrecoLiquido() * item.getQuantidade());
        }
    	System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", descontoDoItem);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", calcularTotal() + descontoDoItem);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    	
    }
}
