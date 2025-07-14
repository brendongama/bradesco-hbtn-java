public class Departamento {

	private double valorMeta;
	private double valorAtingidoMeta;	
	
	public Departamento(double valorMeta, double valorAtingidoMeta) {
		super();
		this.valorMeta = valorMeta;
		this.valorAtingidoMeta = valorAtingidoMeta;
	}
	
	public boolean alcancouMeta() {
		if(valorAtingidoMeta >= valorMeta) {
			return true;
		}
		return false;
	}
	
	public double getValorMeta() {
		return valorMeta;
	}
	public double getValorAtingidoMeta() {
		return valorAtingidoMeta;
	}
}
