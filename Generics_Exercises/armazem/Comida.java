public class Comida {
	
	private String nome;
	private double calorias;
	private double preco;
	
	
	
	public Comida(String nome, int calorias, double preco) {
		super();
		this.nome = nome;
		this.calorias = calorias;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return String.format("[%s] %.6f R$ %.6f", nome, calorias, preco);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	

}
