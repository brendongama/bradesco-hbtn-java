public class Eletronico {
	
	private String descricao;
	private double valor;
	
	public Eletronico(String descricao, double d) {
		super();
		this.descricao = descricao;
		this.valor = d;
	}

	@Override
	public String toString() {
		return String.format("[%s] R$ %.6f", descricao, valor);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
