public class PersonagemGame {		

	private int saudeAtual;
	private String nome;
	private String status;
	
	public PersonagemGame(int saudeAtual, String nome) {		
		super();
		this.nome = nome;
		setSaudeAtual(saudeAtual);
	}
	
	public void tomarDano(int quantidadeDeDano) {		
		saudeAtual = saudeAtual - quantidadeDeDano;
		setSaudeAtual(saudeAtual);
	}
	
	public void receberCura(int quantidadeDeCura) {		
		this.saudeAtual = this.saudeAtual + quantidadeDeCura;
		setSaudeAtual(saudeAtual);
	}
		
	public int getSaudeAtual() {
		return saudeAtual;
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
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(null != nome && "" != nome) {
			this.nome = nome;
		}
	}
	
	public String getStatus() {
		return status;
	}
	
	
}