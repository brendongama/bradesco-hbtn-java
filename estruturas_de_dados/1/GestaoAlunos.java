import java.util.ArrayList;

public class GestaoAlunos {

	private ArrayList<Aluno> alunos = new ArrayList<>();

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		System.out.println("Aluno " + aluno.getNome() + " cadastrado com sucesso");
	}

	public void excluirAluno(String nomeDoAluno) {
		System.out.println("Excluindo Aluno");
		Aluno aluno = buscarAluno(nomeDoAluno);
		if (aluno != null) {
			alunos.remove(aluno);
			System.out.println("Aluno "+nomeDoAluno+" Excluido com sucesso");
		}
	}

	public Aluno buscarAluno(String nomeDoAluno) {
		System.out.println("Buscando Aluno");
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equals(nomeDoAluno)) {
				System.out.println(aluno);
				return aluno;
			}
		}
		System.out.println("Aluno não encontrado");
		return null;
	}

	public void listarAlunos() {
		if (alunos.isEmpty()) {
			System.out.println("Não há alunos na lista");
		} else {
			System.out.println("Lista de alunos: ");
			for (Aluno aluno : alunos) {
				System.out.println(aluno);
			}
		}
	}

}
