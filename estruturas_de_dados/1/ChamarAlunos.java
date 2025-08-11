public class ChamarAlunos {

	public static void main(String[] args) {
		GestaoAlunos gestaoAlunos = new GestaoAlunos();
		
		gestaoAlunos.adicionarAluno(new Aluno("Brendon", 29));
		gestaoAlunos.adicionarAluno(new Aluno("Thalita", 29));
		gestaoAlunos.adicionarAluno(new Aluno("Julia", 12));

		gestaoAlunos.listarAlunos();
		
		gestaoAlunos.buscarAluno("Julia");
		
		gestaoAlunos.excluirAluno("Thalita");
		
		gestaoAlunos.excluirAluno("Tania");
		 
		 gestaoAlunos.buscarAluno("Brendon");
	}
}
