import java.util.ArrayList;

public class ProcessadorVideo {

	private ArrayList<CanalNotificacao> canais = new ArrayList<>();
	
	public void registrarCanal(CanalNotificacao canalNotificacao) {
		canais.add(canalNotificacao);
	}
	
	public void processar(Video video) {
		for(CanalNotificacao canal : canais) {
			Mensagem mensagem = new Mensagem();
			mensagem.setTexto(video.getArquivo() + " - " + video.getFormato());
			mensagem.setTipoMensagem(TipoMensagem.LOG);
			canal.notificar(mensagem);
		}
	}

	public ArrayList<CanalNotificacao> getCanais() {
		return canais;
	}

	public void setCanais(ArrayList<CanalNotificacao> canais) {
		this.canais = canais;
	}
	
	
}
