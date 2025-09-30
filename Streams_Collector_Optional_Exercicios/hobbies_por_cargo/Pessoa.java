public class Pessoa implements Comparable<Pessoa> {

	private int codigo;
	private String nome;
	private String cargo;
	private int idade;
	private double salario;
	private List<String> hobbies;

	public Pessoa(String nome, Integer idade, String cargo, Double salario, List<String> hobbies) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.hobbies = hobbies;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public int getIdade() {
		return idade;
	}

	public double getSalario() {
		return salario;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	@Override
	public String toString() {
		return String.format(new java.util.Locale("pt", "BR"), "[%d] %s %s %d R$ %f", codigo, nome, cargo, idade,
				salario);
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		return this.nome.compareTo(outraPessoa.nome);
	}

}