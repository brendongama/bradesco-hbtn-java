import java.util.List;

public class ManipularArrayNumeros {

	public static int buscarPosicaoNumero(List<Integer> inteiros, int numero) {

		for (int i = 0; i < inteiros.size(); i++) {
			if (numero == inteiros.get(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void adicionarNumero(List<Integer> inteiros, int numero) {
		if (buscarPosicaoNumero(inteiros, numero) != -1) {
			throw new IllegalArgumentException("Numero jah contido na lista");
		}
		inteiros.add(numero);
	}

	public static void removerNumero(List<Integer> inteiros, int numero) {
		int posicao = buscarPosicaoNumero(inteiros, numero);
		if (posicao == -1) {
			throw new IllegalArgumentException("Numero nao encontrado na lista");
		}
		inteiros.remove(posicao);
	}

	public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
		int posicao = buscarPosicaoNumero(lista, numeroSubstituir);
		if (posicao != -1) {
			lista.set(posicao, numeroSubstituto);
		} else {
			lista.add(numeroSubstituto);
		}
	}
}
