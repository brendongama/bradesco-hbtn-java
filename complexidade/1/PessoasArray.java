public class PessoasArray {

    private String[] nomes;
    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public void buscaLinear(String nome){
    	boolean encontrado = false;
    	int index = 0;
    	System.out.println("Procurando pelo nome: \""+nome+"\"");
    	for (String nomePessoa : nomes) {
    		System.out.println("Passando pelo indice:"+index);
			if(nomePessoa.equals(nome)) {
				encontrado = true;
				System.out.println("Nome pesquisado é "+nome+" que está na posição "+index);
			}
			index++;			
		}
    	if(!encontrado) {
    		throw new IllegalArgumentException("O nome "+nome+ " não se encontra no array de nomes");
    	}
        
    	

    }
}
