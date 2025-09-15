import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

	public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
		List<Produto> resultado = new ArrayList<>();
		for (Produto produto : produtos) {
            if (criterioFiltro.testar(produto)) {
                resultado.add(produto);
            }
        }
        return resultado;
	}
}
