import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
	
	private List<Post> postagens;

	public Blog() {
		postagens = new ArrayList<>();
	}
	
	public void adicionarPostagem(Post novaPostagem) {
		postagens.add(novaPostagem);

	}
	
	public Set<String> obterTodosAutores() {
		Set<String> autoresOrdenados = new TreeSet<>();
        for (Post postagem : postagens) {
            autoresOrdenados.add(postagem.getAutor());
        }
        return autoresOrdenados;
	}
	
	public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();
        for (Post postagem : postagens) {
            String categoria = postagem.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }

}
