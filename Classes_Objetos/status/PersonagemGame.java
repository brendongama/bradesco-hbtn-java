public class PersonagemGame {
	
	private int saudeAtual;
	private String nome;
	private String status;
	
	public void tomarDano(int quantidadeDeDano) {		
		saudeAtual = saudeAtual - quantidadeDeDano;
		setSaudeAtual(saudeAtual);
	}
	
	public void receberCura(int quantidadeDeCura) {		
		this.saudeAtual = this.saudeAtual + quantidadeDeCura;
		setSaudeAtual(saudeAtual);
	}
	
	
	public void setSaudeAtual(int saudeAtual) {	
		if(saudeAtual < 0) {
			saudeAtual = 0;
		}
		if(saudeAtual > 100) {
			saudeAtual = 100;
		}
		this.saudeAtual = saudeAtual;
		
		if(this.saudeAtual > 0) {
			this.status = "vivo";
		}else {
			this.status = "morto";
		}
	}
		
	public int getSaudeAtual() {
		return saudeAtual;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getStatus() {
		return status;
	}	
}